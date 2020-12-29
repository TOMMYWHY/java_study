package com.tommy.why.service;

import com.tommy.why.dao.UserDao;

public class UserService {
    private  UserDao userDao = null;

    public void setUserDaoo(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        System.out.println("UserService....");
        userDao.test();


    }
}
