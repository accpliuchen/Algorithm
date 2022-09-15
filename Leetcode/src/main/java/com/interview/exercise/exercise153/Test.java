package com.interview.exercise.exercise153;

public class Test {

    public int findMin(int[] nums) {
        int n=nums.length;
        
        if(nums[0]<nums[n-1]) return nums[0];
        
        int low=0,hi=n-1;
        while(low<hi){
            int mid=low+(hi-low)/2;
            
            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            
            if(nums[low]<nums[mid]){
                low=mid+1;
            }else{
                hi=mid-1;
            }
        }
        
        return nums[low];
        
    }

	public static void main(String args[]){
//		int[] array=new int[]{3,4,5,1,2};
//      int[] array=new int[]{4,5,6,7,0,1,2};
//        int[] array=new int[]{11,13,15,17};
        int[] array=new int[]{2,3,4,5,1};

		Test test=new Test();
		int result=test.findMin(array);

		System.out.println("result value is "+ result);
	}
}
