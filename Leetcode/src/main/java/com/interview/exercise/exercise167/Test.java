package com.interview.exercise.exercise167;

public class Test {

	public int[] twoSum(int[] nums,int target){
       int left=0;
       int right=nums.length-1;

       while(left < right){
           int sum=nums[left]+nums[right];

           if(sum==target){
           	  return new int[]{left+1,right+1};
           }else if(sum>target){
           	  right--;
           }else{
           	  left++;
           }
       }

       return new int[2];
	}

	public static void main(String args[]){
		int[] nums=new int[]{2,7,11,15};
		int target=9;

        Test test=new Test();
		int[] array=test.twoSum(nums,target);

		for(int num:array){
			System.out.println(num);
		}
	}
}
