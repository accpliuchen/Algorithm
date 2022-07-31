package edu.laicode.exercise135;


class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	} 
}

public class Test {

	public int closest(TreeNode root,int target){
		int result=root.key;

		while(root!=null){

      		if(result==target){
      			return result;
      		}else if(Math.abs(root.key-target) < Math.abs(result-target)){
      			result=root.key;
      		}

      		if(root.key<target){
      			root=root.right;
      		}else{
      			root=root.left;
      		}
		}

		return result;

	}

	public static void main(String args[]){
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(2);
		root.right=new TreeNode(11);

		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(14);

		Test test=new Test();

		int result=test.closest(root,10);

		System.out.println("result value is "+ result);
	}
}
