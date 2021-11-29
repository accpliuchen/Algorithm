package com.interview.exercise.exercise1110;

//https://leetcode.com/problems/delete-nodes-and-return-forest/

import java.util.*;

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

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> tree=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();

        for(int n:to_delete){
            set.add(n);
        }

        if(!set.contains(root.val)){
            tree.add(root);
        }

        dfs(root,set.contains(root.val),set,tree);

        return tree;
    }

    private void dfs(TreeNode node,boolean shouldDelete,HashSet<Integer> set,List<TreeNode> list){
        if(node==null) return ;

        if(node.left!=null){
            boolean removeLeft=set.contains(node.left.val);
            dfs(node.left,removeLeft,set,list);
            if(shouldDelete && !removeLeft) list.add(node.left);
            if(removeLeft) node.left=null;
        }

        if(node.right!=null){
            boolean removeRight=set.contains(node.right.val);
            dfs(node.right,removeRight,set,list);
            if(shouldDelete && !removeRight) list.add(node.right);
            if(removeRight) node.right=null;
        }
    }


    public static void main(String args[]){
        TreeNode treeNode=new TreeNode(1);

        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);

        treeNode.left.left=new TreeNode(4);
        treeNode.left.right=new TreeNode(5);

        treeNode.right.left=new TreeNode(6);
        treeNode.right.right=new TreeNode(7);

        int[] todelete=new int[]{3,5};

        Test test=new Test();
        List<TreeNode> tree=test.delNodes(treeNode,todelete);

        System.out.println("result value is "+ tree.size());

    }
}
