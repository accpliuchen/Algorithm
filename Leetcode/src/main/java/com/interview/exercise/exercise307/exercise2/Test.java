package com.interview.exercise.exercise307.exercise2;

class NumArray{
    private SegmentTreeNode root;

    public NumArray(int[] nums){
        this.root=buildTree(nums,0,nums.length-1);

        System.out.println("================");
    }

    private SegmentTreeNode buildTree(int[] nums,int start,int end){
        if(start>end) return null;

        SegmentTreeNode node=new SegmentTreeNode(start,end);

        if(start==end){
            node.value=nums[start];
        }else{
            int mid=start+(end-start)/2;
            node.left=buildTree(nums,start,mid);
            node.right=buildTree(nums,mid+1,end);
            node.value=node.left.value+node.right.value;
        }
        return node;
    }
}

class SegmentTreeNode{
    int start;
    int end;
    int value;

    SegmentTreeNode left,right;

    public  SegmentTreeNode(int start,int end){
        this.start=start;
        this.end=end;
        this.value=0;
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array=new int[]{1, 3, 5};
        NumArray numArray = new NumArray(array);

        System.out.println("===");
    }
}
