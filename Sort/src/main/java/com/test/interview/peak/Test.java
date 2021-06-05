package com.test.interview.peak;

public class Test {


//    public int findPeakElement(int[] nums){
//
//        int left=0,right=nums.length-1;
//
//        while(left<right){
//            int mid=(left+right)/2;
//
//            if(nums[mid]<nums[mid+1])
//                left=mid+1;
//            else
//                right=mid;
//        }
//        return left;
//    }

    public int findPeakElement(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int middle=start+(end-start)/2;

            if(nums[middle]>nums[middle+1])
                end=middle;
            else
                start=middle+1;
        }
        return start;
    }

    public static void main(String args[]){
        int[] arr={10, 20, 15, 2, 23, 90, 67};

        Test solution=new Test();

        System.out.println(solution.findPeakElement(arr));

    }
}
