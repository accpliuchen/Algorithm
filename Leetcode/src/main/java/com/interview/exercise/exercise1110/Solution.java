package com.interview.exercise.exercise1110;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

//https://blog.csdn.net/qq_46105170/article/details/109445032
//https://blog.csdn.net/katrina95/article/details/95042004
//https://blog.csdn.net/m1f2c3/article/details/94991719

public class Solution {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for(int num:to_delete){
            set.add(num);
        }

        if(!set.contains(root.val)){
            list.add(root);
        }

        if(to_delete.length==0){
            list.add(root);
            return list;
        }
        helper(root,set,list);

        return list;
    }

    private void helper(TreeNode root,Set<Integer> set,List<TreeNode> list){
       if(root!=null){
           if(set.contains(root.val)){
               if(root.left!=null && !set.contains(root.left.val)){
                   list.add(root.left);
               }

               if(root.right!=null && !set.contains(root.right.val)){
                   list.add(root.right);
               }
           }

           helper(root.left,set,list);
           helper(root.right,set,list);

           if(root.left!=null && set.contains(root.left)){
               root.left=null;
           }

           if(root.right!=null && set.contains(root.right)){
               root.right=null;
           }
       }
    }
}
