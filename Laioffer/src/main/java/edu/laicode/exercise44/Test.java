package edu.laicode.exercise44;

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

	public void preOrder(TreeNode root){
		if(root==null){
			return;
		}

		Deque<TreeNode> stack=new ArrayDeque<TreeNode>();
		stack.offerFirst(root);

		while(!stack.isEmpty()){
			TreeNode cur=stack.pollFirst();

			System.out.println(cur.key);

			if(cur.right!=null){
				stack.offerFirst(cur.right);
			}

			if(cur.left!=null){
				stack.offerFirst(cur.left);
			}			
		}
	}

	public static void main(String args[]){
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(2);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3); 

        root.right.right=new TreeNode(9);

        Test test=new Test();
        test.preOrder(root);

        System.out.println("===");
	}
}
