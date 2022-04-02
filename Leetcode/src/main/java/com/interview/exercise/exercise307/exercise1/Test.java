package com.interview.exercise.exercise307.exercise1;

//https://www.youtube.com/watch?v=XDh5Lm4zYa8
//https://www.youtube.com/watch?v=S0Bf9jpgHmQ
class NumArray{

    class TreeNode{
        int sum;
        int start,end;
        TreeNode left,right;

        public TreeNode(int s,int e){
            left=null;
            right=null;
            start=s;
            end=e;
        }
    }

    TreeNode root=null;

    public NumArray(int[] nums){
        root=buildTree(nums,0,nums.length-1);
    }

    private TreeNode buildTree(int[] nums,int start,int end){
        if(start>end) return null;

        TreeNode res=new TreeNode(start,end);

        if(start==end){
            res.sum=nums[start];
        }else{
            int mid=start+(end-start)/2;
            res.left=buildTree(nums,start,mid);
            res.right=buildTree(nums,mid+1,end);
            res.sum=res.left.sum+res.right.sum;
        }

        return res;
    }
    public void update(int i, int val) {
        update(root, i, val);
    }

    private void update(TreeNode root,int i,int val){
        if(root.start==root.end){
            root.sum=val;
        }else{
            update(root.left,i,val);
            update(root.right,i,val);
            int sum=0;
            if(root.left!=null) sum+=root.left.sum;
            if(root.right!=null) sum+=root.right.sum;
            root.sum=sum;
        }
    }

    public int sumRange(int i, int j) {
        return sumRange(root, i, j);
    }
    private int sumRange(TreeNode node, int i, int j) {
        if(node == null || i > j || i > node.end || j < node.start) return 0;
        else if(i <= node.start && node.end <= j) return node.sum;
        else {
            return sumRange(node.left, i, j) + sumRange(node.right, i, j);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array=new int[]{1, 3, 5};
        NumArray numArray = new NumArray(array);
        int result=numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9

        System.out.println("result value is "+ result);

        numArray.update(1, 2);   // nums = [1, 2, 5]
        result=numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
        System.out.println("result value is "+ result);
    }
}
