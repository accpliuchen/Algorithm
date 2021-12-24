package com.interview.exercise.exercise104;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class Test {

    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        dfs(root, 1);
        return max;
    }

    int max=1;

    private void dfs(TreeNode root,int value){
        if(root==null) return ;

        dfs(root.left,value+1);
        dfs(root.right,value+1);

        max=Math.max(value,max);
    }

    public static void main(String args[]){
        TreeNode treeNode=new TreeNode(3);
        treeNode.left=new TreeNode(9);
        treeNode.right=new TreeNode(20);
        treeNode.right.right=new TreeNode(7);
        treeNode.right.left=new TreeNode(15);
        treeNode.right.left.right=new TreeNode(10);
        treeNode.right.left.left=new TreeNode(8);

        Test test=new Test();

        int result=test.maxDepth(treeNode);

        System.out.println(result);
    }
}
