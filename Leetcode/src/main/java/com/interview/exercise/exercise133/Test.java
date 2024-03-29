package com.interview.exercise.exercise133;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();

    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
}

public class Test {

//    private HashMap <Node, Node> visited = new HashMap <> ();
//    public Node cloneGraph(Node node) {
//        if (node == null) {
//            return node;
//        }
//
//        // If the node was already visited before.
//        // Return the clone from the visited dictionary.
//        if (visited.containsKey(node)) {
//            return visited.get(node);
//        }
//
//        // Create a clone for the given node.
//        // Note that we don't have cloned neighbors as of now, hence [].
//        Node cloneNode = new Node(node.val, new ArrayList());
//        // The key is original node and value being the clone node.
//        visited.put(node, cloneNode);
//
//        // Iterate through the neighbors to generate their clones
//        // and prepare a list of cloned neighbors to be added to the cloned node.
//        for (Node neighbours: node.neighbors) {
//            cloneNode.neighbors.add(cloneGraph(neighbours));
//        }
//        return cloneNode;
//    }

    public Node cloneGraph(Node node){
        if(node==null) return null;

        Map<Node,Node> map=new HashMap<>();

        Node newNode=new Node(node.val,new ArrayList<>());
        map.put(node,newNode);

        Queue<Node> queue=new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            Node cur=queue.remove();
            for(Node nei:cur.neighbors){
                if(!map.containsKey(nei)){
                    map.put(nei,new Node(nei.val,new ArrayList<>()));
                    queue.add(nei);
                }
                map.get(cur).neighbors.add(map.get(nei));
            }
        }

        return newNode;
    }

	public static void main(String args[]){
		Node node1 = new Node(1);
	    Node node4 = new Node(4);
	    Node node3 = new Node(3);
	    Node node2 = new Node(2);

        //Arrays.asList(node2, node4)
        node1.setNeighbors(Arrays.asList(node2, node4));
        node2.setNeighbors(Arrays.asList(node1, node3));
        node3.setNeighbors(Arrays.asList(node4, node2));
        node4.setNeighbors(Arrays.asList(node1, node3));

//         Test test=new Test();
        Test test=new Test();
         Node node=test.cloneGraph(node1);

        System.out.println("===");
	}
}
