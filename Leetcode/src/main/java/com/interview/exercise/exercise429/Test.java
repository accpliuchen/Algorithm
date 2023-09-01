package com.interview.exercise.exercise429;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

class Node{
	public int val;

    public List<Node> children;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
public class Test {

  	// public List<List<Integer>> levelOrder(Node root) {
   //         Queue<Node> queue = new LinkedList<>();
   //      List<List<Integer>> res = new LinkedList<>();
   //      if(root == null) return res;
   //      queue.add(root);
   //      while(!queue.isEmpty()){
   //          int size = queue.size();
   //          List<Integer> temp = new LinkedList<>();
   //          for(int i = 0; i < size; i++){
   //              Node node = queue.poll();
   //              temp.add(node.val);
   //              List<Node> ch = node.children;
   //              for(Node n : ch){
   //                  queue.add(n);
   //              }
   //          }
   //          res.add(temp);    
   //      }
   //      return res;
   //  }

	 public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek().children != null) {
                    for (int j = 0; j < queue.peek().children.size(); j++) {
                        queue.offer(queue.peek().children.get(j));
                    }
                }
                list.add(queue.poll().val);
            }
            result.add(list);
        }
        return result;
    }

	public static void main(String args[]){

        List sub_list=new ArrayList();
        Node level_sub_left=new Node(5);
        Node level_sub_right=new Node(6);

        sub_list.add(level_sub_left);
        sub_list.add(level_sub_right);

        Node level_left=new Node(3,sub_list);
        Node level_center=new Node(2);
        Node level_right=new Node(4);

        List list=new ArrayList();

        list.add(level_left);
        list.add(level_center);
        list.add(level_right);

        Node root=new Node(1,list);


        Test test=new Test();
 		List<List<Integer>> result=test.levelOrder(root);

        System.out.println("===");


//        Map<Integer, String> treeMap = new HashMap<>();
//        treeMap.put(1, "Baeldung");
//        treeMap.put(1, "Baeldung");
//
//        System.out.println(treeMap.size() == 1);
//
//        Map<Integer, String> treeMap2 = new TreeMap<>();
//        treeMap2.put(1, "Baeldung");
//        treeMap2.put(1, "Baeldung");
//
//        System.out.println(treeMap2.size() == 1);
	}
}
