package hurrySingleton;

public class SingletonDemo1 {

    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance(){
        return instance;
    }
}

class PracticeSingletonDemo1{
    private static PracticeSingletonDemo1 INSTANCE = new PracticeSingletonDemo1();
    public PracticeSingletonDemo1() {
    }
    public static PracticeSingletonDemo1 getInstance(){
        return INSTANCE;
    }
}