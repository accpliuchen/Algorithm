package edu.laicode.exercise132;

//https://app.laicode.io/app/problem/132

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class GraphNode{
	public int key;
	public List<GraphNode> neighbors;
	public GraphNode(int key){
		this.key=key;
		this.neighbors=new ArrayList<GraphNode>();
	}
}

public class Test {
	public static void main(String args[]){

	}
}
