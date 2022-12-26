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

    public int maxPathSum(TreeNode root) {
        // Write your solution here
        int[] result=new int[]{Integer.MIN_VALUE};
        helper(root,result);
        return result[0];
    }

    private int helper(TreeNode root,int[] result){
        if (root == null) {
            return 0;
        }

        int left = helper(root.left, result);
        int right = helper(root.right, result);
        int sum = left + right + root.key;
        int leftSum = left + root.key;
        int rightSum = right + root.key;
        int partialMax = Math.max(root.key, Math.max(leftSum, rightSum));

        result[0] = Math.max(result[0], Math.max(partialMax, sum));

        return partialMax;
    }
}
