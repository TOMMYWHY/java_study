package trees.treeMaxWidth;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TreeMaxWidth {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    public static void getMaxWidthTraversByQueue(Node head){
        if(head==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        HashMap<Node,Integer> levelMap = new HashMap<Node,Integer>();
        levelMap.put(head,1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            int curNodeLevel = levelMap.get(cur);
            if(curNodeLevel == curLevel){
                curLevelNodes++;
            }else{
                max = Math.max(max,curLevelNodes);
                curLevel++;
                curLevelNodes=1;
            }
//            System.out.print(cur.value+" ");
            if(cur.left!=null){
                levelMap.put(cur.left,curLevel+1);
                queue.add(cur.left);
            }
            if(cur.right!=null){
                levelMap.put(cur.right,curLevel+1);
                queue.add(cur.right);}
        }

    }
}
