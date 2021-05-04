package com.tommy.why.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {
    private String userName;
    private String userPass;
    private List<String> userRoles;
    private List<String>  userPerms;

}
