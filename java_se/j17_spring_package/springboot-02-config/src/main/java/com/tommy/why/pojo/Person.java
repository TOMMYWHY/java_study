package com.tommy.why.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@ConfigurationProperties(prefix = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private List<String> interests;
    private Map<String, Object> score;
    private Set<Double> salary;

}
