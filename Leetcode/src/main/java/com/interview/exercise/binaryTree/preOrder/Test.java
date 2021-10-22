package com.interview.exercise.binaryTree.preOrder;


//https://www.ucloud.cn/yun/66117.html
//order root left right
import com.interview.exercise.treeNode.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test {


    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();

        if(root==null) return result;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        TreeNode n=root;
        while(!stack.isEmpty()){
            n=stack.pop();
            result.add(n.val);

            if(n.right!=null) stack.push(n.right);
            if(n.left!=null) stack.push(n.left);

        }
        return result;
    }

    /*recursive*/
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result=new LinkedList<>();
        preHelper(root,result);
        return result;
    }

    private void preHelper(TreeNode node,List<Integer> result){
        if(node==null) return;
        result.add(node.val);
        if(node.left!=null) preHelper(node.left,result);
        if(node.right!=null) preHelper(node.right,result);
    }

    public static void main(String args[]){

    }
}
