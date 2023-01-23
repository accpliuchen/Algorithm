package edu.laicode.exercise43;

import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;

class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key){
        this.key=key;
    }
}

public class Test {

    public List<Integer> inOrder(TreeNode root) {
        // Write your solution here
        List<Integer> result=new ArrayList<>();

        if(root==null){
          return result;
        }

        Deque<TreeNode> stack=new ArrayDeque<>();
        TreeNode helper=root;

        while(helper!=null || !stack.isEmpty()){
          if(helper!=null){
             stack.offerFirst(helper);
             helper=helper.left;
          }else{
            TreeNode curRoot=stack.pollFirst();
            result.add(curRoot.key);
            helper=curRoot.right;
          }
        }

        return result;
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(2);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        root.right.right=new TreeNode(9);

        Test test=new Test();
        List<Integer> result=test.inOrder(root);
        System.out.println("===");
    }
}
