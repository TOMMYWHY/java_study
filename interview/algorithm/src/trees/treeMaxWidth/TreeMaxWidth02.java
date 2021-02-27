package trees.treeMaxWidth;

import java.util.HashMap;
import java.util.LinkedList;

public class TreeMaxWidth02 {
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
            Node cur = queue.pop();
            if(cur.left!=null){queue.add(cur.left);}
            if(cur.right!=null){queue.add(cur.right);}
            System.out.print(cur.value+" ");
        }


    }
    public static void getMaxWidthTraversByQueue(Node head) {
        if (head == null) {   return;}
        HashMap<Node, Integer> levelMap = new HashMap<>();
        int curLevel =1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            Node cur = queue.pop();
            int curNodeLevel = levelMap.get(cur);
            if(curNodeLevel == curLevel){
                curLevelNodes++;
            }else{
                max = Math.max(max, curLevelNodes);
                curLevel++;
                curLevelNodes=0;
            }
            if(cur.left!=null){
                levelMap.put(cur.left,curLevel+1);
                queue.add(cur.left);}
            if(cur.right!=null){
                levelMap.put(cur.right,curLevel+1);
                queue.add(cur.right);}

        }
    }


}
