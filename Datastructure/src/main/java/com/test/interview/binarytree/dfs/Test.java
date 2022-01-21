package com.test.interview.binarytree.dfs;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Test{
    private List<Integer> res = new ArrayList<>();

    private void dfs_recursion(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val);
        res.add(root.val);

        dfs_recursion(root.left);
        dfs_recursion(root.right);
    }

    private void dfs(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode current=root;

        while(current!=null){
            res.add(current.val);

            if(current.right!=null){
                stack.push(current.right);
            }

            current=current.left;
            if(current==null && !stack.isEmpty()){
                current=stack.pop();
            }
        }

        System.out.println("");
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(7);
        root.left.right=new TreeNode(8);
        root.left.right.left=new TreeNode(11);
        root.left.right.right=new TreeNode(12);


        root.right=new TreeNode(5);
        root.right.left=new TreeNode(9);
        root.right.right=new TreeNode(15);
        root.right.right.left=new TreeNode(13);
        root.right.right.right=new TreeNode(14);

        Test test=new Test();

        //test.dfs_recursion(root);

        test.dfs(root);
    }
}


