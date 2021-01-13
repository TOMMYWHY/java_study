package hurrySingleton.test;

import hurrySingleton.SingletonDemo1;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Tset {
    @Test
    public void  test1(){
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void test2(){
        for (int i = 0; i < 10; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(SingletonDemo1.getInstance());
                    }
                }).start();
        }
    }

    @Test
    public void test03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = SingletonDemo1.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = (SingletonDemo1) constructor.newInstance();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);
    }
}
