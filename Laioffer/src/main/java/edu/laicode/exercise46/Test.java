package edu.laicode.exercise46;

class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}
}
public class Test {


	public int getHeight(TreeNode root){
		if(root==null) return 0;

		int left=getHeight(root.left);
		int right=getHeight(root.right);

		return Math.max(left,right)+1;
	}

	public boolean isBalanced(TreeNode root){
		if(root==null) return true;

		
		boolean left=isBalanced(root.left);
		boolean right=isBalanced(root.right);

		if(!left || !right) return false;

		int leftHeight=getHeight(root.left);
		int rightHeight=getHeight(root.right);

		if(Math.abs(leftHeight-rightHeight)>1){
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
	}

	public static void main(String args[]){

		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(8);


		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(4);

		root.right.right=new TreeNode(11);

        Test test=new Test();
		int height=test.getHeight(root);

		System.out.println("Height value is "+ height);
	}
}
