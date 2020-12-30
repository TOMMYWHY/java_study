package com.tommy.why.service;

import com.tommy.why.dao.UserDao;
import com.tommy.why.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = null;
//    private UserDao userDao = new UserDaoImpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
