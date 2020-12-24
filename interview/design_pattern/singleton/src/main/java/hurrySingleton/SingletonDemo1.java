package hurrySingleton;

public class SingletonDemo1 {

    private static SingletonDemo1 instence = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstence(){
        return instence;
    }
}
