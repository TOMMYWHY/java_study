package arrays;

import org.junit.Test;

import java.util.*;

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

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        System.out.println(set);

        for(int i = 1 ; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public List<Integer> findDisappearedNumbers1(int[] nums) {
         List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index = num -1;
            if(nums[index] > 0){
                nums[index] = - nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if( nums[i]>0){
                result.add(i+1);
            }

        }
        return result;
    }

    @Test
    public void test_findDisappearedNumbers(){
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers1(nums));
    }

    @Test
    public void test_findRepeatNumber(){
        int [] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}

