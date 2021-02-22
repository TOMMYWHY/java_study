package trees.preInPosTraversal;

import java.util.Stack;

public class PreInPosTraversal {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(8);
        head.left.left = new Node(2);
        head.left.right = new Node(4);
        head.left.left.left = new Node(1);
        head.right.left = new Node(7);
        head.right.left.left = new Node(6);
        head.right.right = new Node(10);
        head.right.right.left = new Node(9);
        head.right.right.right = new Node(11);

        // recursive
        System.out.println("==============recursive==============");
        System.out.print("pre-order: ");
        preOrderRecur(head);
        System.out.println();
        System.out.print("in-order: ");
        inOrderRecur(head);
        System.out.println();
        System.out.print("pos-order: ");
        posOrderRecur(head);
        System.out.println();
//
        // unrecursive
        System.out.println("============unrecursive=============");
        preOrderUnRecur(head);
        inOrderUnRecur(head);
        posOrderUnRecur1(head);
//        posOrderUnRecur2(head);

    }

    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    /*前序遍历：递归序首次出现 头左右*/
    public static void preOrderRecur(Node head){
        if(head==null){return;}
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    /*中序遍历：递归序第二次出现 左头右*/
    public static void inOrderRecur(Node head){
        if(head==null){return;}
        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }
    /*后序遍历：递归序第三次出现 左右头*/
    public static void posOrderRecur(Node head){
        if(head==null){return;}
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.value + " ");
    }


    public static void preOrderUnRecur(Node head){
        System.out.print("pre-order: ");
        if (head!=null){
            Stack<Node> stack = new Stack<>();
            stack.push(head); /*先压入头*/
            while (!stack.isEmpty()){
                //1.弹出
                Node cur = stack.pop();
                System.out.print(cur.value+" ");//输出头
                //2. 先右再左
                if(cur.right!=null){
                    stack.push(cur.right);
                }
                if(cur.left!=null){
                    stack.push(cur.left);
                }
            }
        }
        System.out.println();
    }
    public static void inOrderUnRecur(Node head){
        System.out.print("pre-order: ");
        if(head!=null){
            Stack<Node> stack = new Stack<Node>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left; //1. 所有左子树压栈
                }else{
                    head = stack.pop();
                    System.out.print(head.value + " ");
                    head = head.right;
                }
            }
        }
    }
    public static void posOrderUnRecur1(Node head){
        System.out.print("pos-order: ");
        if (head != null) {
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>();
            s1.push(head);
            while (!s1.isEmpty()){
//                //1. 弹出cur
                Node cur = s1.pop();
                //2. 放入辅助栈
                s2.push(cur);
                //3. s1进行 先左再右
                if(cur.left!=null){
                    s1.push(cur.left);
                }
                if(cur.right!=null){
                    s1.push(cur.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.print(s2.pop().value + " ");
            }
        }
        System.out.println();
    }
}
