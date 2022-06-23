package edu.laioffer.class7.exercise1;

//build TreeNode


class TreeNode{
    int key;
    TreeNode left;
    TreeNode right;
    TreeNode(int key){
        this.key=key;
    }
}

public class Test {

    public static void main(String args[]){
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(2);
        root.right=new TreeNode(98);

        root.left.right=new TreeNode(18);
        root.left.left=new TreeNode(1);

        root.right.right=new TreeNode(100);

    }
}
