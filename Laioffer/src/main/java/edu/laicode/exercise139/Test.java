package edu.laicode.exercise139;

class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key){
        this.key=key;
    }

}
public class Test {

    public static void main(String args[]){
        TreeNode root=new TreeNode(-1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(11);

        root.right.right=new TreeNode(-14);
        root.right.left=new TreeNode(6);

        Test test=new Test();

        int result=test.maxPathSum(root);

        System.out.println("========"+result);
    }

    public int maxPathSum(TreeNode root) {
        // Write your solution here
        int[] result=new int[]{Integer.MIN_VALUE};
        helper(root,result);
        return result[0];
    }

    private int helper(TreeNode root,int[] max){
        if(root==null){
            return 0;
        }

        int left=helper(root.left,max);
        int right=helper(root.right,max);

        left=left<0?0:left;
        right=right<0?0:right;

        max[0]=Math.max(root.key+left+right,max[0]);
        return root.key+Math.max(left,right);
    }
}
