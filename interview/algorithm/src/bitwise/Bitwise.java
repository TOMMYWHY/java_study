package bitwise;

public class Bitwise {

    public static void main(String[] args) {
        int a = 17;
        int b = -1291;
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
