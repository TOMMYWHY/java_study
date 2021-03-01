package linkedList.smallEqualBigger;

public class SmallEqualBigger00 {
    private class  Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public static void swap(Node[] nodeArr, int a, int b) {
        Node tmp = nodeArr[a];
        nodeArr[a] = nodeArr[b];
        nodeArr[b] = tmp;
    }

    public static Node listPartition1(Node head, int pivot){
        if (head == null) {
            return head;
        }
        Node cur = head;
        int i = 0;
        while(cur!=null ){
            cur = cur.next;
            i++;
        }
        cur = head;
        Node[] arr = new Node[i];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = cur;
            cur= cur.next;
        }
        arrPartition(arr,pivot);
        for (int j = 1; j < arr.length; j++) {
            arr[j-1].next = arr[j];

        }
        arr[i-1].next = null;
        return arr[0];
    }

    private static void arrPartition(Node[] arr, int pivot) {
        int less = -1;
        int more = arr.length;
        int index = 0;
        while (index < more){
            if(arr[less].value<arr[index].value){
                swap(arr, less+1,index);
                less++;
                index++;
            }else if(arr[less].value>arr[index].value){
                swap(arr,more-1,index);
                more --;
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


}
