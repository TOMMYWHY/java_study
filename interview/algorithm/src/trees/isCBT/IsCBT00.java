package trees.isCBT;

import java.util.LinkedList;
import java.util.Queue;

/*completed binary tree*/
public class IsCBT00 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isCBT(Node head) {
        if(head==null){return true;}
        Queue<Node> queue = new LinkedList<>();
        boolean leafs_not_full = false;
        Node l=null, r= null;
        queue.add(head);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            l = cur.left;
            r=cur.right;
            if(r!=null && l==null){return false;}
            if(leafs_not_full && (l!=null||r!=null)){return false;}


            if(l!=null){queue.add(l);}
            if(r!=null){queue.add(r);}
            if(l==null || r==null){
                leafs_not_full = true;
            }
        }
        return true;
    }

    /*m2*/

    public static boolean isCBT2(Node head){
        if(head==null){
            return true;
        }
        Info data = process(head);
        if(data.nodes == (1<<data.height-1)){
            /*Math.pow(2,data.height)*/
            return true;
        }else {
            return false;
        }
    }
    public static class Info{
        public int height;
        public int nodes;
        public Info(int height, int nodes) {
            this.height = height;
            this.nodes = nodes;
        }
    }
    public static Info process(Node x){
        if(x==null){return new Info(0,0);}
        Info leftData = process(x.left);
        Info rightData = process(x.right);
        int height= Math.max(leftData.height,rightData.height)+1;
        int nodes=Math.max(leftData.nodes,rightData.nodes)+1;
        return new Info(height,nodes);
    }
}
