package classLoaderDemo.classLoader;

import java.lang.String;
import org.junit.jupiter.api.Test;

public class ClassLoaderTest {

    @Test
    public void test01(){
        String string = new String();
        System.out.println(string.getClass());
        System.out.println(string.getClass().getName());
        System.out.println(string.getClass().getClassLoader());//null


        Student student = new Student();
        System.out.println(student.getClass());
        System.out.println(student.getClass().getName());
        System.out.println(student.getClass().getClassLoader());//Launcher$AppClassLoader
        System.out.println(student.getClass().getClassLoader().getParent());//Launcher$ExtClassLoader
    }


}
