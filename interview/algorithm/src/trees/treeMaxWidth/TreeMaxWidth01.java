package trees.treeMaxWidth;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TreeMaxWidth01 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    public static void bst(Node head){
        if(head==null){ return; }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            head = queue.poll();
            System.out.print(head.value+" ");
            if(head.left!=null){
                queue.add(head.left);
            }
            if(head.right!=null){
                queue.add(head.right);
            }
        }


    }
    public static void getMaxWidthTraversByQueue(Node head) {
        if (head == null) {
            return;
        }
        HashMap<Node, Integer> levelMap = new HashMap<>();//Node,level
        int curLevel = 1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){

            Node  cur  = queue.poll();
//            System.out.print(cur.value+" ");
            int curNodeLevel = levelMap.get(cur);
            if(curNodeLevel == curLevel){
                curLevelNodes++;
            }else{
                max = Math.max(max, curNodeLevel);
                curLevel++;
                curLevelNodes = 0;
            }
            if(head.left!=null){
                levelMap.put(cur.left,curLevel+1);
                queue.add(cur.left);
            }
            if(head.right!=null){
                levelMap.put(cur.right,curLevel+1);

                queue.add(cur.right);
            }
        }

    }


}
