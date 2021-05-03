package com.tommy.why.mapper;

import com.tommy.why.pojo.User;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface UserMapper {
    @Insert("INSERT INTO user(email,password,salt,confirm_code,activation_time,is_valid)  " +
            "VALUE (#{email},#{password},#{salt},#{confirmCode},#{activationTime},#{isValid}) ")
    int insertUser(User user);

    @Select("SELECT email,activation_time FROM user WHERE confirm_code=#{confirmCode} AND is_valid=0")
    User selectUserByConfirmCode(@Param("confirmCode") String confirmCode);

    @Update("UPDATE user SET is_valid=1   WHERE confirm_code =#{confirmCode}")
    int updateUserByConfirmCode(@Param("confirmCode") String confirmCode);


    @Select("SELECT email, password,salt FROM user WHERE email = #{email} and is_valid=1")
    List<User> selectUserByEmail(@Param("email") String email);
}
