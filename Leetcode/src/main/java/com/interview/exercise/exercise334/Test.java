package com.interview.exercise.exercise334;

public class Test {

    public boolean increasingTriplet(int[] nums){
        if(nums.length<3) return false;

        int num1=nums[0];
        int num2=Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<num1){
                num1=nums[i];
            }else if(nums[i]<=num2){
                num2=nums[i];
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] arr=new int[]{1,2,3,4,5};


        Test test=new Test();
        boolean result=test.increasingTriplet(arr);

        System.out.println(result);
    }
}
