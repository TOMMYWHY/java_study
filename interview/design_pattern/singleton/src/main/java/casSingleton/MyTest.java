package casSingleton;

import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void test01(){
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton7.getInstance());
                }
            }).start();
        }
    }
}
