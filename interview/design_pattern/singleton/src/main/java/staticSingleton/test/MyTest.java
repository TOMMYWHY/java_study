package staticSingleton.test;

import org.junit.jupiter.api.Test;
import staticSingleton.Singleton2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyTest {
    @Test
    public void test01(){
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);

        try {
            Class.forName("staticSingleton.Singleton2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test02() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Singleton2.class;
        System.out.println("clazz:"+ clazz);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton2 s1 = Singleton2.getInstance();
//        Singleton2 s2 = (Singleton2) constructor.newInstance();
        System.out.println("s1:"+s1);

//        System.out.println("s2:"+s2);
//        System.out.println(s1 == s2);
    }
}
