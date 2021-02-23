package trees.serializeAndReconstructTree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndReconstructTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    /*先序*/
    public static String serialByPre(Node head){
        if(head ==null){return "#_";}
        String res = head.value+"_";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }

    public static Node reconByPreString(String preStr){
        String[] value = preStr.split("_");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i != value.length; i++) {
            queue.add( value[i]);

        }
        return reconPreOrder(queue);
    }

    private static Node reconPreOrder(Queue<String> queue) {
        String value = queue.poll();
        if(value.equals("#")){
            return null;
        }
        Node head = new Node(Integer.valueOf(value));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }
}
