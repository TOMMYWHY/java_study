package com.structures.ArrayList;


import java.util.ArrayList;
import java.util.Iterator;

/*
* ArrayList
* 查询快，增删慢
* add : i-size
* remove : i - size -1
* 1、Vector是线程安全的，ArrayList不是线程安全的。
* 2、ArrayList在底层数组不够用时在原来的基础上扩展0.5倍，Vector是扩展1倍。
*
* 和ArrayList和Vector一样，同样的类似关系的类还有HashMap和HashTable，StringBuilder和StringBuffer，后者是前者线程安全版本的实现。
* */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");

        // 通过Iterator遍历ArrayList
        for (Iterator iter = arr.iterator(); iter.hasNext();){
            System.out.println("---"+iter.next());
//            System.out.println("arr:"+iter);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        System.out.println("get:"+arr.get(1));
        System.out.println("set:"+arr.set(2,"cc"));
        System.out.println("remove:"+arr.remove(0));

        // 将ArrayList转换为数组
        String[] arr_str = (String[])arr.toArray(new String[0]);
        //for each
        for(String str:arr_str){
            System.out.println("str:"+ str);
        }

        System.out.println(arr.toString());
        System.out.println("Prime Numbers: " + arr);//toString

    }
}
