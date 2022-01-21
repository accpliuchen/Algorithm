package com.test.interview.binarytree.bfs;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

//https://mrfzh.github.io/2019/07/21/%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84-dfs-%E5%92%8C-bfs%EF%BC%88java-%E5%AE%9E%E7%8E%B0%EF%BC%89/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Test{

    private List<Integer> res=new ArrayList<>();

    private void bfs(TreeNode root){
        LinkedList<TreeNode> queue=new LinkedList<>();

        if(root!=null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            TreeNode current=queue.remove();
            res.add(current.val);

            if(current.left!=null){
                queue.add(current.left);
            }

            if(current.right!=null){
                queue.add(current.right);
            }
        }

        System.out.println("");
    }

    private void bfs_recursion(TreeNode root) {
        List<List<Integer>> bfsResult=new ArrayList<>();
        find(bfsResult,0,root);

        for(int i=0;i<bfsResult.size();i++){
            List<Integer> current=bfsResult.get(i);
            res.addAll(current);
        }

        System.out.println("");
    }

    private void find(List<List<Integer>> result,int level,TreeNode node){
        if(node==null) return ;

        if(res.size()<=level){
            List<Integer> list=new ArrayList<>();
            list.add(node.val);
            result.add(list);
        }else{
            List<Integer> list=result.get(level);
            list.add(node.val);
        }

        find(result,level+1,node.left);
        find(result,level+1,node.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(7);
        root.left.right=new TreeNode(8);
        root.left.right.left=new TreeNode(11);
        root.left.right.right=new TreeNode(12);


        root.right=new TreeNode(5);
        root.right.left=new TreeNode(9);
        root.right.right=new TreeNode(15);
        root.right.right.left=new TreeNode(13);
        root.right.right.right=new TreeNode(14);

        Test test=new Test();
        test.bfs(root);
    }
}



