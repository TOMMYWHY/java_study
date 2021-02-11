package com.tommy.why;

import com.tommy.why.entity.User;
import com.tommy.why.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public  class MpDemo01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }

    @Test
    public void addUser(){
        User user = new User();
        user.setName("oooooxx");
        user.setAge(18);
        user.setEmail("tommywhy1989@gmail.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

}
