package com.interview.exercise.exercise300.exercise1;

public class Test {

    public int lengthOfLIS(int[] nums){
        int[] tails=new int[nums.length];
        int result=0;

        for(int num:nums){
            int i=0,j=result;
            while(i!=j){
                int mid=(i+j)/2;
                if(tails[mid]<num){
                    i=mid+1;
                }else{
                    j=mid;
                }
            }
            tails[i]=num;
            if(i==result) ++result;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};

        Test test=new Test();

        int result=test.lengthOfLIS(nums);

        System.out.println("result value is "+ result);
    }
}
