package casSingleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton7 {
    private Singleton7() {
        System.out.println("Singleton7..");
    }
    private static final AtomicReference<Singleton7> instance = new AtomicReference<>();

    public static final Singleton7 getInstance(){
        while (true) {

            Singleton7 current = instance.get();
            if(current != null){return current;}
            current = new Singleton7();

            if(instance.compareAndSet(null,current)){
                return current;
            }

        }
//        return current;
    }
}
