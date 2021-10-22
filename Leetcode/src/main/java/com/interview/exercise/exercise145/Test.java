package com.interview.exercise.exercise145;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};

    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Test {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        adder(root,list);

        return  list;
    }

    private void adder(TreeNode root,List<Integer> list){
        if(root==null) return ;

        adder(root.left,list);
        adder(root.right,list);
        list.add(root.val);
    }

    public static void main(String args[]){
        TreeNode tree=new TreeNode(1);
        tree.right=new TreeNode(2);
        tree.left=null;
        tree.right.left=new TreeNode(3);

        Test test=new Test();
        List result=test.postorderTraversal(tree);
        System.out.println("result value is "+result.toArray().toString());
    }

}
