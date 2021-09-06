package com.interview.exercise.exercise236;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int x){
        this.val=x;
    }
}

public class Test {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return root;
        }

        if(root.val==p.val || root.val==q.val){
            return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null){
            return root;
        }

        return left!=null?left:right;
    }


    public static void main(String args[]){
        TreeNode tree =new TreeNode(3);
        tree.left = new TreeNode(5);
        tree.right = new TreeNode(1);
        tree.left.left=new TreeNode(6);
        tree.left.right=new TreeNode(2);
        tree.right.left= new TreeNode(0);
        tree.right.right = new TreeNode(8);


        tree.left.right.left=new TreeNode(7);
        tree.left.right.right=new TreeNode(4);

        //TreeNode target =new TreeNode(5);
        TreeNode p=tree.left;
        TreeNode q=tree.right;

        Test test=new Test();
        TreeNode node=test.lowestCommonAncestor(tree,p,q);

        System.out.println("node value is "+node.val);
    }
}
