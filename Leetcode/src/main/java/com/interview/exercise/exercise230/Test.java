package com.interview.exercise.exercise230;

import java.lang.reflect.Array;
import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
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

    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr){

        if(root==null) return arr;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return  arr;
    }

    public int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> num=inorder(root,new ArrayList<Integer>());
        return num.get(k-1);
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.left.left.left=new TreeNode(1);

        Test test=new Test();
        int result=test.kthSmallest(root,3);

        System.out.println(result);
    }
}
