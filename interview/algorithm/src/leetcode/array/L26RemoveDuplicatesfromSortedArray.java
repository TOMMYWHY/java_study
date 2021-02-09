package leetcode.array;

public class L26RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums){
        int index= 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];

            }


        }


        return index +1;
    }
}
