package edu.laicode.exercise138;


class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}

}

public class Test {

	public int maxPathSum(TreeNode root) {
		int[] result = new int[]{Integer.MIN_VALUE};

		helper(root, result);

		return result[0];
	}

	private int helper(TreeNode root, int[] result) {
		if (root == null) {
			return 0;
		}

		int left = helper(root.left, result);
		int right = helper(root.right, result);

		if (root.left == null) {
			return right + root.key;
		} else if (root.right == null) {
			return left + root.key;
		} else {
			int sum = right + left + root.key;

			if (sum > result[0]) {
				result[0] = sum;
			}

			return Math.max(left, right) + root.key;
		}
	}

    
	public static void main(String args[]){
		TreeNode root=new TreeNode(-15);
		root.left=new TreeNode(2);
		root.right=new TreeNode(11);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(14);

		Test test=new Test();
		int result=test.maxPathSum(root);

		System.out.println("result value is "+ result);
	}
}
