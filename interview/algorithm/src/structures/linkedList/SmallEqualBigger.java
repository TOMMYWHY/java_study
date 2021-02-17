package structures.linkedList;

public class SmallEqualBigger {
    private class  Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public static Node listPartition1(Node head, int pivot){
        if (head == null) {
            return head;
        }
        Node cur = head;
        int i = 0;
        while (cur !=null){
            cur = cur.next;
            i++;//获得链表长度
        }
        Node[] nodeArr = new Node[i];
        i=0;
        cur = head;
        for (int j = 0; j < nodeArr.length; j++) {
             nodeArr[j] = cur;
            cur =  cur.next;
        }
        arrPartition(nodeArr, pivot);
        for (int j = 1; j < nodeArr.length; j++) {
            nodeArr[j - 1].next =  nodeArr[j];
        }
        nodeArr[i - 1].next = null;
        return nodeArr[0];

    }
    private static void arrPartition(Node[] nodeArr, int pivot) {
        int small = -1;
        int big = nodeArr.length;
        int index = 0;
        /*快排的 partition*/
        while (index  < big){
            if(nodeArr[small].value < nodeArr[index].value){
                swap(nodeArr, small+1, index);
                small++;
                index++;
            }else if(nodeArr[small].value > nodeArr[index].value){
                swap(nodeArr, big-1,index);
                big--;
            }else {
                index++;
            }
        }
    }

    /*最优解*/
    public static Node listPartition2(Node head, int pivot){
        Node sH = null;
        Node sT = null;
        Node eH = null;
        Node eT = null;
        Node mH = null;
        Node mT = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next = null;
            if (head.value <pivot){
                if(sH == null){
                    sH=head;
                    sT=head;
                }else{
                    sT.next = head; //追加
                    sT = head; // 移动
                }
            }else if(head.value == pivot){
                if(eH ==null){
                    eH =head;
                    eT = head;
                }else {
                    eT.next = head;
                    eT = head;
                }
            }else{
                if(mH == null){
                    mH =head;
                    mT = head;
                }else {
                    mT.next = head;
                    mT = head;
                }
            }
            head = next;
        }
        if(sT!=null){
            sT.next = eH;
            eT = eT == null ? sT:eT; //Todo ??
        }
        if(eT!=null){
            eT.next = mH;
        }
        return  sH != null? sH:(eH!=null?eH:mH);//Todo ??
    }

    public static void swap(Node[] nodeArr, int a, int b) {
        Node tmp = nodeArr[a];
        nodeArr[a] = nodeArr[b];
        nodeArr[b] = tmp;
    }
}
