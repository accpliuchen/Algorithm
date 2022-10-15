package edu.laicode.exercise440;

class TreeNode{

	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}
}

public class Test {
	

	public boolean exist(TreeNode root,int target){
		if(root==null){
			return false;
		}

		if(root.left==null && root.right==null && target-root.key==0){
			return true;
		}

		return exist(root.left,target-root.key) || exist(root.right,target- root.key);
	}

	public static void main(String args[]){
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.left.left=new TreeNode(1);

		root.left.left.left=new TreeNode(7);
		root.left.left.right=new TreeNode(2);
		
		root.right=new TreeNode(8);

		root.right.left=new TreeNode(3);
		root.right.right=new TreeNode(4);

		root.right.right.right=new TreeNode(1);


		Test test=new Test();
		boolean result=test.exist(root,16);
		System.out.println("result value is "+ result);
	}
}
