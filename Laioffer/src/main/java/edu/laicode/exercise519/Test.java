package edu.laicode.exercise519;

public class Test {

	public int[] moveZeroes(int[] nums) {
	    // Write your solution here
	    if(nums==null || nums.length<=1){
	            return nums;
	        }
	        
	        int slow=0;
	        int fast=0;
	        
	        while(fast<nums.length){
	            if(nums[fast]!=0){
	                swap(nums,slow++,fast);
	            }
	            fast++;
	        }
	        
	        for (int i = slow; i < nums.length; i++){
	            nums[i] = 0;
	        }
	        return nums;
    }
    
    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

	public static void main(String args[]){
		int[] arrays={0,1,2,0,3};

		Test test=new Test();

		int[] nums=test.moveZeroes(arrays);

		for(int num:nums){
			System.out.println(num);
		}
	}
}
