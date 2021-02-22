package trees.isBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/*binary search tree*/
public class IsBST {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }


    public static int preValue = Integer.MIN_VALUE;
    public static boolean is_searchTree(Node head){
        if(head!=null){
            return true;
        }
       boolean is_leftBst = is_searchTree(head.left);
        if(!is_leftBst){return false;}
        if(head.value<=preValue){
            return false;
        }else{
            preValue =  head.value;
        }
        boolean is_rightBst = is_searchTree(head.right);
        return is_leftBst;
    }


    /*m2*/
    public static boolean is_searchTree2(Node head){
        ArrayList<Node> inOrderList = new ArrayList<>();
        process(head,inOrderList);
        int pre = Integer.MIN_VALUE;
        for (Node cur : inOrderList) {
            if (pre >= cur.value) {
                return false;
            }
            pre = cur.value;
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
}
