package leetcode.array;

public class L27RemoveElement {
    public int removeElement1(int[] nums, int val) {
       int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(val != nums[i]){
                nums[index] = nums[i];
                index ++;
            }
        }
       return index;
    }


    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    /*
    * 删除元素，返回长度。原数组顺序打乱无所谓。
    * */
    public int removeElement(int[] nums, int val) {

        int index =0;
        int len = nums.length;
        while (index < len){
//            if(index >=len){}
            if(nums[index] == val){
                nums[index] = nums[len-1];
                len--;
                index --;
            }
            index++;
        }

        return  len;
    }
}


