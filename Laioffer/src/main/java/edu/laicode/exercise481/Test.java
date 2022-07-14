package edu.laicode.exercise481;


class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int key){
		this.key=key;
	}
}

public class Test {

	  public int countUnivalSubtrees(TreeNode root) {
	    isUnival(root, Integer.MAX_VALUE);
	    return ans;
	  }

	  private int ans = 0;

	  private boolean isUnival(TreeNode root, int val) {
	    if (root == null)
	      return true;

	    if (isUnival(root.left, root.key) & isUnival(root.right, root.key)) {
	      ++ans;
	      return root.key == val;
	    }

	    return false;
	  }

	public static void main(String args[]){
		TreeNode node=new TreeNode(5);
		node.left=new TreeNode(1);
		node.right=new TreeNode(5);

		node.right.right=new TreeNode(5);

		node.left.left=new TreeNode(5);
		node.left.right=new TreeNode(5); 

		Test test=new Test();
		int result=test.countUnivalSubtrees(node);

		System.out.println("result : "+result);
	}
}
