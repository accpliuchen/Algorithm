package com.interview.exercise.test;

import java.util.Arrays;

public class Solution {

    public static void main(String args[]){
//        Integer[] nums=new Integer[]{1,2,3,4,5,6,7,8,9};

        Integer[] nums=new Integer[]{27, 11, 5, 44};

        Arrays.sort(nums,(x,y)->{
            int sx=10,sy=10;

           System.out.println("x value is "+ x +"y value is "+y);
           return 1;
        });


        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
