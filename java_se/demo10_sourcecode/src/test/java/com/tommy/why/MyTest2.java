package com.tommy.why;

import com.tommy.why.controller.UserController;
import com.tommy.why.service.UserService;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class MyTest2 {
    @Test
    public void testAnnotation(){
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
//        UserService userService = new UserService();

        //todo
        Stream.of(clazz.getDeclaredFields()).forEach(field->{
            String name = field.getName();
            MyAutoWired annotation = field.getAnnotation(MyAutoWired.class);
            if(annotation != null){
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    Object o = type.newInstance();
                    field.set(userController,o);

                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());

    }
}
