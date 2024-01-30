package com.interview.exercise.exercise235;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}

public class Test {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }

        if(root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }

        if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;

    }

    public static void main(String args[]) {
        TreeNode tree = new TreeNode(6);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(8);
        tree.left.left = new TreeNode(0);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(7);
        tree.right.right = new TreeNode(8);


        tree.left.right.left = new TreeNode(3);
        tree.left.right.right = new TreeNode(5);

        //TreeNode target =new TreeNode(5);
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(5);

        Test test = new Test();
        TreeNode node = test.lowestCommonAncestor(tree, p, q);

        System.out.println("node value is " + node.val);
    }
}
