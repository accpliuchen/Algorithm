package com.interview.exercise.exercise94;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};

    TreeNode(int val){this.val=val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}
public class Test {

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null) return  res;
        helper(res,root);
        return  res;
    }

    public static void helper(List<Integer> res, TreeNode root){
        if(root==null) return;
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);

    }

    public static List<Integer> inorderTraversal_Iterator(TreeNode root){
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            curr=stack.pop();
            result.add(curr.val);
            curr=curr.right;
        }
        return result;


    }

    public List<Integer> inorderTraversal_Deque(TreeNode root){
        List<Integer> result=new ArrayList<>();

        if(root==null){
            return result;
        }

        Deque<TreeNode> stack=new ArrayDeque<>();
        TreeNode visiting=root;

        while(visiting!=null || !stack.isEmpty()){
            if(visiting!=null){
                stack.offerFirst(visiting);
                visiting=visiting.left;
            }else{
                TreeNode curRoot=stack.pollFirst();
                result.add(curRoot.val);
                visiting=curRoot.right;
            }
        }


        return result;
    }

    public static void main(String args[]){
        TreeNode tree=new TreeNode(1);
        tree.right=new TreeNode(2);
        tree.left=new TreeNode(3);


        List<Integer> result=inorderTraversal(tree);
        System.out.println("result value is "+result.size());
    }
}
