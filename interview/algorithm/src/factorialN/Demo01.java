package factorialN;

import javax.xml.bind.ValidationException;

public class Demo01 {
    public static void main(String[] args) throws ValidationException {

        int i = getResult(4);
        System.out.println(i);
    }

    private static int getResult(int n) throws ValidationException {

        if (n < 0) {
            throw new ValidationException("invalid N");
        }
        else if(n == 1 || n == 0){
            return 1;
        }

        return n* getResult(n-1) ;
    }
}


