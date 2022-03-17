package com.interview.exercise.exercise257;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Test {

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arrayList=new ArrayList<String>();
        findPath(root,"",arrayList);

        return arrayList;
    }


    public void findPath(TreeNode root,String title,ArrayList<String> list){

        if(root==null) return ;

        if(title.length()!=0){
            title=title+"->"+root.val;
        }else{
            title=title+root.val;
        }



        if(root.left==null && root.right==null){
            list.add(title);

            return ;
        }

        findPath(root.left,title,list);
        findPath(root.right,title,list);
    }

    public static void main(String[] args) {
        TreeNode nodes=new TreeNode(1);
//        nodes.right=new TreeNode(3);
//        nodes.left=new TreeNode(2);
//        nodes.left.right=new TreeNode(5);

        Test test=new Test();
        List<String> result =test.binaryTreePaths(nodes);
        System.out.println("result size is "+ result.size());
    }
}
