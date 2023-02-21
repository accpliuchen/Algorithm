package com.interview.exercise.exercise103;

import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key){
        this.key=key;
    }
}

public class Test {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if (root==null){
            return ans;
        }
        int level=0;
        que.offer(root);
        while (!que.isEmpty()){
            List<Integer> subList=new LinkedList<>();
            int size=que.size();
            for (int i = 0; i < size; i++) {
                if (que.peek().left!=null){
                    que.offer(que.peek().left);
                }
                if (que.peek().right!=null){
                    que.offer(que.peek().right);
                }
                subList.add(que.poll().key);
            }
            if (level%2==1){
                Collections.reverse(subList);
            }
            ans.add(subList);
            level++;
        }
        return ans;
    }

    public static void main(String args[]){

//        TreeNode tree=new TreeNode(1);
//
//        tree.left=new TreeNode(2);
//        tree.right=new TreeNode(3);
//
//        tree.left.left=new TreeNode(4);
//        //tree.left.right=new TreeNode(4);
//
//        tree.right.right=new TreeNode(5);

        TreeNode tree=new TreeNode(3);

        tree.left=new TreeNode(9);
        tree.right=new TreeNode(20);

        tree.right.left=new TreeNode(15);
        tree.right.right=new TreeNode(7);

        Test test=new Test();
        test.zigzagLevelOrder(tree);

        System.out.println("==");
    }
}
