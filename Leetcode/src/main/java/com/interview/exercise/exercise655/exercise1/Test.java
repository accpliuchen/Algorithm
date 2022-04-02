package com.interview.exercise.exercise655.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Test {

    public List<List<String>> printTree(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }

        int depth=getDepth(root);

        System.out.println("depth value is "+ depth);

        int width=(int)(Math.pow(2,depth)-1);
        width=width>0?width:1;

        System.out.println("width value is "+ width);

        String[][] result=new String[depth][width];
        List<List<String>> res=new LinkedList<>();

        fill(result,0,0,width-1,root);


        for(int i=0;i<result.length;i++){
            LinkedList<String> linkedList=new LinkedList<>();
            for(int j=0;j<result[i].length;j++){
                if(result[i][j]==null){
                    linkedList.add("");
                }else{
                    linkedList.add(result[i][j]);
                }
            }

            res.add(linkedList);
        }

        return res;
    }

    private void fill(String[][] ints,int depth,int start,int end,TreeNode node){
        if(node==null) return;

        int mid=(end+start)/2;
        ints[depth][mid]=String.valueOf(node.val);
        fill(ints,depth+1,start,mid-1,node.left);
        fill(ints,depth+1,mid+1,end,node.right);
    }

    private int getDepth(TreeNode root){
        if(root==null) return 0;
        int left=getDepth(root.left)+1;
        int right=getDepth(root.right)+1;
        return right>left?right:left;
    }

    public static void main(String[] args) {

        TreeNode  root=new TreeNode(1);
        root.left=new TreeNode(2);

        Test test=new Test();
        test.printTree(root);

    }
}
