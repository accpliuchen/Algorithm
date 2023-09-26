package com.interview.exercise.exercise297;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class Test {

      int index=0;


      public String serialize(TreeNode root) {
            List<String> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()){
                  TreeNode cur = stack.pop();
                  if(cur==null){
                        list.add("#");
                  } else{
                        list.add(cur.val+"");
                        stack.push(cur.right);
                        stack.push(cur.left);
                  }
            }
            return String.join(",", list);
      }

      public TreeNode deserialize(String data){
            String[] ser = data.split(",");
            return helper(ser);
      }

      public TreeNode helper(String[] arr){
            if(arr[index].equals("#"))
                  return null;
            TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
            index++;
            root.left = helper(arr);
            index++;
            root.right = helper(arr);
            return root;
      }

      public static void main(String args[]){
            TreeNode root=new TreeNode(1);
            root.left=new TreeNode(2);

            root.right=new TreeNode(3);
            root.right.left=new TreeNode(4);
            root.right.right=new TreeNode(5);

            String str="1,2,3,#,#,4,5";

            Test test=new Test();

            String ans=test.serialize(root);

            System.out.println(ans);

            TreeNode result=test.deserialize(str);

            System.out.println(result);
      }
}
