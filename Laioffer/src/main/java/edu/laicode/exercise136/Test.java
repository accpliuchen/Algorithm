package edu.laicode.exercise136;


class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}
}

public class Test {

    public int largestSmaller(TreeNode root,int target){
    	int result=Integer.MIN_VALUE;

    	while(root!=null){
    		if(root.key<target){
    			if(root.key>result){
    				result=root.key;
    			}
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
		int result=test.largestSmaller(root,3);
		System.out.println(result);
	}
}
