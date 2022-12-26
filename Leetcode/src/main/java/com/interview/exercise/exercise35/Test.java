package com.interview.exercise.exercise35;

public class Test {

	  public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }

        return right;
     }

     public static void main(String args[]){
     	int[] array=new int[]{1,3,5,6};
     	int target=2;

     	Test test=new Test();
     	int result=test.searchInsert(array,target);

     	System.out.println("result value is "+ result);
     }
}
