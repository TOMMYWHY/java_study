package leetcode.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class L206ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode pre = null;

        while (head != null){
            next = head.next;

            head.next= pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode reverseList00(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;


        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur=tmp;

        }



        return  pre;
    }
}
