package com.interview.exercise.exercise734;

public class Test {

 	public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
    
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
            	return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

	public static void main(String args[]){
		int[] nums=new int[]{1,7,3,6,5,6};

		Test test=new Test();
		int result=test.pivotIndex(nums);

		System.out.println("result value is "+ result);
	}
}
