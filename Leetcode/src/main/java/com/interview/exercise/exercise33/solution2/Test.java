package com.interview.exercise.exercise33.solution2;

public class Test {

 	public int search(int[] nums, int target) {
 	    int left=0;
 	    int right=nums.length-1;

        while(left<=right){
        	int mid=left+(right-left)/2;

        	if(nums[mid]==target){
        		return mid;
        	}else if(nums[left]<nums[mid]){
        		if(target>nums[mid] || target<nums[left]){
        			left=mid+1;
        		}else{
        			right=mid-1;
        		}
        	}else{
        		if(target<nums[mid] || target>nums[right]){
        			right=mid-1;
        		}else{
        			left=mid+1;
        		}
        	}

        }


 	    return -1;
    }

	public static void main(String[] args) {
       Test test=new Test();
       int[] nums = {4,5,6,7,0,1,2};
       int target = 0;

       int result=test.search(nums,target);

       System.out.println("result value is "+ result);
    }
}
