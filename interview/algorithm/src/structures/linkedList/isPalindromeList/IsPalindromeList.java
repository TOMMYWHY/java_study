package structures.linkedList.isPalindromeList;

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
    public static boolean isPalindrome11(Node head){
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur !=null){
            stack.push(cur);
            cur = cur.next;
        }
        while (head!=null){
            if(head.value != stack.pop().value){return false;}
            head = head.next;
        }
        return true;
    }
    /*
    * 快慢指针找中点。
    * //TODO 中点边界
    * */
    public static boolean isPalindrome2(Node head){
        if (head == null || head.next == null) {
            return true;
        }
        Node right = head.next;
        Node cur = head;
        while (cur.next != null && cur.next.next != null){
            right = right.next;
            cur = cur.next.next;
        }
        Stack<Node> stack = new Stack<>();
        while (right!= null){
            stack.push(right);
            right = right.next;
        }
        while (!stack.isEmpty()){
            if(head.value != stack.pop().value){
                return false;
            }
            head = head.next;
        }
        return true;
    }
    public static boolean isPalindrome21(Node head){
        if (head == null || head.next == null) {
            return true;
        }
        Node fast = head.next;
        Node slow = head;
        while(slow.next != null&& slow.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<Node> stack = new Stack<>();
        while (slow !=null){
            stack.push(slow);
            slow = slow.next;
        }

        while (!stack.isEmpty()){
            if(head.value != stack.pop().value){return false;}
            head = head.next;
        }
        return true;
    }


    public static boolean isPalindrome3(Node head){
        if (head == null || head.next == null) {
            return true;
        }
        Node n1 = head;
        Node n2 = head;
        while(n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        /* reserve */
        while(n2!=null){
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }
        n3 = n1;
        n2 = head;
        boolean res = true;
        while (n1 !=null && n2 != null){
            if(n1.value !=n2.value){
                res = false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        /* reserve back*/
        n1 = n3.next;
        n3.next = null;
        while(n1 !=null){
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return  res;
    }
    /*todo*/
    public static boolean isPalindrome31(Node head){
        Node n1 = head;
        Node n2 = head;
        while (n2.next!=null&& n2.next.next!=null ){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next; // p2起点
        n1.next = null; //p1 p2 断开 此时n1 在p1的尾
        Node n3 = null;
        while(n2!=null){
            n3 =  n2.next ;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        } //n2 在逆序的p2头
        n3 = n1;

        return false;
    }
}
