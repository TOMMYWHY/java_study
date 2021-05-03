package com.tommy.why.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String email;
    private String password;
    private String salt;
    private String confirmCode;
    private LocalDateTime activationTime ;
    private Byte isValid;

}
