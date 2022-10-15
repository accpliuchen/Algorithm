package com.interview.exercise.exercise977;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class Test {

    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];

        int i=0;
        int j= nums.length-1;
        int k= nums.length-1;

        while(i<=j){
            if(nums[i]*nums[i]<=nums[j]*nums[j]){
                ans[k]=nums[j]*nums[j];
                j--;
            }else{
                ans[k]=nums[i]*nums[i];
                i++;
            }
            k--;
        }


        return ans;
    }

    public static void main(String args[]){
        int[] nums = new int[]{-4,-1,0,3,10};

        Test test=new Test();

        int[] array=test.sortedSquares(nums);

        for(int num:array){
            System.out.println(num);
        }
    }
}
