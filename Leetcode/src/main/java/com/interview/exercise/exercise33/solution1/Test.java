package com.interview.exercise.exercise33.solution1;

public class Test {

    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0) return -1;

        int start=0;
        int end=nums.length-1;

        while(start+1<end){
            int mid=(end-start)/2+start;

            if(nums[mid]==target) return mid;

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end=mid;
                }else start=mid;
            }else{
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid;
                }else end=mid;
            }
        }

        if(nums[start]==target) return start;
        if(nums[end]==target) return end;
        return -1;
    }

    public static void main(String[] args) {
       Test test=new Test();
       int[] nums = {4,5,6,7,0,1,2};
       int target = 0;

       int result=test.search(nums,target);

       System.out.println("result value is "+ result);
    }
}
