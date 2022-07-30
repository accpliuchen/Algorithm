package edu.laicode.exercise141;

import java.util.Set;
import java.util.HashSet;

class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int key){
		this.key=key;
	}
}
public class Test {

    public boolean exist(TreeNode root,int target){
       if(root==null){
       	return false;
       }

       Set<Integer> prefixSum=new HashSet<>();
       prefixSum.add(0);
       
       return helperDFS(root,target,prefixSum,0);

    }

    private boolean helperDFS(TreeNode root,int target,Set<Integer> prefixSum,int preSum){
    	preSum+=root.key;

    	if(prefixSum.contains(preSum-target)){
    		return true;
    	}

    	boolean needRemove=prefixSum.add(preSum);

    	if(root.left!=null && helperDFS(root.left,target,prefixSum,preSum)){
    		return true;
    	}

		if(root.right!=null && helperDFS(root.right,target,prefixSum,preSum)){
    		return true;
    	}

    	if(needRemove){
    		prefixSum.remove(preSum);
    	}

    	return false;

    }

	public static void main(String args[]){
        TreeNode tree=new TreeNode(5);

        tree.left=new TreeNode(2);
        tree.right=new TreeNode(11);

        tree.right.left=new TreeNode(6);
        tree.right.left.left=new TreeNode(3);
        tree.right.right=new TreeNode(14);

        Test test=new Test();
        boolean result=test.exist(tree,17);

        System.out.println("result value is "+ result);
	}
}
