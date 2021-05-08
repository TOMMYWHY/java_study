package com.tommy.why;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.web.PortResolverImpl;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@SpringBootTest
class Demo05sssApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test01(){
        String SIGN_KEY="tommy";
        LocalDateTime ldt = LocalDateTime.now().plusDays(1);
        Date date = Date.from( ldt.atZone( ZoneId.systemDefault()).toInstant());

        JwtBuilder jwtBuilder = Jwts.builder().claim("phone","123456").signWith(SignatureAlgorithm.HS256,SIGN_KEY)
                .setExpiration(date);
        System.out.println(">>>>>"+jwtBuilder.compact());

    }

    @Test
    public void  test02(){
        JwtBuilder jwtBuilder = Jwts.builder().setId("66").setSubject("tommy").setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "key");
        System.out.println(">>>>>"+jwtBuilder.compact());

    }

}
