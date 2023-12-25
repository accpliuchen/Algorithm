package com.interview.exercise.exercise199;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){};
    public TreeNode(int val){
        this.val=val;
    }
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Test {

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        queue.offer(root);
        queue.offer(null);

        while (queue.size() != 1) {
            TreeNode node = queue.poll();
            if (node == null) {
                queue.offer(null);
            } else {
                TreeNode nextNode = queue.peek();
                if (nextNode == null) {
                    // this is the end of the level
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);

        root.right=new TreeNode(3);
        root.right.right=new TreeNode(4);

        Test test=new Test();

        test.rightSideView(root).stream().forEach(System.out::println);

    }
}
