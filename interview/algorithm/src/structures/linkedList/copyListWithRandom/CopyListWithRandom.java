package structures.linkedList.copyListWithRandom;

import java.util.HashMap;

public class CopyListWithRandom {
    public static class Node {
        public int value;
        public Node next;
        public Node rand;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node copyListWithRand1(Node head){
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null){
            map.put(cur,new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }

    /*best method*/
    public static Node copyListWithRand2(Node head){
        if (head == null) { return null; }
        Node cur = null;
        Node next = null;
        while (cur !=null){
            next = cur.next;
            cur.next = new Node(cur.value);
            cur.next.next= next;
            cur = next;
        }
        cur = head;
        Node curCopy = null;
        while (cur!=null){
            next = cur.next.next;
            curCopy = cur.next;
            if(cur.rand !=null){
                curCopy.rand = null;
            }else {
                curCopy.rand = cur.rand.next; //cur.rand的next 是克隆节点。
            }
            cur = next;
        }
        Node res = head.next;
        cur = head;
        while (cur!=null){
            next = cur.next.next;
            curCopy = cur.next;
            cur.next = next;
            if(next!=null){
                curCopy.next = next.next;
            }else {
                curCopy.next = null;
            }
            cur = next;
        }
        return res;
    }
}
