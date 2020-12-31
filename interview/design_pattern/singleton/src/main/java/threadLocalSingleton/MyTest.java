package threadLocalSingleton;

import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void test01(){
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void test02(){
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton6 s1 = Singleton6.getInstance();
                    Singleton6 s2 = Singleton6.getInstance();
                    System.out.println( Thread.currentThread().getName() + "->" + (s1 == s2) +  " ; " + s1 );
                }
            }).start();
        }
    }
}
