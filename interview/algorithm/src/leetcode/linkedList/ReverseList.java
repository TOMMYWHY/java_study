package leetcode.linkedList;

public class ReverseList {
    /*内部类*/
    public static class Node{
        public  Node next;
        public  int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class DoubleNode{
        public DoubleNode next;
        public DoubleNode last;
        public int value;

        public DoubleNode(int value) {
            this.value = value;
        }
    }

    public static Node reverseLinkedList(Node head){
        Node pre = null;
        Node next= null;
        while(head!=null){
            next = head.next;
            head.next = pre; //翻转
            pre = head;
            head= next;
        }
        return pre;
    }

    public static Node reverseLinkedList00(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre= head;
            head = next;
        }
        return pre;
    }

    public static Node reverseLinkedList01(Node head){
        Node pre = null;
        Node next = null;
        while (head!=null){
            next = head.next; //记住下一个节点位置
            head.next = pre; // 翻转， 开始指向null
            pre = head; //前移
            head = next;//前移
        }
        return  pre;
    }


    public static DoubleNode reverseDoubleLinkedList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next= null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head= next;
        }
        return pre;
    }

    public static DoubleNode reverseDoubleLinkedList00(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next= null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);


//        a = reverseLinkedList(a);
        a = reverseLinkedList00(a);
        System.out.println();
    }
}
