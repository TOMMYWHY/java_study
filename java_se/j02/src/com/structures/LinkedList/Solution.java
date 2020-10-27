package com.structures.LinkedList;

import java.util.LinkedList;
/*
* leetcode
* 2. Add Two Numbers
 * */
public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println(addTwoNumbers(l1,l2));
    }
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> dummy = new LinkedList<>();
        LinkedList<Integer> curr = dummy;
        int carry = 0;
        int i = 0;
        while(l1.size()>0 || l2.size()>0){
            int sum = 0;
            if(l1!=null){
//                System.out.println(l1.peek());
                sum+= (int)l1.peek();
                l1.removeFirst();
            }
            if(l2!=null){
                sum+=l2.getFirst();
                l2.removeFirst();
            }
            sum +=carry;
            curr.add(sum%10);
            carry = (sum/10);
        }
        if(carry>0){
            curr.add(carry);
        }
        return dummy;
    }
}
