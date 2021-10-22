package com.interview.exercise.binaryTree.postOrder;

import com.interview.exercise.treeNode.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

//left right root
public class Test {

    //recursive
//    public List<Integer> postOrder(TreeNode root){
//        List<Integer> result=new ArrayList<>();
//        postOrder(root,result);
//        return result;
//    }
//
//    private void postOrder(TreeNode root,List<Integer> result){
//        if(root==null) return;
//        postOrder(root.left);
//        postOrder(root.right);
//        result.add(root.val);
//    }

    //Traversal

    public List<Integer> postOrder(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> stack=new LinkedList<>();
        stack.add(root);

        if(!stack.isEmpty()){
            root=stack.pop();
            result.add(root.val);
            if(root.left!=null) stack.push(root.left);
            if(root.right!=null) stack.push(root.right);
        }
        Collections.reverse(result);

        return result;
    }

    public static  void main(String args[]){

    }
}
