package com.interview.exercise.exercise1038;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

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

    TreeNode currNode=null;

    int sum=0;

    public TreeNode bstToGst(TreeNode root){
        helper(root);
        return root;
    }
    
    public int helper(TreeNode currNode){
        if(currNode==null){
            return 0;
        }

        helper(currNode.right);
        sum+=currNode.val;
        currNode.val=sum;

        if(currNode.left!=null){
            helper(currNode.left);
        }
        return sum;
    }


    public static void main(String args[]){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(1);
        root.right=new TreeNode(6);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(7);
        root.right.right.right=new TreeNode(8);

        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.left.right.right=new TreeNode(3);

        Test test=new Test();
        TreeNode current=test.bstToGst(root);

        System.out.println("");
    }
}
