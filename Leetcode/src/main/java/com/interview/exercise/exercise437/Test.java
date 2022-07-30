package com.interview.exercise.exercise437;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(){}

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

    public int pathSum(TreeNode root,int targetSum){
    	return pathSum(root,targetSum,new ArrayList());
    }

    public int pathSum(TreeNode root,long targetSum,List<Integer> path){
       if(root==null){
       	return 0;
       }

       path.add(root.val);

       int pathCount=0;
       long sum=0;

       for(int i=path.size()-1;i>=0;i--){
           sum+=path.get(i);
           if(sum==targetSum){
           	pathCount+=1;
           }
       }

       pathCount+=pathSum(root.left,targetSum,path);
       pathCount+=pathSum(root.right,targetSum,path);

       path.remove(path.size()-1);

       return pathCount;
    }

	public static void main(String args[]){
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.left.left=new TreeNode(3);

        root.left.right=new TreeNode(2);
        root.left.right.right=new TreeNode(1);

		root.left.left.left=new TreeNode(3);
		root.left.left.right=new TreeNode(-2);


		root.right=new TreeNode(-3);
		root.right.right=new TreeNode(11);

        Test test=new Test();
        int result=test.pathSum(root,8);

        System.out.println("result value is "+ result);
	}
}
