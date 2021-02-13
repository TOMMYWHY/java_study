package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(1); //满了不会报异常，返回false

        /*check*/
        queue.peek();//空了不会报异常，返回null
        queue.element();//

        /*get*/
        queue.poll();//空了不会报异常，返回null
        queue.remove();
    }
}
