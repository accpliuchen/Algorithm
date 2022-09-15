package com.interview.exercise.exercise257.dfs;


import java.util.List;
import java.util.ArrayList;

class TreeNode{
	int val;

	TreeNode left;
	TreeNode right;

	public TreeNode(){}

	TreeNode(int val){
		this.val=val;
	}

	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}

public class Test {

	public String[] binaryTreePaths(TreeNode root) {
		if(root==null) return new String[0];

		List<String> result=dfs(root);

		String[] resultArray=new String[result.size()];

		for(int i=0;i<result.size();i++){
			resultArray[i]=result.get(i);
		}
		return resultArray;
	}

	public List<String> dfs(TreeNode root){
		List<String> result=new ArrayList<>();

		if(root==null) return result;

		List<TreeNode> current=new ArrayList<>();
		current.add(root);
		dfsHelper(root,current,result);
		return result;
	}

	private void dfsHelper(TreeNode root,List<TreeNode> current,List<String> result){
		if(root==null) return;

		if(root.left==null && root.right==null){
			result.add(addArrow(current));
		}

		//branch
		if(root.left!=null){
			current.add(root.left);
			dfsHelper(root.left,current,result);
			current.remove(current.size()-1);
		}

		if(root.right!=null){
			current.add(root.right);
			dfsHelper(root.right,current,result);
			current.remove(current.size()-1);
		}
	}

	private String addArrow(List<TreeNode> currentPath){
		StringBuilder sb=new StringBuilder();
		for(TreeNode temp:currentPath){
			sb.append(temp.val).append("->");
		}
		return sb.substring(0,sb.length()-2);
	}

	public static void main(String args[]){
          TreeNode root=new TreeNode(1);
          root.left=new TreeNode(2);
          root.right=new TreeNode(3);
          root.left.right=new TreeNode(5);

          Test test=new Test();
          String[] strs=test.binaryTreePaths(root);

          for(String str:strs){
          	System.out.println(str);
          }
	}
}
