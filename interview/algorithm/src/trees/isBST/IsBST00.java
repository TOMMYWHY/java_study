package trees.isBST;

import java.util.ArrayList;
import java.util.Stack;

/*binary search tree*/
public class IsBST00 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    /*
    *m1: 遍历 每个节点都与preValue 比较；以中序遍历的顺序进行
    *
    * */
    public static int preValue = Integer.MIN_VALUE;
    public static boolean is_searchTree(Node head){
        if(head==null){return true;}
        boolean isLeftBst = is_searchTree(head.left);
        if(!isLeftBst){return  false;}
        if(head.value<=preValue){return false;}
        else {preValue = head.value;}
        System.out.println();
        return  is_searchTree(head.right);

    }


    /*m2*/
    public static boolean is_searchTree2(Node head){
        ArrayList<Node> inOrderList = new ArrayList<>();
        process(head,inOrderList);
        int pre = Integer.MIN_VALUE;

        for (Node node : inOrderList) {
            if(pre>node.value){return false;}
            pre = node.value;
        }
        return true;
    }
    public static void process(Node node, ArrayList<Node> inOrderList) {
        if (node == null) {
            return;
        }
        process(node.left, inOrderList);
        inOrderList.add(node);
        process(node.right, inOrderList);
    }

    /*m3*/
    public static boolean is_searchTree3(Node head){
        if(head!=null){
            int preValue = Integer.MIN_VALUE;
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || head!=null){
                if(head!=null){
                    stack.push(head);
                }else{
                    head=stack.pop();

                    if(head.value<=preValue){
                        return false;
                    }else {
                        preValue = head.value;
                    }

                    head = head.right;
                }
            }
        }
        return true;
    }

    /*m4 递归*/
    public static class ReturnData{
        public boolean isBst;
        public int min;
        public int max;

        public ReturnData(boolean isBst, int min, int max) {
            this.isBst = isBst;
            this.min = min;
            this.max = max;
        }
    }
//    public static boolean is_searchTree4(Node head){
//
//    }
    public static ReturnData process(Node x){
        if(x==null){return null;}
       ReturnData leftData = process(x.left);
       ReturnData rightData = process(x.right);
       int min = x.value;
       int max = x.value;
       if(leftData!=null){
           min = Math.min(min,leftData.min);
           max = Math.max(max,leftData.max);
       }
        if(rightData!=null){
            min = Math.min(min,rightData.min);
            max = Math.max(max,rightData.max);
        }
        boolean isBst=true;
        if(leftData!=null){
            if(!leftData.isBst || leftData.max >=x.value){isBst= false;}
        }
        if(rightData!=null){
            if(!rightData.isBst || rightData.min <=x.value){isBst = false;}
        }
        return new ReturnData(isBst,min,max);
    }
}
