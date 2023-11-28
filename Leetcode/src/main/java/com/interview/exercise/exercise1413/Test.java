package com.interview.exercise.exercise1413;

public class Test {

    public int minStartValue(int[] nums){

        int minVal=0;
        int total=0;

        for(int num:nums){
            total+=num;
            minVal=Math.min(minVal,total);
        }

        return -minVal+1;
    }
    public static void main(String args[]){
        int[] nums=new int[]{-3,2,-3,4,2};

        Test test=new Test();

        System.out.println(test.minStartValue(nums));

    }
}
