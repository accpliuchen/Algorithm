package com.interview.exercise.exercise103;

import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key){
        this.key=key;
    }
}

public class Test {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList();

        if(root==null){
            return result;
        }

        Deque<TreeNode> stack=new LinkedList<TreeNode>();
        boolean is_order_left = true;
        stack.offerFirst(root);
        int layer=0;

        while(!stack.isEmpty()){
            int size=stack.size();
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(layer==0){
                    TreeNode tmp=stack.pollLast();
                    cur.add(tmp.key);

                    if(tmp.right!=null){
                        stack.offerFirst(tmp.right);
                    }

                    if(tmp.left!=null){
                        stack.offerFirst(tmp.left);
                    }

                }else{
                    TreeNode tmp=stack.pollLast();
                    cur.add(tmp.key);

                    if(tmp.right!=null){
                        stack.offerFirst(tmp.right);
                    }

                    if(tmp.left!=null){
                        stack.offerFirst(tmp.left);
                    }


                }
            }
            layer=1-layer;
            result.add(cur);
        }


        return result;
    }

    public static void main(String args[]){

        TreeNode tree=new TreeNode(1);

        tree.left=new TreeNode(2);
        tree.right=new TreeNode(3);

        tree.left.left=new TreeNode(4);
        //tree.left.right=new TreeNode(4);

        tree.right.right=new TreeNode(5);

        Test test=new Test();
        test.zigzagLevelOrder(tree);

        System.out.println("==");
    }
}
