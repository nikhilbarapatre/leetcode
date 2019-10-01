package BFS;

import java.util.*;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val,List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node cloneGraph(Node node){
        if(node == null)
            return null;
        Map<Integer, Node> map = new HashMap<>(); //to store the new or "cloned" nodes
        Queue<Node> queue = new LinkedList<>(); //to store the current or given node under consideration
        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(newNode.val, newNode);  //adding the new node to the map with its value
        queue.add(node);    //adding the current node in the queue for processing
        while(!queue.isEmpty()){
            Node n = queue.remove();
            for(Node neighbor : n.neighbors){
                if(!map.containsKey(neighbor.val)){
                    map.put(neighbor.val, new Node(neighbor.val, new ArrayList<Node>()));
                    queue.add(neighbor);
                } 
                map.get(n.val).neighbors.add(map.get(neighbor.val));
            }
        }
        return newNode;
    }
}
