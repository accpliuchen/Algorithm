package com.interview.exercise.exercise26;

public class Test {

    public int removeDuplicates(int[] nums){
        if(nums.length<2) return nums.length;

        int j=0;
        int i=1;

        while(i<nums.length){
           if(nums[i]!=nums[j]) {
               j++;
               nums[j]=nums[i];
           }
           i++;
        }

        return j+1;
    }

    public static void main(String args[]){
        Test test=new Test();

    }
}
