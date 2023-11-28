package com.interview.exercise.exercise1838;

import java.util.Arrays;

public class Test {

    public int maxFrequency(int[] nums,int k){
        Arrays.sort(nums);
        int left=0;
        int curr=0;

        for(int right=0;right<nums.length;right++){
            int target=nums[right];
            curr+=target;

            if((right-left+1)*target-curr>k){
                curr-=nums[left];
                left++;
            }
        }
        return nums.length-left;
    }

    public static void main(String args[]){
//        int[] nums=new int[]{1,2,4};
//        int k=5;

        int[] nums=new int[]{1,4,8,13};
        int k=5;

        Test test=new Test();
        System.out.println(test.maxFrequency(nums,k));
    }
}
