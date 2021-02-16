package structures.linkedList;

import java.util.Stack;

public class IsPalindromeList {
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
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while(head != null){
            if(head.value !=stack.pop().value){
                return false;
            }
            head= head.next;
        }
        return true;
    }
}
