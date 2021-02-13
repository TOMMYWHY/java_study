package leetcode.eor;

/*
* 异或
* */
public class EventTimesOddTimes {
    public static void  printEventTimesOddTimesNum1(int[] arr){
        int eor=0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }


}
