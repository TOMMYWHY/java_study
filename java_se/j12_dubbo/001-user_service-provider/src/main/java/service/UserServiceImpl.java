package service;

import model.User;

public class UserServiceImpl implements UserService {


    @Override
    public User queryUserById(Integer id) {

        User user = new User();
        user.setId(1001);
        user.setName("tommy");


        return user;
    }
}
