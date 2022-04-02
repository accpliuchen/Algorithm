package com.interview.exercise.exercise55;

public class Test {

    public boolean canJump(int[] nums){
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(i>max) return false;
            max=Math.max(i+nums[i],max);
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2,3,1,1,4};
        int[] nums = new int[]{3,2,1,0,4};
        Test test=new Test();

        System.out.println(test.canJump(nums));
    }
}
