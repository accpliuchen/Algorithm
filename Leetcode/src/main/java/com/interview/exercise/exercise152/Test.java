package com.interview.exercise.exercise152;

public class Test {


    public int maxProduct(int[] nums) {
       
       if(nums.length==0){
       	return 0;
       }
       
       int[] array=new int[nums.length+1];
        
        array[0]=0;
        
        for(int i=1;i<nums.length;i++){
            int temp=nums[i-1]*nums[i];
            array[i]=Math.max(temp,array[i]);
            
        }
        
        return array[nums.length];
    }

	public static void main(String args[]){
		int[] nums=new int[]{2,3,-2,4};

		Test test=new Test();
		int result=test.maxProduct(nums);

		System.out.println("maxProduct value is "+ result);

	}
}
