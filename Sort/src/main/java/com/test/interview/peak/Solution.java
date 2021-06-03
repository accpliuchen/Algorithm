package com.test.interview.peak;

//162. Find Peak Element
public class Solution {

    public int findPeakElement(int[] nums){
        int left=0,right=nums.length-1;

        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[mid+1])
                left=mid+1;
            else
                right=mid;
        }

        return left;
    }

    public static void main(String args[]){
       int[] arr=new int[]{1, 3, 4, 2, 4, 3, 1};

       Solution solution=new Solution();

       System.out.println(solution.findPeakElement(arr));

    }
}
