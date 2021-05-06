package com.tommy.why.config;


import lombok.NoArgsConstructor;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("tommy").password("123").authorities("addNumber","showNumber");
        auth.inMemoryAuthentication().withUser("admin").password("123")
                .authorities("addNumber","delNumber","updateNumber","showNumber");

    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/add").hasAnyAuthority("addNumber")
                .antMatchers("/del").hasAnyAuthority("delNumber")
                .antMatchers("/update").hasAnyAuthority("updateNumber")
                .antMatchers("/show").hasAnyAuthority("showNumber")
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .usernameParameter("username")
//                .passwordParameter("password").loginProcessingUrl("/login") .defaultSuccessUrl("/")
//                .and().csrf().disable();
//        ;
                .antMatchers( "/login").permitAll()
                .antMatchers("/**").fullyAuthenticated().and().formLogin().loginPage("/login").and().csrf().disable();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder(){

        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
