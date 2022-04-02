package com.interview.exercise.exercise41;

public class Test {

    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean[] temp=new boolean[n];

        for(int num:nums){
            if(num>0 && num<=n) {
                temp[num-1]=true;
            }
        }

        int i=0;

        for(i=0;i<n;i++){
            if(!temp[i]) return i+1;
        }

        return i+1;
    }

    public static void main(String args[]){
        int[] nums=new int[]{1,2,0};

        //int[] nums=new int[]{3,4,-1,1};

        Test test=new Test();

        System.out.println(test.firstMissingPositive(nums));

    }

}
