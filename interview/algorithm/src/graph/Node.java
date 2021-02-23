package graph;

import java.util.ArrayList;

public class Node {
    public int value;
    public int in; //入渡
    public int out;//出渡
    public ArrayList<Node> nexts;//方向连接节点
    public ArrayList<Edge> edges;//连接边

    public Node(int value) {
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>();
    }
}