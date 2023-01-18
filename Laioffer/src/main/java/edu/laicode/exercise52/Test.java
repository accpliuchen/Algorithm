package edu.laicode.exercise52;


class TreeNode{
	int value;

	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}
}

public class Test {

	public TreeNode search(TreeNode root, int key) {
		// Write your solution here

		if(root==null || root.value==key){
			return root;
		}

		if(key<=root.value){
			return search(root.left,key);
		}else{
			return search(root.right,key);
		}
	}

	public static void main(String args[]){
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);

		Test test=new Test();
		TreeNode node=test.search(root,2);

		System.out.println(node.value);
	}
}
