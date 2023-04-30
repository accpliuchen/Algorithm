package com.interview.exercise.exercise162;

public class Test {

	public int findPeakElement(int[] nums) {
		int left = 0, right = nums.length - 1; 
        while (left < right) { 
            int mid = left+ (right-left) / 2; 
            if(nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid;
        } 
        return left; 
	}

	public static void main(String args[]){
		int[] array=new int[]{1,2,1,3,5,6,4};

		Test test=new Test();

		int result=test.findPeakElement(array);

		System.out.println("result value is "+ result);
	}
}
