package com.interview.exercise.exercise307.exercise3;

class NumArray{
    private SegmentTreeNode root;

    public NumArray(int[] nums){
        this.root=buildTree(nums,0,nums.length-1);

        System.out.println(this.root.toString());
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

    public void update(int index,int value){
        update(this.root,index,value);
    }

    private void update(SegmentTreeNode root,int index,int value){
        if(root.start==root.end){
            root.value=value;
            return;
        }

        int middle=root.start+(root.end-root.start)/2;

        if(index<middle){
            update(root.left,index,value);
        }else{
            update(root.right,index,value);
        }

        root.value=root.left.value+root.right.value;
    }

    public int sumRange(int left, int right) {
        return sumRange(this.root,left,right);
    }

    int sumRange(SegmentTreeNode root,int start,int end){
        if(root.end==end && root.start==start) return root.value;

        int mid=root.start+(root.end-root.start)/2;

        if(end<=mid){
            return sumRange(root.left,start,end);
        }else if(start>=mid+1){
            return sumRange(root.right,start,end);
        }else{
            return sumRange(root.right,mid+1,end)+sumRange(root.left,start,mid);
        }
    }
}

class SegmentTreeNode{
     int start;
     int end;
     int value;
     SegmentTreeNode left,right;

     public SegmentTreeNode(int start,int end){
         this.start=start;
         this.end=end;
         this.value=0;
     }
}

public class Test {
    public static void main(String[] args) {
        int[] array=new int[]{1, 3, 5};
        NumArray obj = new NumArray(array);
        obj.sumRange(0, 2); // return 1 + 3 + 5 = 9
        obj.update(1, 2);   // nums = [1, 2, 5]
        obj.sumRange(0, 2); // return 1 + 2 + 5 = 8

        System.out.println("===");
    }
}
