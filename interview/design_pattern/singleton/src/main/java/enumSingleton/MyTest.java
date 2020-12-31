package enumSingleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class MyTest {
    @Test
    public void test01(){
        Singleton3 s1 = Singleton3.INSTANCE;
        Singleton3 s2 = Singleton3.INSTANCE;

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void test02() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class clazz = Singleton3.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 s1 = (Singleton3)clazz.newInstance();

    }
}
