package structures.linkedList.findFirstIntersectNode;

public class FindFirstIntersectNode {
    public static class Node {
        public int value;
        public Node next;
        public Node(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2).value);

        // 1->2->3->4->5->6->7->4...
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->2...
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next; // 8->2
        System.out.println(getIntersectNode(head1, head2).value);

        // 0->9->8->6->4->5->6..
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2).value);

    }

    public static Node getIntersectNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node loop1 = getLoopNode(head1);
        Node loop2 = getLoopNode(head2);
        if (loop1 == null && loop2 == null) {
            return noLoop(head1, head2);//无环链表相交问题
        }
        if (loop1 != null && loop2 != null) {
            return bothLoop(head1, loop1, head2, loop2);//有环链表相交问题
        }
        return null; // 一个有环，一个无环，
    }

    /*找到有环的入换节点*/
    public static Node getLoopNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        Node n1 = head.next;
        Node n2 = head.next.next;
        while (n1!=n2){
            if (n2.next == null || n2.next.next == null) {
                return null;
            }
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = head;
        while (n1!=n2){
            n2 = n2.next;
            n1 = n1.next;
        }
        return n1;//相遇点
    }
    /*两条无环节点的相交点*/
    public static Node noLoop(Node head1, Node head2){
        if (head1 == null || head2 == null) {
            return null;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        int n = 0; //link1 与link2 长度差
        while (cur1.next!=null){
            n++;
            cur1= cur1.next;
        }
        while (cur2.next !=null){
            n--;
            cur2=cur2.next;
        }
        if(cur1!=cur2){return null;} //两条link终点不同，即不相交
        if(n>0){
            cur1 = head1; //cur1 为长
            cur2 = head2;
        }else{
            cur1 = head2;
            cur2 = head1;
        }
        n = Math.abs(n);//将n改为正数步长
        while (n!=0){
            n--;
            cur1= cur1.next;//先行
        }
        while (cur1!=cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    /*两个link 都有环*/
    public static Node bothLoop(Node head1, Node loop1, Node head2, Node loop2){
        Node cur1 = null;
        Node cur2 = null;
        /*links 在入环处相交 或者 入环前相交*/
        if(loop1 == loop2 ){
            cur1 = head1;
            cur2 = head2;
            int n = 0;
            while (cur1!=loop1){
                n++;
                cur1=cur1.next;
            }
            while (cur2 !=loop2 ){
                n--;
                cur2 = cur2.next;
            }
            if(n>0){
                cur1 = head1; //cur1 为长
                cur2 = head2;
            }else{
                cur1 = head2;
                cur2 = head1;
            }
            n = Math.abs(n);//将n改为正数步长
            while (n!=0){
                n--;
                cur1= cur1.next;//先行
            }
            while (cur1!=cur2){
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        }else{
            /*loop1!= loop2
            * 即，环内相交。在环内搜索相遇
            * */

            cur1 = loop1.next;
            while (cur1!=loop1){
                if(cur1==cur2){
                    return loop1;
                }
                cur1 =cur1.next;
            }
            return null;
        }
    }



}
