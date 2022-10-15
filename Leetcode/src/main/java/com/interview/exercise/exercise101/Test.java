package com.interview.exercise.exercise101;


class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class Test {

    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,root.right);
    }
    
    private boolean isSameTree(TreeNode left,TreeNode right){
         if(left==null || right==null){
             return left==null && right==null;
         }else if(left.val==right.val){
             return isSameTree(left.left,right.right) && isSameTree(left.right,right.left);
         }
         
         return false;
    }

	public static void main(String args[]){
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);

		root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);

        Test test=new Test();
        boolean result=test.isSymmetric(root);

        System.out.println("result value is "+ result);
	}
}
