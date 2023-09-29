package com.interview.exercise.exercise31;

public class Test {

    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        //find the position where change should happen ( first decreasing sequence)
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }


        if(i>=0){
            int last = nums.length-1;
            //find just greater number than change position, swap them
            while(last>=0 && nums[i] >= nums[last]){
                last--;
            }
            swap(nums,last,i);
        }

        //reverse all numbers after swapping
        reverse(nums,i+1);
    }


    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int[] nums,int start){
        int end=nums.length-1;

        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }


    public static void main(String args[]){
        //int[] nums=new int[]{1,2,3};

        //int[] nums=new int[]{3,2,1};

        int[] nums=new int[]{1,1,5};

        Test test=new Test();
        test.nextPermutation(nums);
    }
}
