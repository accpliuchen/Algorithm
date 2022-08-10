package com.interview.exercise.exercise349;

//https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Test {

    public int[] intersection(int[] nums1,int[] nums2){
        Arrays.sort(nums1);

        Set<Integer> intersect=new HashSet();

        for(int num:nums2){
        	if(find(num,nums1)){
        		intersect.add(num);
        	}
        }

        int[] result=new int[intersect.size()];
        int i=0;

        for(int num:intersect){
        	result[i++]=num;
        }

        return result;

    }

    private boolean find(int target,int[] nums){
    	int left=0;
    	int right=nums.length-1;

    	while(left<=right){
           int mid=left+(right-left)/2;

           if(nums[mid]==target){
           	return true;
           }else if(nums[mid]>target){
           	 right=mid-1;
           }else{
             left=mid+1;
           }
    	}

    	return false;
    }

	public static void main(String args[]){
		int[] nums1=new int[]{4,9,5};
		int[] nums2=new int[]{9,4,9,8,4};

		Test test=new Test();
		int[] result=test.intersection(nums1,nums2);

		for(int num:result){
			System.out.println(num);
		}
	}
}
