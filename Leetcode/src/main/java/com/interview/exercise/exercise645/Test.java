package com.interview.exercise.exercise645;

import java.util.Arrays;

public class Test {

    public int[] findErrorNums(int[] nums){
        int[] counter=new int[nums.length+1];

        for(int i:nums){
            counter[i]++;
        }

        int[] result=new int[2];

        for(int i=1;i<counter.length;i++){
            if(counter[i]==0){
                result[1]=i;
            }else if(counter[i]==2){
                result[0]=i;
            }
        }

        return result;
    }

    public static void main(String args[]){
        int[] nums={1,2,2,4};

        Test test=new Test();

        int[] result=test.findErrorNums(nums);

        System.out.println("result value is "+ Arrays.toString(result));
    }
}
