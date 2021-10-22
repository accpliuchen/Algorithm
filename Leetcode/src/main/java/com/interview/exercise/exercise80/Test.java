package com.interview.exercise.exercise80;

public class Test {

    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int next=0;

        for(int i=0;i<nums.length;i++){
            if(i==0 || i==1) nums[next++]=nums[i];
            else{
                if(nums[i]!=nums[next-1] || nums[i]!=nums[next-2])
                    nums[next++]=nums[i];
            }
        }

        return next;
    }

    public static void main(String args[]){
        int[] nums = {1,1,1,2,2,3};

        Test test=new Test();
        int result=test.removeDuplicates(nums);

        System.out.println("result value is "+result);
    }
}
