package com.interview.exercise.exercise108;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
     }
}

public class Test {

    public TreeNode sortedArrayToBST(int[] nums){
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] nums,int left,int right){
        if(left>right) return null;

        int mid=left+(right-left)/2;

        System.out.println("nums[mid] value is "+nums[mid]);

        System.out.println("left value is "+left);
        System.out.println("mid-1 value is "+ (mid-1));

        TreeNode root=new TreeNode(nums[mid]);

        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);

        return root;
    }

    public static  void main(String args[]){
        int[] nums = new int[]{-10,-3,0,5,9};

        Test test=new Test();

        System.out.println(test.sortedArrayToBST(nums));

        System.out.println("");
    }
}
