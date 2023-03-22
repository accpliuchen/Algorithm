package com.interview.hackerrank.papercutting;

import java.util.*;

class Node{
	int startIndex;
	int endIndex;

	public Node(int startIndex,int endIndex){
		this.startIndex=startIndex;
		this.endIndex=endIndex;
	}
}

public class Test {

    public static ArrayList<Node> getUnique(List<Integer> starting,List<Integer> ending){
        ArrayList<Node> res=new ArrayList<>();
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();

        for(int index=0;index<starting.size();++index){
        	map.putIfAbsent(starting.get(index),new HashSet<>());
        	map.get(starting.get(index)).add(ending.get(index));
        }

        for(int key:map.keySet()){
        	HashSet<Integer> set=map.get(key);

        	for(int val:set){
        		res.add(new Node(key,val));
        	}
        }

        return res;

    }

    public static long paperCutting(int textLength,List<Integer> starting,List<Integer> ending){
    	long ans=0;

    	ArrayList<Node> uniqueNodeList=getUnique(starting,ending);

    	Collections.sort(uniqueNodeList,(x,y)->{
    		if(x.startIndex==y.startIndex) return x.endIndex - y.endIndex;
    		return x.startIndex-y.endIndex;
    	});

    	int highPointer=0;

    	for(int index=0;index<uniqueNodeList.size();index++){
//    		while(highPointer<uniqueNodeList.size() && uniqueNodeList.get(highPointer).startIndex<=uniqueNodeList.get(index).endIndex){
			while(highPointer<uniqueNodeList.size() && uniqueNodeList.get(highPointer).startIndex<uniqueNodeList.get(index).endIndex){
    			++highPointer;
    		}
    		ans+=uniqueNodeList.size()-highPointer;
    	}

    	return ans;
    }

	public static void main(String[] args) {
		
	}
}
