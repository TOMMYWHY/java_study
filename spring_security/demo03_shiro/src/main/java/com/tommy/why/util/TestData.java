package com.tommy.why.util;

import com.tommy.why.bean.UserBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class TestData {
    private List<UserBean> allUsers;
    public  List<UserBean> getAllUsers(){
        if(null==allUsers ){
            allUsers = new ArrayList<>();
            allUsers.add(new UserBean("admin","admin",
                    Arrays.asList("admin"),Arrays.asList("mobile","salary")));


            allUsers.add(new UserBean("manager","manager",
                    Arrays.asList("manager"),Arrays.asList("salary")));

            allUsers.add(new UserBean("worker","worker",
                    Arrays.asList("worker"),Arrays.asList("")));
        }
        return allUsers;
    }
}
