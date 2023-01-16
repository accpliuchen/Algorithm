package edu.laicode.exercise60;


class TreeNode{
	int value;

	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}
}
public class Test {

    public int findHeight(TreeNode root) {
        // Write your solution here
        int result =getHeight(root);

        return result;
    }

    private int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }
	public static void main(String args[]){

		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(8);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(4);
		root.right.right=new TreeNode(11);
	
		Test test=new Test();
		int result=test.findHeight(root);

	    System.out.println(result);
	}
}
