package com.interview.exercise.exercise215;

import java.util.Arrays;

public class Test {

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String args[]){
        int[] nums={3,2,1,5,6,4};
        int result=Test.findKthLargest(nums,4);

        System.out.println("result value is "+ result);

    }
}
