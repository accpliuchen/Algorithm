package com.interview.exercise.exercise540;

public class Test {


	public int getSingleElement(int[] nums) {
	  // Write your solution here

	  int left = 0, right = nums.length-1;
	       while(left < right){
	          int mid = (left + right)/2;
	          System.out.println(mid % 2);

	          if((mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
	                left = mid + 1;
	            else
	                right = mid;
	        }
	        return nums[left];
	        
	 }
    
	public static void main(String args[]){
        // int[] nums=new int[]{1,1,2,3,3,4,4,8,8};

		int[] nums=new int[]{1,1,2};


        Test test=new Test();
        int result=test.getSingleElement(nums);

        System.out.println("result value is "+ result);
	}
}
