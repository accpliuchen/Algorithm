package com.interview.exercise.exercise314;


import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Test {
    private int min=0;
    private int max=0;

    //bfs
    public List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return result;
        }
        helper(root,0);
        for(int i=min;i<=max;i++){
            result.add(new ArrayList<>());
        }

        Queue<TreeNode> queue=new LinkedList<>();
        Queue<Integer> index=new LinkedList<>();

        index.offer(-min);
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            int idx=index.poll();
            result.get(idx).add(current.val);

            if(current.left!=null){
                queue.offer(current.left);
                index.offer(idx-1);
            }

            if(current.right!=null){
                queue.offer(current.right);
                index.offer(idx+1);
            }
        }
        return result;
    }

    //dfs max and mix
    private void helper(TreeNode root, int index){
        if(root==null) return ;
        min=Math.min(min,index);
        max=Math.max(max,index);
        helper(root.left,index-1);
        helper(root.right,index+1);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);


//        TreeNode root=new TreeNode(3);
//        root.left=new TreeNode(2);
//        root.right=new TreeNode(1);
//        root.right.left=new TreeNode(0);
//        root.right.right=new TreeNode(5);
//        root.right.left.left=new TreeNode(1);
//        root.right.left.right=new TreeNode(5);
//        root.right.right=new TreeNode(7);


        Test test=new Test();
        List<List<Integer>> result=test.verticalOrder(root);

        System.out.println("");
    }
}
