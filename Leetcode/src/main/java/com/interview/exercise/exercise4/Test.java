package com.interview.exercise.exercise4;

import java.util.Arrays;

public class Test {

    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int len1=nums1.length;
        int len2= nums2.length;

        int[] nums=new int[len1+len2];

        for(int i=0;i< nums1.length;i++){
            nums[i]=nums1[i];
        }

        for(int i=0;i< nums2.length;i++){
            nums[i]=nums2[i];
        }

        Arrays.sort(nums);

        int len=nums.length;

        if(len%2==0){
            return (nums[len/2-1]+nums[len/2])/2.0;
        }else{
            return nums[len/2];
        }
    }


    public static void main(String args[]){
        int[] nums1={1,3};
        int[] nums2={2};
    }
}
