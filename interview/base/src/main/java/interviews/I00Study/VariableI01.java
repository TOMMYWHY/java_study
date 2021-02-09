package interviews.I00Study;

import org.junit.jupiter.api.Test;

public class VariableI01 {
    @Test
    public void test01(){
        int i= 1;
        i = i++; //todo 此时i=1 自增是在局部变量表中完成，赋值是从操作数栈 复制到局部变量表。
        System.out.println("---i"+i);
        int j = i++; // j = 1; i = 2
        System.out.println("---i"+i);
        System.out.println("---j"+j);

        int k = i+ ++i * i++; //  2 + 3 * 3 //i=4
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
