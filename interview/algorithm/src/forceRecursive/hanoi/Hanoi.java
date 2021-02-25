package forceRecursive.hanoi;

//Tower of Hanoi

public class Hanoi {
    public static void hanoi(int n){
        if(n>0){
            fun(n,"L","R","M");
        }
    }

    public static void fun(int i, String start,String end,String other){
        if(i==1){
            System.out.println("move 1 from " + start +   " to " + end);

        }else{
            fun(i-1,start,other,end);
            System.out.println("move " + i + " from " + start + " to " + end);
            fun(i-1,other,end,start);
        }
    }

    public static void main(String[] args) {
        int n=3;
        hanoi(n);
    }
}
