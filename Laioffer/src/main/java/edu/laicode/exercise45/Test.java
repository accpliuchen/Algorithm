package edu.laicode.exercise45;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}
}

public class Test {

	public List<Integer> postOrder(TreeNode root) {
	    // Write your solution here
	    List<Integer> result=new ArrayList<Integer>();

	    if(root==null){
	      return result;
	    }

	    Deque<TreeNode> stack=new ArrayDeque<>();
	    TreeNode prev=null;
	    stack.offerFirst(root);

	 while(!stack.isEmpty()){
	      TreeNode current=stack.peekFirst();

	      if(prev==null || current==prev.left || current==prev.right){
	         if(current.left!=null){
	           stack.offerFirst(current.left);
	         }else if(current.right!=null){
	           stack.offerFirst(current.right);
	         }else{
	           result.add(current.key);
	           stack.pollFirst();
	         }

	      }else if(prev==current.left) {
	        if(current.right!=null){
	          stack.offerFirst(current.right);
	        }else{
	          result.add(current.key);
	          stack.pollFirst();
	        }
	      }else{
	         result.add(current.key);
	         stack.pollFirst();
	      }
	      prev=current;
	    }

	 return result;

  }
	 public static void main(String args[]){
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(4);

        root.right.right=new TreeNode(11);

        Test test=new Test();
        List<Integer> result=test.postOrder(root);
        System.out.println("===");
    }
}
