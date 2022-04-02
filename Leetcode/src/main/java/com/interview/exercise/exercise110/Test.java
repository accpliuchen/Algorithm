package com.interview.exercise.exercise110;

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

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        int leftHeight=helper(root.left);
        int rightHeight=helper(root.right);

        if(Math.abs(leftHeight-rightHeight)>1) return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int helper(TreeNode root){
        if(root==null) return 0;

        System.out.println("root left value is "+ root.left);
        System.out.println("root right value is "+ root.right);


        System.out.println("helper root left value is "+ helper(root.left));
        System.out.println("helper root right value is "+ helper(root.right));


        return 1+Math.max(helper(root.left),helper(root.right));

    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(3);
        node.left=new TreeNode(9);
        node.right=new TreeNode(20);
        node.right.left=new TreeNode(15);
        node.right.right=new TreeNode(7);

        Test test=new Test();
        boolean result=test.isBalanced(node);

        System.out.println("result value is "+ result);
    }
}
