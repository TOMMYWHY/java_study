package com.tommy.why.service;

import com.tommy.why.bean.UserBean;
import com.tommy.why.util.TestData;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Resource
    TestData testData;
    public UserBean queryUserByName(String username){
        UserBean userBean = new UserBean();
        List<Object> queryUsers=testData.getAllUsers().stream()
                .filter(user->username.equals(user.getUserName()))
                .collect(Collectors.toList());
        if(null != queryUsers && queryUsers.size()>0){
            try {
                userBean = (UserBean) BeanUtils.cloneBean(queryUsers.get(0));
                return userBean;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;

    }
}
