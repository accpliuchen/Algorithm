package com.interview.exercise.exercise257.recursion;

import java.util.List;
import java.util.ArrayList;

// public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }


class TreeNode{
	int val;

	TreeNode left;
	TreeNode right;

	public TreeNode(){}

	TreeNode(int val){
		this.val=val;
	}

	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}

public class Test {

 	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        
        if(root==null) return result;
        
        if(root.left==null && root.right==null){
            result.add(root.val+"");
            return result;
        }
        
        List<String> leftSub=binaryTreePaths(root.left);
        List<String> rightSub=binaryTreePaths(root.right);
        
        for(String path:leftSub){
            result.add(root.val+"->"+path);
        }
        
        for(String path:rightSub){
            result.add(root.val+"->"+path);
        }
        
        return result;
    }

	public static void main(String args[]){
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.right=new TreeNode(3);
          root.left.right=new TreeNode(5);

          Test test=new Test();
          test.binaryTreePaths(root);

          System.out.println("===");
	}
}
