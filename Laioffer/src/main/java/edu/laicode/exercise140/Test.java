package edu.laicode.exercise140;

class TreeNode {
  public int key;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int key) {
      this.key = key;
    }
}

public class Test {

	public int maxPathSum(TreeNode root) {
    // Write your solution here

    if(root==null){
      return 0;
    }

    int[] max=new int[]{Integer.MIN_VALUE};

    recursion(root,max);
    return max[0];
   }

   private int recursion(TreeNode root,int[] max){
    if(root==null){
      return 0;
    }

    int left=recursion(root.left,max);
    int right=recursion(root.right,max);

    left=left>0?left:0;
    right=right>0?right:0;

    max[0]=Math.max(max[0],Math.max(left,right)+root.key);
    return Math.max(left,right)+root.key;
   }

	public static void main(String args[]){
		TreeNode root=new TreeNode(-5);

		root.left=new TreeNode(2);
		root.right=new TreeNode(11);
		root.right.right=new TreeNode(14);
		root.right.left=new TreeNode(6);
		root.right.right.right=new TreeNode(-3);

        Test test=new Test();
        int result=test.maxPathSum(root);

        System.out.println("result value is "+ result);
	}
}
