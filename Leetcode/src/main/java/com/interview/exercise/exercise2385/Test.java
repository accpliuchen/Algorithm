package com.interview.exercise.exercise2385;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Test {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        convert(root,0,map);

        Queue<Integer> queue=new LinkedList<>();
        queue.offer(start);

        int minute=0;
        Set<Integer> visited=new HashSet<>();
        visited.add(start);

        while(!queue.isEmpty()){
            int levelSize=queue.size();

            while(levelSize>0){
                int current=queue.poll();

                for(int num:map.get(current)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        queue.add(num);
                    }
                }
                levelSize--;
            }
            minute++;
        }

        return minute-1;
    }

    public void convert(TreeNode current,int parent,Map<Integer,Set<Integer>> map){
        if(current==null){
            return;
        }

        if(!map.containsKey(current.val)){
            map.put(current.val,new HashSet<>());
        }

        Set<Integer> adjacentList=map.get(current.val);

        if(parent!=0){
            adjacentList.add(parent);
        }

        if(current.left!=null){
            adjacentList.add(current.left.val);
        }

        if(current.right!=null){
            adjacentList.add(current.right.val);
        }

        convert(current.left,current.val,map);
        convert(current.right,current.val,map);
    }


    public static void main(String args[]){
        Test test=new Test();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(5);
        root.right=new TreeNode(3);

        root.right.left=new TreeNode(10);
        root.right.right=new TreeNode(6);

        root.left.right=new TreeNode(4);
        root.left.right.left=new TreeNode(9);
        root.left.right.right=new TreeNode(2);

        int result = test.amountOfTime(root,3);
        System.out.println("result value is "+ result);
    }
}
