package leetcode.linkedList;

import org.junit.Test;

public class ListNode {
    String data;
    ListNode next;

    public ListNode(String data) {
        this.data = data;
    }

    public static ListNode arrayToListNode(String [] arr){
        if(arr.length==0)return null;

        ListNode root = new ListNode(arr[0]);

        ListNode pre =root;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            pre.next = node;
            pre = node;
        }

        return  root;
    }

    public static void main(String[] args) {
        String arr[] = {"a","b","c","d"};
        ListNode listNode = ListNode.arrayToListNode(arr);
        System.out.println("111");
    }


}

