package com.tommy.why.mapper;

import com.tommy.why.entity.PermissionEntity;
import com.tommy.why.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    @Select("select * from sys_user where username=#{userName} ")
    UserEntity findByUsername(@Param("userName")String userName);

    @Select(
            "select permission.* from sys_user as user  inner join sys_user_role as user_role on user.id = user_role.user_id\n" +
            "inner join sys_role_permission as role_permission on user_role.role_id = role_permission.role_id\n" +
            "inner join sys_permission as permission on role_permission.perm_id = permission.id \n" +
            "where user.username=#{userName} ")
    List<PermissionEntity> findPermissionByUsername(@Param("userName")String userName);
}
