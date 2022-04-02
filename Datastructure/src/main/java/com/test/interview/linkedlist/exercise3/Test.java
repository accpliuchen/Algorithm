package com.test.interview.linkedlist.exercise3;

import java.util.*;

class TreeNode {
    int val;
    TreeNode right, left;

    TreeNode(int x) {
        val = x;
    }
}

public class Test {

    public List<Integer> commonNodes(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();

        while (root1 != null) {
            stack1.push(root1);
            root1 = root1.left;
        }

        while (root2 != null) {
            stack2.push(root2);
            root2 = root2.left;
        }

        while (stack1.size() > 0 && stack2.size() > 0) {
            TreeNode node1 = stack1.peek();
            TreeNode node2 = stack2.peek();

            if (node1.val == node2.val) {
                list.add(node1.val);
                node1 = stack1.pop().right;
                node2 = stack2.pop().right;

                while (node1 != null) {
                    stack1.push(node1);
                    node1 = node1.left;
                }

                while (node2 != null) {
                    stack2.push(node2);
                    node2 = node2.left;
                }
            } else if (node1.val < node2.val) {
                node1 = stack1.pop().right;

                while (node1 != null) {
                    stack1.push(node1);
                    node1 = node1.left;
                }
            } else {
                node2 = stack2.pop().right;
                while (node2 != null) {
                    stack2.push(node2);
                    node2 = node2.left;
                }
            }
        }
        return list;
    }

}


