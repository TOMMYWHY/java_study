package threadLocalSingleton;


public class Singleton6 {
//    private static Singleton6 instance = null;

    private Singleton6(){}

    private static final ThreadLocal<Singleton6> threadLocalSingleton = new ThreadLocal<Singleton6>(){
        @Override
        protected Singleton6 initialValue() {
            return new Singleton6();
        }
    };

    public static Singleton6 getInstance(){
        return threadLocalSingleton.get();
    }

}
