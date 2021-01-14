package staticSingleton;
/*
* best way
* 当只加载Singleton2类时，SingletonHolder并未被加载。
* 调用getInstance时，SingletonHolder加载，创建实例。
* */
public class Singleton2 {

    private static class SingletonHolder{
        private static Singleton2 instance = new Singleton2();
    }

    private Singleton2() {
        System.out.println("Singleton2...");
        if (SingletonHolder.instance!=null){
            throw new IllegalStateException();
        }
    }
    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }
}
