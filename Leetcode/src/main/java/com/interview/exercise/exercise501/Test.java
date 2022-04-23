package com.interview.exercise.exercise501;

//https://www.youtube.com/watch?v=v4F4x_uwMb8

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){ this.val=val;}
    TreeNode(int val, TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}


public class Test {

    Integer prev=null;
    int count=1;
    int max=0;

    public int[] findMode(TreeNode root) {
        List<Integer> modes=new ArrayList();

        traverse(root,modes);

        int[] result=new int[modes.size()];

        for(int i=0;i<modes.size();i++){
            result[i]=modes.get(i);
        }

        return result;
    }

    public void traverse(TreeNode node, List<Integer> modes){
        if(node==null) return;

        traverse(node.left,modes);

        if(prev!=null){
            if(prev==node.val){
                count++;
            }else{
                count=1;
            }
        }

        if(count>max){
            max=count;
            modes.clear();
            modes.add(node.val);
        }else if(count==max){
            modes.add(node.val);
        }

        prev=node.val;

        traverse(node.right,modes);
    }

    public static void main(String args[]){
        TreeNode treeNode=new TreeNode(1);

        treeNode.left=new TreeNode(2);
        treeNode.left.right=new TreeNode(2);

        Test test=new Test();
        int[] result=test.findMode(treeNode);

        for(int arr:result){
            System.out.println(arr);
        }
    }
}
