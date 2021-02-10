package leetcode.linkedList;

import java.util.List;

/*
* https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 */
public class Offer22_lastK {
  public static class ListNode{
      int val;
      ListNode next;
      ListNode(int x ){val=x;}
  }

  /*遍历两次*/
  public ListNode getKthFromEnd(ListNode head, int k){

      int n = 0;
      ListNode tmp = head;

      while (tmp.next!=null){
          n++;
          tmp = tmp.next;
      }
      tmp = head;
      for (int i = 0; i < n-k+1; i++) {
          tmp = tmp.next;
      }

      return tmp;
  }
  /*遍历一次*/
    public ListNode getKthFromEnd1(ListNode head, int k){

        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k-1; i++) {
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;

        }

        return slow;
    }
}
