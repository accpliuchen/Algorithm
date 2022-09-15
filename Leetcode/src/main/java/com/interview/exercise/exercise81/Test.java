package com.interview.exercise.exercise81;

public class Test {

    public boolean search(int[] nums,int target){
        int n=nums.length;
        int left=0,right=n-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(target==nums[mid]) {
                return true;
            }else if(nums[left]<nums[mid] || nums[mid]>nums[right]){
                if(target>nums[mid] || target<nums[left]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }else if(nums[mid]<nums[right] || nums[left]>nums[mid]){
                if(target<nums[mid] || target>nums[right]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                right--;
            }

        }
        return false;
    }

    public static void main(String args[]){
//        int[] nums={2,5,6,7,0,1,1};
//        int[] nums={2,5,6,7,0,3,3,3};
//        int target =3;

        int[] nums={2,5,6,0,0,1,2};
        int target =3;

        Test test=new Test();
        boolean result=test.search(nums,target);

        System.out.println("============="+result);
    }
}
