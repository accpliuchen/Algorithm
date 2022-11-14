package com.interview.exercise.exercise653;


import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(){

	}

	TreeNode(int val){
		this.val=val;
	}

	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}

public class  Test {

	public boolean findTarget(TreeNode root,int k){
		Set<Integer> set=new HashSet();

		Queue<TreeNode> queue=new LinkedList();
        queue.add(root);

		while(!queue.isEmpty()){
			if(queue.peek()!=null){
				TreeNode node=queue.remove();

				if(set.contains(k-node.val)){
					return true;
				}

				set.add(node.val);

				queue.add(node.right);
                queue.add(node.left);
			}else{
				queue.remove();
			}
		}

		return false;
	}

	public static void main(String args[]){
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(6);

		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(4);

		root.right.right=new TreeNode(7);


		Test test=new Test();
        boolean result=test.findTarget(root,9);

        System.out.println("result value is "+ result);

	}
}
