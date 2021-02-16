package structures.linkedList;

import leetcode.linkedList.ReverseList;

public class SingleLinkedList {
    public static void main(String[] args) {
        ReverseList.Node a = new ReverseList.Node(1);
        a.next = new ReverseList.Node(2);
        a.next.next = new ReverseList.Node(3);
//        a = reverseLinkedList(a);
//        a = reverseLinkedList00(a);
        System.out.println();
    }


    public static class Node{
        public Node next;
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }

}
