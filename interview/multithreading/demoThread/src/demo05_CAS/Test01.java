package demo05_CAS;


public class Test01 {
    public static void main(String[] args) {
        CAS_counter cas_counter = new CAS_counter();
        for (int i = 0; i < 1000; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ " : "+  cas_counter.incrementAndGet());
                }
            }).start();
        }
    }
}

class CAS_counter{

    volatile private  long value;

    public long getValue() {
        return value;
    }

    private boolean compare_and_swap(long expectedValue, long newValue){
        synchronized (this){
            if (value == expectedValue){
                this.value = newValue;
                return true;
            }else{
                return false;
            }
        }
    }

    public long incrementAndGet(){
        long oldValue;
        long newValue;
        do{
            oldValue = value;
            newValue = oldValue + 1;
        }while (!compare_and_swap(oldValue,newValue)); // 比较两个值，如果不同则继续比较。当比较结果一致，则返回更新的值

        return  value;
    }
}

