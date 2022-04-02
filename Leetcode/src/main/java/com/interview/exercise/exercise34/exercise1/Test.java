package com.interview.exercise.exercise34.exercise1;

public class Test {

    public int[] searchRange(int[] nums,int target){
        if(nums==null || nums.length==0) return new int[]{-1,-1};

        int[] res=new int[]{-1,-1};

        int left=binarySearch(nums,target-0.5);
        int right=binarySearch(nums,target+0.5);

        if(right-left==0) return res;

        res[0]=left;
        res[1]=right-1;

        return res;
    }

    private int binarySearch(int[] nums,double target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(end-start)/2+start;
            if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }



    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};

        //Input: nums = [5,7,7,8,8,10], target = 6
        int target=8;

        Test test=new Test();
        int[] result=test.searchRange(nums,target);

        System.out.println("result value is "+ result[0]+"  "+result[1]);
    }
}
