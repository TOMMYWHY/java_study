package structures.linkedList;

public class PrintCommonPart {

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void printCommonPart(Node head1, Node head2){
        System.out.print("Common Part: ");
        while (head1 != null && head2 !=null) {
            if(head1.value< head2.value){
                head1 = head1.next;
            }else if(head1.value > head2.value){
                head2 = head2.next;
            }else{
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
}
