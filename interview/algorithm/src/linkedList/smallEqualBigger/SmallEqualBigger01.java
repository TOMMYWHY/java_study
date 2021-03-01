package linkedList.smallEqualBigger;

public class SmallEqualBigger01 {
    private static  class  Node{
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
       Node  cur = head;
       int i = 0;
       while(cur!=null){
           cur = cur.next;
           i++;
       }
       cur =head;
        Node[] arr = new Node[i];
        for (int j = 0; j < arr.length; j++) {
             arr[j] = cur;
             cur =cur.next;
        }
        arrPartition(arr,pivot);
        for (int j = 1; j < arr.length; j++) {
            arr[j-1].next = arr[j];
        }
        arr[i-1].next = null;
        return arr[0];
    }
    private static void arrPartition(Node[] arr, int pivot) {
        int less = -1,more = arr.length,index = 0;
        /*
        * pivot == r
        * index == l
        * */
        while(index< more){
            if(arr[index].value<arr[pivot].value){
                swap(arr, index++,++less);
            }else if (arr[index].value>arr[pivot].value){
                swap(arr, index, --more);
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


    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(9);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(5);
        printLinkedList(head1);
         head1 = listPartition1(head1, 4);
//        head1 = listPartition2(head1, 5);
        printLinkedList(head1);

    }
}
