package com.interview.exercise.exercise1313;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Test {

    public int[] decompressRLElist(int[] nums) {
        int sizeOfResult=0;
        for(int i=0; i<nums.length/2; i++)
            sizeOfResult+=nums[i*2];
        int[] result=new int[sizeOfResult];
        int indexOfResult=0;
        for(int i=0; i<nums.length/2; i++){
            for(int j=0; j<nums[i*2];j++){
                result[indexOfResult++]=nums[i*2+1];
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] nums={1,2,3,4};

        Test test=new Test();

        System.out.println(Arrays.toString(test.decompressRLElist(nums)));
    }
}
