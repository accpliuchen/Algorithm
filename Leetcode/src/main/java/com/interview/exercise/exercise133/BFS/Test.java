package com.interview.exercise.exercise133.BFS;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

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

//https://leetcode.com/problems/clone-graph/discuss/993158/Java-BFS-with-test-cases
public class Test {

    public Node cloneGraph(Node node){
        if(node==null) return null;

        Map<Node, Node> map=new HashMap<>();

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
                Node temp=map.get(nei);
                Node tempcur=cur;
                map.get(cur).neighbors.add(temp);
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

        Test test=new Test();
        Node result=test.cloneGraph(node1);




        System.out.println("result value is "+result);
	}
}
