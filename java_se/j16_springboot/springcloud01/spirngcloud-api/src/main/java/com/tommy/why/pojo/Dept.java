package com.tommy.why.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String deptme;
    private String db_source;

    public Dept(String deptme) {
        this.deptme = deptme;
    }

}
