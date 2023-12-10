package com.interview.exercise.exercise314.exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Test {

    class Item{
        int col;
        TreeNode node;

        public Item(int col,TreeNode node){
           this.col=col;
           this.node=node;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root){

        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return result;
        }

        int min=0;
        int max=0;

        Map<Integer,List<Integer>> map=new HashMap();
        Deque<Item> queue=new ArrayDeque<>();
        queue.offer(new Item(0,root));

        while(!queue.isEmpty()){
            Item cur=queue.pollLast();

            if(!map.containsKey(cur.col)){
                List<Integer> curList=new ArrayList<>();
                curList.add(cur.node.val);
                map.put(cur.col,curList);
            }else{
                map.get(cur.col).add(cur.node.val);
            }

            if(cur.node.left!=null){
                queue.offerFirst(new Item(cur.col-1,cur.node.left));
                min=Math.min(min,cur.col-1);
            }

            if(cur.node.right!=null){
                queue.offerFirst(new Item(cur.col+1,cur.node.right));
                max=Math.max(max,cur.col+1);
            }
        }

        for(int i=min;i<=max;i++){
            result.add(map.get(i));
        }

        return result;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Test test=new Test();


        List<List<Integer>> result=test.verticalOrder(root);

        result.stream().flatMap(List::stream).forEach(num->System.out.println(num+" "));

    }
}
