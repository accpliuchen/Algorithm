package com.interview.exercise.exercise189;

public class Test {

    public int[] rotate(int[] nums,int k){
        int temp;

        for(int i=0;i<k;i++){
            temp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;

        }

        return nums;
    }

    public static void main(String args[]){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;

        Test test=new Test();
        int[] array=test.rotate(nums,k);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
