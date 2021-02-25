package trees.treeMaxWidth;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TreeMaxWidth00 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    public static void bst(Node head){
        if(head==null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.print(cur.value+" ");
            if(cur.left!=null){queue.add(cur.left);}
            if(cur.right!=null){queue.add(cur.right);}
        }
    }
    public static void getMaxWidthTraversByQueue(Node head){
        if(head==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        HashMap<Node, Integer> levelMap = new HashMap<>();
        levelMap.put(head,1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int max  = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            int curNodeLevel = levelMap.get(cur);
            if(curNodeLevel == curLevel){
                /*遍历节点所在层，与 curlevel 一致，则 遍历节点在curlevel上*/
                curLevelNodes++;
            }else {
                /*进入curlevel的下一层*/
                max = Math.max(max,curLevelNodes);//更新max
                curLevel++;
                curLevelNodes = 1;
            }
            System.out.print(cur.value+" ");
            if(cur.left!=null){queue.add(cur.left);}
            if(cur.right!=null){queue.add(cur.right);}

        }
    }

}
