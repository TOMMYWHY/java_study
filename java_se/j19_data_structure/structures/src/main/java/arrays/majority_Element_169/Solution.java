package arrays.majority_Element_169;


/*
* 1. Map <值，次数>
* */

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int halfLen = nums.length/2;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 1; //初始化
            if(map.containsKey(num)){
                count = map.get(num); // 获取map中原有的count
                count++;
            }

            if(count > halfLen){
                return num;
            }
            map.put(num,count);
        }
        return -1;
    }
    public int majorityElement1(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int halfLen = nums.length/2;
        return  nums[halfLen];
    }


    @Test
    public void test_majorityElement(){
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    @Test
    public void test_majorityElement1(){
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement1(nums));
    }
}
