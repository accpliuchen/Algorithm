package com.interview.exercise.exercise1302;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}

public class Test {

    public int deepestLeavesSum(TreeNode root){
        ArrayDeque<TreeNode> nextLevel=new ArrayDeque<>();
        ArrayDeque<TreeNode> currLevel=new ArrayDeque<>();

        nextLevel.offer(root);

        while(!nextLevel.isEmpty()){
            currLevel=nextLevel.clone();
            nextLevel.clear();

            for(TreeNode node:currLevel){

                if(node.left!=null){
                    nextLevel.offer(node.left);
                }

                if(node.right!=null){
                    nextLevel.offer(node.right);
                }
            }
        }

        int deepestSum=0;
        for(TreeNode node:currLevel){
            deepestSum+=node.val;
        }
        return deepestSum;
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.left.left=new TreeNode(7);

        root.right=new TreeNode(3);
        root.right.right=new TreeNode(6);
        root.right.right.right=new TreeNode(8);

        Test test=new Test();

        System.out.println("result value is "+ test.deepestLeavesSum(root));
    }
}
