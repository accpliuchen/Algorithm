package com.interview.exercise.exercise99;

//https://www.youtube.com/watch?v=QZMropFflv4
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

    TreeNode first=null;
    TreeNode second=null;
    TreeNode prev=null;

    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp=first.val;

        System.out.println("first val"+ first.val);

        first.val=second.val;

        System.out.println("second val"+ second.val);


        second.val=temp;

        System.out.println("temp"+ temp);

    }

    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }

        inorder(root.left);
        if(prev!=null && prev.val > root.val){
            if(first==null){
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorder(root.right);

    }

    public static void main(String args[]){
        Test test=new Test();

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.right=new TreeNode(2);

        test.recoverTree(root);
    }
}
