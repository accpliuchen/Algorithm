package com.interview.exercise.exercise863;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

public class Test {

    public static void main(String args[]){
        TreeNode tree =new TreeNode(3);
        tree.left = new TreeNode(5);
        tree.right = new TreeNode(1);
        tree.left.left=new TreeNode(6);
        tree.left.right=new TreeNode(2);
        tree.right.left= new TreeNode(0);
        tree.right.right = new TreeNode(8);


        tree.left.right.left=new TreeNode(7);
        tree.left.right.right=new TreeNode(4);

        //TreeNode target =new TreeNode(5);
        TreeNode target=tree.left;

        Test test=new Test();
        List pos=test.distanceK(tree,target,2);

        System.out.println("=============="+pos.size());
    }

    public Map<TreeNode, TreeNode> parentMap;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parentMap=new HashMap<>();

        addParentHelper(root,null);// build binary tree

        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int currLevel = 0;

        queue.add(target);

        while(!queue.isEmpty() && currLevel!=k){
            int size = queue.size();

            while(size-->0){
                TreeNode removed=queue.remove();

                System.out.println("removed.val is "+ removed.val);

                visited.add(removed);
                TreeNode parent = parentMap.get(removed);

                if (removed.left != null && !visited.contains(removed.left)) {
                    queue.add(removed.left);
                }

                if (removed.right != null && !visited.contains(removed.right)) {
                    queue.add(removed.right);
                }

                if (parent != null && !visited.contains(parent)) {
                    queue.add(parent);
                }

            }
            currLevel++;
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.remove().val);
        }

        return list;

    }


    private void addParentHelper(TreeNode node, TreeNode parent) {
        if(node==null){
            return ;
        }

        parentMap.put(node,parent);

        addParentHelper(node.left,node);
        addParentHelper(node.right,node);

    }
}
