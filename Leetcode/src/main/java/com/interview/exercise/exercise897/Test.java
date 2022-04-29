package com.interview.exercise.exercise897;

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

    public TreeNode increasingBST(TreeNode root){
        return  increasingBST(root,null);
    }

    public TreeNode increasingBST(TreeNode root,TreeNode tail){
        if(root==null) return tail;
        TreeNode res=increasingBST(root.left,root);
        root.left=null;
        root.right=increasingBST(root.right,tail);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);

        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);

        root.left.left.left=new TreeNode(1);

        root.right.right=new TreeNode(8);
        root.right.right.left=new TreeNode(7);
        root.right.right.right=new TreeNode(9);

        Test test=new Test();
        TreeNode node=test.increasingBST(root);
        System.out.println("build tree");
    }
}
