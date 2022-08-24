package com.interview.exercise.exercise561;

import java.util.Arrays;

public class Test {

	 public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int maxSum=0;
        
        for(int i=0;i<nums.length;i+=2){
            maxSum+=nums[i];
        }
        return maxSum;
     }

     public static void main(String args[]){
     	// int[] nums=new int[]{1,4,3,2};

        int[] nums=new int[]{6,2,6,5,1,2};

     	Test test=new Test();
     	int result=test.arrayPairSum(nums);

     	System.out.println("result value is "+ result);
     }
}
