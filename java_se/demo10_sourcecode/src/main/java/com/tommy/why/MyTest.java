package com.tommy.why;

import com.tommy.why.controller.UserController;
import com.tommy.why.entity.User;
import com.tommy.why.service.UserService;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class MyTest {
    @Test
    public void test() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
//        System.out.println(clazz);
        UserService userServiceaa = new UserService();
        System.out.println(userServiceaa);

        Field userService1 = clazz.getDeclaredField("userService");
        userService1.setAccessible(true);
        System.out.println(userService1);
        String name = userService1.getName();
        System.out.println(name);
        name = name.substring(0,1).toUpperCase()+name.substring(1,name.length());
        System.out.println(name);
        String setMethodName = "set"+ name;
        Method method = clazz.getMethod(setMethodName, UserService.class);
        method.invoke(userController,userServiceaa);
        System.out.println(userController.getUserService());
    }

    @Test
    public void test02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        UserController userController = new UserController();
        Class<UserController> userControllerClass = UserController.class;
        System.out.println(userControllerClass.getSimpleName());

        Class<?> aClass = Class.forName("com.tommy.why.entity.User");

        Method eatMethod = aClass.getMethod("eat");
        System.out.println(eatMethod);
        User o = (User) aClass.newInstance();
        eatMethod.invoke(o);
    }

    @Test
    public void test03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        invokeAny()
        Properties properties = new Properties();
        invokeAny(properties,"setProperty",new Class[] {String.class,String.class},"username","tommy");
//        System.out.println(properties);
    }
    public static Object invokeAny(Object obj, String methodName,Class<?>[] types, Object...args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Method method = aClass.getMethod(methodName, types);
        return method.invoke(obj, args);
    }
}
