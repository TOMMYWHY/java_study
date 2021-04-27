package interviews.xero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* xero 算法题
* 统计 每个部门 喝多少coffee
* 输出 部门，均值，总值
* */

public class Test {

    public static void main(String[] args) {
        List<String> office_state_list = Arrays.asList(
                "AA","monday","11",
                "AA","tuesday","22",
                "AA","wednesday","33",
                "AA","thursday","44",
                "AA","friday","55",

                "BB","monday","111",
                "BB","tuesday","222",
                "BB","wednesday","333",
                "BB","thursday","444",
                "BB","friday","555",

                "CC","monday","1111",
                "CC","tuesday","2222",
                "CC","wednesday","3333",
                "CC","thursday","4444",
                "CC","friday","5555"

        );

        ArrayList<String> city = new ArrayList<>();
//        ArrayList<String> days = new ArrayList<>();
        ArrayList<Integer> cups = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < office_state_list.size(); i++) {
            if(i%3==0){
                city.add(office_state_list.get(i));
            }else if(i%3==1){
//                days.add(office_state_list.get(i));
            }else {
                cups.add(Integer.parseInt(office_state_list.get(i))) ;
            }
        }

        int sum =0, count = 0, average=0;

        for (int i = 0; i < cups.size()-1; i++) {
            if(city.get(i).equals(city.get(i + 1))){
                sum =  sum+ cups.get(i);
                count++;
            }else {
                average = (int)sum/count;
                result.add(city.get(i));
                result.add(""+average);
//                System.out.println(sum);
                result.add(""+sum);
                sum = 0;
                count = 0;
            }
        }

        System.out.println(result);

    }
}
