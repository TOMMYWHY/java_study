package interviews.I00Study;

public class MySingleton {
    //todo hungry
   /* private static final MySingleton mySingleton = new MySingleton();
    private MySingleton() {
    }
    public static MySingleton getInstance(){
        return mySingleton;
    }*/

    //todo lazy
    private static MySingleton mySingleton;
    private MySingleton() {
    }
    public static MySingleton getInstance(){
        if(mySingleton == null){
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}
