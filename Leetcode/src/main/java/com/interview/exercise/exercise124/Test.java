package com.interview.exercise.exercise124;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
    
    public TreeNode(){}
    public TreeNode(int val){
    	this.val=val;
    }
    public TreeNode(int val,TreeNode left,TreeNode right){
    	this.val=val;
    	this.left=left;
    	this.right=right;
    }
}

public class Test {

	public int maxPathSum(TreeNode root) {
        maxSinglePath(root);
        return max;
    }
    
    int max = Integer.MIN_VALUE;
    int maxSinglePath(TreeNode node) {
        if (node == null)   return 0;
        
        int left = maxSinglePath(node.left);
        int right = maxSinglePath(node.right);
        
        int maxSinglePathSum = node.val + Math.max(0, Math.max(left, right));
        max = Math.max(max, Math.max(maxSinglePathSum, node.val + left + right));
        return maxSinglePathSum;
    }

    int hashFunction(String s){
    	int hash=0;
    	for(int i=0;i<s.length();i++){
    		hash+=(i+1)*(s.charAt(i)-'a'+1);
    	}
    	return hash;
    }

	public static void main(String args[]){
		// TreeNode root=new TreeNode(1);
		// root.left=new TreeNode(2);
		// root.right=new TreeNode(3);

		// TreeNode root=new TreeNode(-10);
		// root.left=new TreeNode(9);
		// root.right=new TreeNode(20);
		// root.right.left=new TreeNode(15);
		// root.right.right=new TreeNode(7);


		Test test=new Test();
		// int result=test.maxPathSum(root);

		// System.out.println("result value is "+ result);

         
//		String str="abeaa";
        String str1="bvvv";
		System.out.println(test.hashFunction(str1));

        String str2="xxxw";
        System.out.println(test.hashFunction(str2));
	}
}
