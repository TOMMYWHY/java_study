package com.tommy.why.config;


import com.tommy.why.entity.PermissionEntity;
import com.tommy.why.filter.JWTLoginFilter;
import com.tommy.why.filter.JWTValidationFilter;
import com.tommy.why.mapper.PermissionMapper;
import com.tommy.why.service.MemberUserDetailsService;
import com.tommy.why.utils.MD5Util;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MemberUserDetailsService memberUserDetailsService;
    @Autowired
    private PermissionMapper permissionMapper;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // 设置用户账号信息和权限
//        auth.inMemoryAuthentication().withUser("mayikt_admin").password("mayikt")
//                .authorities("addMember", "delMember", "updateMember", "showMember");
//        // 如果mayikt_admin账户权限的情况 所有的接口都可以访问，如果mayikt_add 只能访问addMember
//        auth.inMemoryAuthentication().withUser("mayikt_add").password("mayikt")
//                .authorities("addMember");
        auth.userDetailsService(memberUserDetailsService).passwordEncoder(new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {
                return MD5Util.encode((String) rawPassword);
            }

            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                String rawPass = MD5Util.encode((String) rawPassword);
                boolean result = rawPass.equals(encodedPassword);
                return result;
            }
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        List<PermissionEntity> allPermission = permissionMapper.findAllPermission();
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry expressionInterceptUrlRegistry = http.authorizeRequests();
        allPermission.forEach((permission)->{
            expressionInterceptUrlRegistry.antMatchers(permission.getUrl()).hasAnyAuthority(permission.getPermTag());
        });

//        http.authorizeRequests()
//                .antMatchers("/addMember").hasAnyAuthority("addNumber")
//                .antMatchers("/delMember").hasAnyAuthority("delNumber")
//                .antMatchers("/updateMember").hasAnyAuthority("updateNumber")
//                .antMatchers("/showMember").hasAnyAuthority("showNumber")
        expressionInterceptUrlRegistry.antMatchers("/auth/login").permitAll()
                .antMatchers("/**").fullyAuthenticated()
                .and().addFilter(new JWTValidationFilter(authenticationManager()))
                .addFilter(new JWTLoginFilter(authenticationManager())).csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//                .and().formLogin().loginPage("/login").and().csrf().disable();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

}
