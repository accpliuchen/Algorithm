package com.interview.exercise.exercise226;


class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int key){
        this.key=key;
    }

    TreeNode(int key, TreeNode left, TreeNode right) {
         this.key = key;
         this.left = left;
         this.right = right;
      }
}

public class Test {

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }

        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=invertTree(right);
        root.right=invertTree(left);

        return root;
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);

        Test test=new Test();
        TreeNode newRoot=test.invertTree(root);
        System.out.println("==");
    }
}
