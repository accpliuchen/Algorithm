package com.interview.exercise.exercise783;

import java.util.List;
import java.util.ArrayList;

class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(){};

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


    public int minDiffInBst(TreeNode root){
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);

        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++)
            if(min>list.get(i+1)-list.get(i))
              min=list.get(i+1)-list.get(i);
        return min;

    }

    public void inOrder(TreeNode t,List<Integer> l){
        if(t==null) return;
        inOrder(t.left,l);
        l.add(t.val);
        inOrder(t.right,l);
    }

    public static void main(String args[]){
       TreeNode tree=new TreeNode(4);
        tree.right=new TreeNode(6);
        tree.left=new TreeNode(2);
        tree.left.left=new TreeNode(1);
        tree.left.right=new TreeNode(3);


        Test test=new Test();
        System.out.println("result value is "+ test.minDiffInBst(tree));
    }
}
