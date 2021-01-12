package com.tommy.why.annotation;

import com.tommy.why.entity.User;
import org.junit.jupiter.api.Test;

public class MyAnnTest {

    @Test
    public void test(){
        Class<User> userClass = User.class;
        MyAnn myAnn = userClass.getAnnotation(MyAnn.class);
        if(myAnn != null){
            System.out.println(myAnn.content()+"："+ myAnn.num());
        }
    }
}
