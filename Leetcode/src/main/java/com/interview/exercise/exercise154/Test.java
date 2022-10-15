package com.interview.exercise.exercise154;

public class Test {

	public int findMin(int[] nums){

		int right=nums.length-1;

		if(nums[0]<nums[right]) return nums[0];

		int left=0;

		while(left<right){
			int mid=left+(right-left)/2;

			if(nums[right]<nums[mid]){
				left=mid+1;
			}else if(nums[mid]<nums[right]){
 				right=mid;
			}else{
				right--;
			}
		}

		return nums[left];
		
	}

	public static void main(String[] args[]){
		int[] array=new int[]{1,3,5};

		Test test=new Test();
	}
}
