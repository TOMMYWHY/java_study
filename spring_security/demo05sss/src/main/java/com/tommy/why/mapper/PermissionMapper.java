package com.tommy.why.mapper;

import com.tommy.why.entity.PermissionEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper {
    @Select(" select * from sys_permission ")
    List<PermissionEntity> findAllPermission();
}
