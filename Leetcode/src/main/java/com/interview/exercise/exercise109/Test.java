package com.interview.exercise.exercise109;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Test {

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        dfs(root,1);
        return max;
    }

    int max=1;

    void dfs(TreeNode root,int h){
        if(root==null) return;

        dfs(root.left,h+1);
        dfs(root.right,h+1);

        max=Math.max(max,h);
    }

    public static void main(String args[]) {

    }
}
