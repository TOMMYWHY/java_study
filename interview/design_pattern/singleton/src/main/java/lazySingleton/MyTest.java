package lazySingleton;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MyTest {

    @Test
    public void test01(){
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void test02() throws IOException {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton4.getInstance()+ "："+ Singleton4.getInstance().hashCode());

                }
            }).start();
        }

        System.in.read();
    }
}
