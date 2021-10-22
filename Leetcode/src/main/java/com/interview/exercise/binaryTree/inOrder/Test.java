package com.interview.exercise.binaryTree.inOrder;

import com.interview.exercise.treeNode.TreeNode;

import java.util.*;


//left root right
public class Test {

    //Traversal
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        Deque<TreeNode> stack=new LinkedList<>();
        while(root!=null || !stack.isEmpty()){
           while(root!=null){
               stack.push(root);
               root=root.left;
           }
           TreeNode node=stack.pop();
           result.add(node.val);
           if(node.right!=null){
               root=node.right;
           }
        }

        return result;
    }


    /*recursive*/
    public List<Integer> inOrder(TreeNode root){
        List<Integer> result=new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    private void inOrder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}
