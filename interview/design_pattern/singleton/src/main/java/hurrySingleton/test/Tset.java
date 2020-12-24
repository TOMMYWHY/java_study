package hurrySingleton.test;

import hurrySingleton.SingletonDemo1;
import org.junit.jupiter.api.Test;

public class Tset {
    @Test
    public void  test1(){
        SingletonDemo1 s1 = SingletonDemo1.getInstence();
        SingletonDemo1 s2 = SingletonDemo1.getInstence();

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
                        System.out.println(SingletonDemo1.getInstence());
                    }
                }).start();
        }
    }
}
