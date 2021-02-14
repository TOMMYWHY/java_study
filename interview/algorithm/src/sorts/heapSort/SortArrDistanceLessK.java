package sorts.heapSort;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
* 几乎有序数组，排序后移动距离不超过k
* */
public class SortArrDistanceLessK {
    @Test
    public void test(){
        int[] arr = {7,3,2,8,1,9,5,4,6,0};
        sortedArrDistanceLessK(arr,4);
        System.out.println(Arrays.toString(arr));
    }

    public void sortedArrDistanceLessK(int[]arr,int k){
        /*默认小顶堆*/
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for ( ; index <= Math.min(arr.length, k);index ++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for ( ; index < arr.length; i ++ ,index ++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()){
            arr[i++] = heap.poll();
        }
    }

    @Test
    public void treeMin(){
        /*小顶堆*/
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(8);
        heap.add(2);
        heap.add(1);
        heap.add(5);
        heap.add(11);
        while (!heap.isEmpty()){
            System.out.println(heap.poll());
        }
    }

}
