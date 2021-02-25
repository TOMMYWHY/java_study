package graph.topologySort;

import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TopologySort {
    public static List<Node> sortedTopology(Graph graph) {
        /*key：node value:剩余入度*/
        HashMap<Node, Integer> inMap = new HashMap<>();
        /*入渡为0 可进入queue*/
        LinkedList<Node> zeroInQueue = new LinkedList<>();
        for (Node node : graph.nodes.values()) {
            inMap.put(node,node.in);
            if(node.in==0){
                zeroInQueue.add(node);
            }
        }
        ArrayList<Node> result = new ArrayList<>();
        while (!zeroInQueue.isEmpty()){
            Node cur = zeroInQueue.poll();
            result.add(cur);
            for (Node next : cur.nexts) {
                inMap.put(next,inMap.get(next)-1);
                if(inMap.get(next)==0){
                    zeroInQueue.add(next);
                }
            }
        }
        return result;
    }

}
