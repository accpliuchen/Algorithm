package com.test.interview.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {

    String value;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode() {

    }
    public TreeNode(String d) {
        value=d;
    }

    public TreeNode(TreeNode left,TreeNode right,String d) {
        leftNode=left;
        rightNode=right;
        value=d;
    }


    public static void main(String args[]){
        TreeNode head=new TreeNode("A");
        TreeNode second=new TreeNode("B");
        TreeNode three=new TreeNode("C");
        TreeNode four=new TreeNode("D");
        TreeNode five=new TreeNode("E");
        TreeNode six=new TreeNode("F");
        TreeNode seven=new TreeNode("G");

        head.rightNode=three;
        head.leftNode=second;
        second.rightNode=five;
        second.leftNode=four;
        three.rightNode=seven;
        three.leftNode=six;

        TreeNode tree=new TreeNode();
        //tree.depthFirstSearch(head);
        tree.boradFirstFirstSearch(head);

    }

    public void depthFirstSearch(TreeNode nodeHead){
        if(nodeHead==null){
            return ;
        }

        Stack<TreeNode> myStack=new Stack<>();
        myStack.add(nodeHead);

        while (!myStack.isEmpty()){
            TreeNode node=myStack.pop();
            System.out.print(node.value+" ");
            if(node.rightNode!=null) {
                myStack.push(node.rightNode);
            }
            if(node.leftNode!=null) {
                myStack.push(node.leftNode);
            }
        }

    }


    public void boradFirstFirstSearch(TreeNode nodeHead){
        if(nodeHead==null){
            return;
        }

        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.add(nodeHead);

        while(!myQueue.isEmpty()) {
            TreeNode node=myQueue.poll();
            System.out.print(node.value+" ");
            if(null!=node.leftNode) {
                myQueue.add(node.leftNode);
            }
            if(null!=node.rightNode) {
                myQueue.add(node.rightNode);
            }

        }
    }

}
