package com.interview.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Test {

    public List<List<Integer>> verticalOrder(TreeNode root) {
          List<List<Integer>> res = new ArrayList<List<Integer>>();
          if(root == null){
            return res;
          }

          HashMap<Integer, List<Integer>> colBucket = new HashMap<Integer, List<Integer>>();
          LinkedList<TreeNode> que = new LinkedList<TreeNode>();
          LinkedList<Integer> cols = new LinkedList<Integer>();

          int min = 0;
          int max = 0;

          que.add(root);
          cols.add(0);
          while(!que.isEmpty()){
            TreeNode tn = que.poll();
            int col = cols.poll();
            if(!colBucket.containsKey(col)){
                colBucket.put(col, new ArrayList<Integer>());
            }
            colBucket.get(col).add(tn.val);
            min = Math.min(min, col);
            max = Math.max(max, col);

            if(tn.left != null){
             que.add(tn.left);
             cols.add(col-1);
            }

            if(tn.right != null){
             que.add(tn.right);
             cols.add(col+1);
            }
           }

          for(int i = min; i<=max; i++){
             res.add(colBucket.get(i));
          }
          return res;
    }

    public static void main(String[] args) {
        Test test=new Test();

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(1);
        root.left.right.right=new TreeNode(5);


        root.right=new TreeNode(1);
        root.right.right=new TreeNode(7);

        List<List<Integer>> result=test.verticalOrder(root);
        System.out.println("");
    }
}
