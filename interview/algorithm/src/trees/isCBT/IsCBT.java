package trees.isCBT;

import java.util.LinkedList;

/*completed binary tree*/
public class IsCBT {
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
        LinkedList<Node> queue = new LinkedList<>();
        boolean leaf = false;
        Node l = null;
        Node r = null;
        queue.add(head);
        while(!queue.isEmpty()){
            head = queue.poll();
            l = head.left;
            r = head.right;
            if( (leaf&&(l!=null||r!=null)) || (l==null&&r!=null) ){
                return false;
//                > 1.任一节点，有右无左，false
//                > 2. (1)满足， 第一个左右不全，后面所有节点必须是叶子节点，否则false
            }
            if(l!=null){
                queue.add(l);
            }
            if(r!=null){
                queue.add(r);
            }
            if(l==null || r==null){
                leaf = true;
            }
        }
        return true;
    }



    public static boolean isFullBT(Node head){
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
