package com.interview.exercise.exercise100;

//https://blog.csdn.net/zangdaiyang1991/article/details/90147279

public class Test {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }

        return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
