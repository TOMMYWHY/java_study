package linkedList.isPalindromeList;

import java.util.Stack;

public class IsPalindromeList00 {
    public static class Node{
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static boolean isPalindrome1(Node head){
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while(cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        cur =head;
        while (!stack.isEmpty()){
            if(stack.pop().value != cur.value){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    /*
    * 快慢指针找中点。
    * //TODO 中点边界
    * */
    public static boolean isPalindrome2(Node head){
        Node f = head.next, s = head;
        while(s.next!=null && s.next.next!=null){
            f = f.next.next;
            s = s.next;
        }
        Stack< Node> stack = new Stack<>();
        while(s!=null ){
            stack.push(s);
            s = s.next;
        }
        while (!stack.isEmpty()){
            if(stack.pop().value != head.value){return false;}
            head = head.next;
        }
        return true;
    }

    public static boolean isPalindrome3(Node head){
      Node h1=head,h2=head;
      while(h2.next!=null && h2.next.next!=null){
          h1 = h1.next;
          h2 = h2.next.next;
      }
      Node p1 = head;
      Node p2 = h1.next;
      Node next =null,pre =null;
      while(p2!=null){
          next = p2.next;
          p2.next = pre;
          pre = p2;
          p2= next;

      }
      boolean res = true;
      while(p1!=null && p2 != null){
          if(p1.value != p2.value){
              res = false;
          }
          p1 = p1.next;
          p2 = p2.next;
      }
      return res;
    }
    /*todo*/

}
