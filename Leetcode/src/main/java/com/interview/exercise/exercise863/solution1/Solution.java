package com.interview.exercise.exercise863.solution1;

//https://www.codeleading.com/article/75535864456/#1_29

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


class TreeNode{
    int val;
    TreeNode left,right;

    public TreeNode(int x){
        this.val=x;
        left=right=null;
    }
}


public class Solution {

    Map<TreeNode,TreeNode> map=new HashMap<TreeNode,TreeNode>();// parent node
    List<Integer> ans=new ArrayList<Integer>();//output the result
    TreeNode target;
    int k;

    public List<Integer> distancek(TreeNode root,TreeNode target,int k){
        this.target=target;
        this.k=k;
        getParent(root);//get parent node
        check(target,null,0);
        return ans;
    }

    public void getParent(TreeNode node){
        if(node.left!=null){
            map.put(node.left,node);
            if(node.left!=target){
                getParent(node.left);
            }
        }

        if(node.right!=null){
            map.put(node.right,node);
            if(node.right!=target){
                getParent(node.right);
            }
        }
    }

    public void check(TreeNode node,TreeNode from,int dis){
        if(dis==k){
            ans.add(node.val);
            return ;
        }

        if(node.left!=null && node.left!=from){
            check(node.left,node,dis+1);
        }

        if(node.right!=null && node.right!=from){
            check(node.right,node,dis+1);
        }

        if(map.containsKey(node) && map.get(node) != from){
            check(map.get(node), node, dis + 1);
        }
    }

    public static void printList(List list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }



    public static void main(String args[]) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(5);
        tree.right = new TreeNode(1);
        tree.left.left = new TreeNode(6);
        tree.left.right = new TreeNode(2);
        tree.right.left = new TreeNode(0);
        tree.right.right = new TreeNode(8);


        tree.left.right.left = new TreeNode(7);
        tree.left.right.right = new TreeNode(4);

        TreeNode target=tree.left;

        Solution s=new Solution();
        List result=s.distancek(tree,target,2);

        System.out.println("result size is "+result.size());

        printList(result);
    }



}
