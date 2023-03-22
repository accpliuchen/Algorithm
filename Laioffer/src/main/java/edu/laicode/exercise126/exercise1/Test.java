package edu.laicode.exercise126.exercise1;

class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
        this.key = key;
    }
}

public class Test {

    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode one, TreeNode two) {
        // Write your solution here.

        if(root==null){
            return root;
        }

        if(root.key==one.key || root.key==two.key){
            return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,one,two);
        TreeNode right=lowestCommonAncestor(root.right,one,two);

        if(left!=null && right!=null){
            return root;
        }

        return left==null?right:left;
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(9);
        root.right = new TreeNode(12);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(14);

        TreeNode one = new TreeNode(2);
        TreeNode two = new TreeNode(14);

        Test test=new Test();


        TreeNode comm=test.lowestCommonAncestor(root,one,two);

        System.out.println("========"+comm.key);
    }
}
