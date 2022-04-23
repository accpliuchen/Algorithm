package com.interview.exercise.exercise173;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left,right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BSTIterator{

    private TreeNode cur;
    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root){
        cur=root;
        stack=new Stack<>();
    }


    public int next(){
        while(cur!=null){
            stack.push(cur);
            cur=cur.left;
        }

        cur=stack.pop();
        int val=cur.val;
        cur=cur.right;

        return val;
    }


    public boolean hasNext(){
        if (!stack.isEmpty() || cur != null) {
            return true;
        }

        return false;
    }
}

public class Test {


    public static void main(String args[]){


        TreeNode root=new TreeNode(7);
        root.left=new TreeNode(3);
        root.right=new TreeNode(15);

        root.right.left=new TreeNode(9);
        root.right.right=new TreeNode(20);

        BSTIterator bSTIterator = new BSTIterator(root);
        bSTIterator.next();    // return 3
        bSTIterator.next();    // return 7
        bSTIterator.hasNext(); // return True
        bSTIterator.next();    // return 9
        bSTIterator.hasNext(); // return True
        bSTIterator.next();    // return 15
        bSTIterator.hasNext(); // return True
        bSTIterator.next();    // return 20
        bSTIterator.hasNext(); // return False
    }
}
