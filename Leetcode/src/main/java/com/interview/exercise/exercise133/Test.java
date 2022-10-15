package com.interview.exercise.exercise133;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neighbours;
    public Node() {
        this.val = 0;
        this.neighbours = new ArrayList<Node>();
    }
    public Node(int val) {
        this.val = val;
        this.neighbours = new ArrayList<Node>();
    }
    public Node(int val, ArrayList<Node> neighbours) {
        this.val = val;
        this.neighbours = neighbours;
    }
}

public class Test {

    private HashMap <Node, Node> visited = new HashMap <> ();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        // If the node was already visited before.
        // Return the clone from the visited dictionary.
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Create a clone for the given node.
        // Note that we don't have cloned neighbors as of now, hence [].
        Node cloneNode = new Node(node.val, new ArrayList());
        // The key is original node and value being the clone node.
        visited.put(node, cloneNode);

        // Iterate through the neighbors to generate their clones
        // and prepare a list of cloned neighbors to be added to the cloned node.
        for (Node neighbours: node.neighbours) {
            cloneNode.neighbours.add(cloneGraph(neighbours));
        }
        return cloneNode;
    }

	public static void main(String args[]){
		Node node1 = new Node(1);
	    Node node4 = new Node(4);
	    Node node3 = new Node(3);
	    Node node2 = new Node(2);

       //Arrays.asList(node2, node4)
	    node1.neighbours=Arrays.asList(node2, node4);
	    node2.neighbours=Arrays.asList(node1, node3);
	    node3.neighbours=Arrays.asList(node4, node2);
	    node4.neighbours=Arrays.asList(node1, node3);
       Test test=new Test();
       Node node=test.cloneGraph(node1);

       System.out.println("===");
	}
}
