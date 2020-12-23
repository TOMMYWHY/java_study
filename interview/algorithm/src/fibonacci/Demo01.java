package fibonacci;

public class Demo01 {
    public static void main(String[] args) {
        int i = getFibonacci(4);
        System.out.println(i);

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);

    }
    public static int getFibonacci (int n){
        if(n<0){
            return  -1;
        }

        if(n == 1 || n == 2){
            return 1;
        }
        return getFibonacci(n -1) + getFibonacci( n - 2);
    }
}
