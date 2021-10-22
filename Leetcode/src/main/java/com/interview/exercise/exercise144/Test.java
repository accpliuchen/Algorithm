package com.interview.exercise.exercise144;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val){this.val=val;}
    TreeNode(int val, TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Test {

    public static List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        List<Integer> resultList=new ArrayList<Integer>();

        if(root==null){
            return resultList;
        }else{
            st.push(root);
        }

        while(!st.isEmpty()){
            TreeNode tempNode = st.pop();
            resultList.add(tempNode.val);

            if (tempNode.right != null) {
                st.push(tempNode.right);
            }

            if (tempNode.left != null) {
                st.push(tempNode.left);
            }
        }

        return resultList;
    }

    public static void main(String args[]){
        TreeNode tree=new TreeNode(1);
        tree.right=new TreeNode(2);
        tree.left=new TreeNode(3);

        List<Integer> result=preorderTraversal(tree);
        System.out.println("result value is "+result.size());
    }
}
