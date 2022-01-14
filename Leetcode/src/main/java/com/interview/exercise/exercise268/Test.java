package com.interview.exercise.exercise268;

public class Test {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = (1 +n)*n/2;

        System.out.println("sum value "+ sum);

        for(int i=0;i<n;i++){
           sum-=nums[i];
        }

        return sum;
    }

    public static void main(String args[]){
//        int[] nums = {9,6,4,2,3,5,7,0,1};

        int[] nums = {3,0,1};

        Test test=new Test();
        int result=test.missingNumber(nums);

        System.out.println("result value is "+result);
    }
}
