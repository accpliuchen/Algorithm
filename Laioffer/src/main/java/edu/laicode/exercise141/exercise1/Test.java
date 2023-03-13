package edu.laicode.exercise141.exercise1;

import java.util.HashSet;
import java.util.Set;

class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}
}

public class Test {

    int count=0;
    public boolean exist(TreeNode root,int target){
    	if(root==null){
    		return false;
    	}

    	Set<Integer> prefixSum=new HashSet<>();

    	prefixSum.add(0);

    	boolean result=dfs(root,target,prefixSum,0);

		System.out.println(count);
		return result;
    }

    private boolean dfs(TreeNode root,int target,Set<Integer> prefixSum,int preSum){
    	preSum+=root.key;

    	if(prefixSum.contains(preSum-target)){
			count++;
    		return true;
    	}

    	boolean needRemove=prefixSum.add(preSum);

    	if(root.left!=null){
    		if(dfs(root.left,target,prefixSum,preSum)){
    			return true;
    		}
    	}

    	if(root.right!=null){
    		if(dfs(root.right,target,prefixSum,preSum)){
    			return true;
    		}
    	}

    	if(needRemove){
    		prefixSum.remove(preSum);
    	}

        return false;		
    }

	public static void main(String args[]){
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(2);
		root.right=new TreeNode(11);

		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(14);

		root.right.left.left=new TreeNode(3);

		Test test=new Test();
		boolean result = test.exist(root,17);


//		TreeNode root=new TreeNode(1);
//		root.left=new TreeNode(2);
////		root.right=new TreeNode(11);
////
////		root.right.left=new TreeNode(6);
////		root.right.right=new TreeNode(14);
////
////		root.right.left.left=new TreeNode(3);
//
//		Test test=new Test();
//		boolean result = test.exist(root,1);

		System.out.println("result value is "+ result);
	}
}
