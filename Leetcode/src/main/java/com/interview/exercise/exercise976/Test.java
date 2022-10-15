package com.interview.exercise.exercise976;

import java.util.Arrays;

public class Test {

    public int largestPerimeter(int[] nums){
    	Arrays.sort(nums);

    	for(int i=nums.length-3;i>=0;--i){
   			if(nums[i]+nums[i+1]>nums[i+2])
   				return nums[i]+nums[i+1]+nums[i+2];
    	}

    	return 0;
    }

	public static void main(String args[]){
		int[] nums=new int[]{2,1,2};

		Test test=new Test();
		int result=test.largestPerimeter(nums);

		System.out.println("result value is "+ result);
	}
}
