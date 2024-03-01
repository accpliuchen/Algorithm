package com.interview.exercise.exercise513;

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
    
    
    public int findBottomLeftValue(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode current=root;
        queue.add(current);

        while(!queue.isEmpty()){
            current=queue.poll();

            if(current.right!=null){
                queue.add(current.right);
            }

            if(current.left!=null){
                queue.add(current.left);
            }
        }

        return current.val;
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);

        Test test=new Test();
        System.out.println(test.findBottomLeftValue(root));
    }
}
