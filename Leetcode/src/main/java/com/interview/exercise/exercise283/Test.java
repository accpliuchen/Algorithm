package com.interview.exercise.exercise283;

public class Test {

    public void moveZeroes(int[] nums) {
      if(nums==null || nums.length<=1){
      	return;
      }

      int slow=0;
      int fast=0;

      while(fast<nums.length){
         if(nums[fast]!=0){
             swap(nums,slow++,fast);
         }

         fast++;
      }

      for(int i=slow;i<nums.length;i++){
      	nums[i]=0;
      }


      for(int num:nums){
      	System.out.println(num);
      }

    }

    private void swap(int[] nums,int i,int j){
       int temp=nums[i];
       nums[i]=nums[j];
       nums[j]=temp;
    }

	public static void main(String args[]){
		int[] array=new int[]{0,1,0,3,12};
	
        Test test=new Test();
        test.moveZeroes(array);
	}
}
