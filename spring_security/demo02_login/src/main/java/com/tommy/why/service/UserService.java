package com.tommy.why.service;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.tommy.why.mapper.UserMapper;
import com.tommy.why.pojo.User;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Resource
    private  UserMapper userMapper;
    @Resource
    private  MailService mailService;
    @Transactional
    public Map<String,Object> createAccount(User user){
        String confirmCode = IdUtil.getSnowflake(1,1).nextIdStr();
        String salt = RandomUtil.randomString(6);
        String md5Pwd = SecureUtil.md5( user.getPassword()+salt);
        LocalDateTime ldt = LocalDateTime.now().plusDays(1);
        user.setSalt(salt);
        user.setPassword(md5Pwd);
        user.setConfirmCode(confirmCode);
        user.setActivationTime(ldt);
        user.setIsValid((byte)0);
        int result = userMapper.insertUser(user);
        Map<String,Object> resultMap = new HashMap<>();
        if(result>0){
            String activationUrl = "http://localhost:8080/user/activation?confirmCode="+confirmCode;
            mailService.sendMailForActivationAccount(activationUrl, user.getEmail());
            resultMap.put("code",200);
            resultMap.put("msg","register success~!");
        }else{
            resultMap.put("code",400);
            resultMap.put("msg","register fail~!");
        }
        return resultMap;
    }

    public Map<String,Object> loginAccount(User user){
        Map<String,Object> resultMap = new HashMap<>();
        // step 1 check email
        List<User> userList = userMapper.selectUserByEmail(user.getEmail());
        if(userList==null || userList.isEmpty()){
            resultMap.put("code",400);
            resultMap.put("msg","account not exist or invalidate~！");
            return  resultMap;
        }
        // step 2 duplicate emails return err
        if(userList.size()>1){
            resultMap.put("code",400);
            resultMap.put("msg","account has issue~！");
            return  resultMap;
        }
        // step 3 check password
        User u = userList.get(0);
        String md5Pwd = SecureUtil.md5(user.getPassword() + u.getSalt());
        if(!u.getPassword().equals(md5Pwd)){
            resultMap.put("code",400);
            resultMap.put("msg","account not exist~！");
            return  resultMap;
        }

        resultMap.put("code",200);
        resultMap.put("msg","login successful~！");
        return  resultMap;
    }

    public Map<String, Object> activationAccount(String confirmCode) {
        Map<String,Object> resultMap = new HashMap<>();
        User user = userMapper.selectUserByConfirmCode(confirmCode);
        boolean after  = LocalDateTime.now().isAfter(user.getActivationTime());
        if(after){
            resultMap.put("code",400);
            resultMap.put("msg","Link invalidate");
            return resultMap;
        }

        int result = userMapper.updateUserByConfirmCode(confirmCode);
        if (result>0){
            resultMap.put("code",200);
            resultMap.put("msg","account activated~！");
        }else {
            resultMap.put("code",400);
            resultMap.put("msg","activate fail");
        }
        return resultMap;
    }
}
