package leetcode.linkedList;

import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class L141LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null){ return false;}

        ListNode slow = head;
        ListNode fast = head;
        while (true){
            if(fast ==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){return true;}
        }

//        return false;
    }

    public static void hasCycle(ListNode node, int pos) {

        int cnt = 0;
        ListNode cycleNode= null;
        while (true){
            if(cnt == pos){
                cycleNode = node;
            }
            if(node.next == null){
                node.next = cycleNode;
                return;
            }
            node = node.next;
            cnt ++;
        }
    }


    /*142*/
    public ListNode detectCycle(ListNode head) {

        return null;
    }
}
