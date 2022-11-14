package com.interview.exercise.exercise133.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
    private HashMap<Node,Node> visited=new HashMap<>();

    public Node cloneGraph(Node node){
        if(node==null){
            return node;
        }

        if(visited.containsKey(node)){
            return visited.get(node);
        }

        Node cloneNode=new Node(node.val,new ArrayList());
        visited.put(node,cloneNode);

        for(Node neighbors:node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbors));
        }


        return cloneNode;
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

        Test test=new Test();
        Node result=test.cloneGraph(node1);

        System.out.println("result value is "+result);
    }
}
