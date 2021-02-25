package trees.lowestCommonAncestor;

import java.util.HashMap;
import java.util.HashSet;

public class LowestCommonAncestor00 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    /*m2*/
    public static Node lowestAncestor(Node head, Node o1, Node o2) {
        if (head == null || head == o1 || head == o2) {
            return head;
        }
        Node left = lowestAncestor(head.left, o1, o2);
        Node right = lowestAncestor(head.right, o1, o2);
        if (left != null && right != null) {
            return head;
        }
        return left != null ? left : right;
    }

    /*m1*/
    public static Node lca(Node head,Node o1,Node o2){
        HashMap<Node, Node> fatherMap = new HashMap<>();
        fatherMap.put(head,head);
        process(head,fatherMap);
        HashSet<Node> set1 = new HashSet<>();
        Node cur = o1;
        while (cur!=fatherMap.get(cur)){
            set1.add(cur);
            cur = fatherMap.get(cur);
        }
        set1.add(head);
        cur = o2;
        while (cur!=null){

            boolean contains = set1.contains(fatherMap. get(cur));
            if(contains){
                return fatherMap.get(cur);
            }
            cur = fatherMap.get(cur);
        }
        return head;
    }
    public static void process(Node head, HashMap<Node, Node> fatherMap){
        if(head == null){return ;}
        fatherMap.put(head.left,head);
        fatherMap.put(head.right,head);
        process(head.left,fatherMap);
        process(head.right,fatherMap);
    }
}
