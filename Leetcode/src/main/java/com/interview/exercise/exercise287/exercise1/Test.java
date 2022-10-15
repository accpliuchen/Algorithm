package com.interview.exercise.exercise287.exercise1;

public class Test {

	public int findDuplicate(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0]; 
    }

	public static void main(String args[]){
		int[] nums = new int[]{1,3,4,2,2};
   
   		Test test=new Test();

        int result=test.findDuplicate(nums);

        System.out.println("result value is "+ result);
	}
}
