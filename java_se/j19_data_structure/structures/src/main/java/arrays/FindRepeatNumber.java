package arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
* 剑指 Offer 03. 数组中重复的数字
*
*
* 使用set 不重复
* */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return  -1;
    }

    public int findRepeatNumber1(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums){
        int[]temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(temp[num]!=0){
                return num;
            }
            temp[num] = 1;

        }
        return -1;
    }


    @Test
    public void test(){
        int [] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}

