package com.interview.exercise.exercise27;

public class Test {

    public int removeElement(int[] nums, int val) {

        if(nums==null || nums.length==0)
            return 0;

        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[res++]=nums[i];
            }
        }

        return res;

    }

    public static void main(String args[]){
        int[] nums = {2,2,2,3};
        int val=3;

        Test test=new Test();
        int result=test.removeElement(nums,val);

        System.out.println("result value is "+result);
    }
}
