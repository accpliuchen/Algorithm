package edu.laicode.exercise178;

class TreeNode {
  public int key;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int key) {
    this.key = key;
  }
}

public class Test {

     public TreeNode reverse(TreeNode root) {
        // Write your solution here
//        if(root==null || root.left==null){
//          return root;
//        }
//
//        TreeNode newRoot=reverse(root.left);
//        root.left.right=root.right;
//        root.left.left=root;
//        root.left=null;
//        root.right=null;
//        return newRoot;

         //Iterative
          TreeNode prev=null;
          TreeNode prevRight=null;

          while(root!=null){
            TreeNode next=root.left;
            TreeNode right=root.right;
            root.right=prevRight;
            root.left=prev;
            prevRight=right;
            prev=root;
            root=next;
          }
          return prev;
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(4);
        root.right=new TreeNode(5);

        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(7);

        Test test=new Test();
        TreeNode node=test.reverse(root);

        System.out.println("===");
    }
}
