package com.interview.exercise.exercise189.exercise1;

public class Test {

 public void rotate(int[] nums, int k) {

        int p = nums.length - (k%nums.length);
        reverse(nums,p,nums.length-1);
        reverse(nums,0,p-1);
        reverse(nums,0,nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

 private void reverse(int[] nums,int l,int h){
        while(l<h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;h--;
        }
 }

 public static void main(String args[]){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;

        Test test=new Test();

        test.rotate(nums,k);

//       int[] array=test.rotate(nums,k);
//
//       for(int i=0;i<array.length;i++){
//           System.out.println(array[i]);
//       }

    }
}
