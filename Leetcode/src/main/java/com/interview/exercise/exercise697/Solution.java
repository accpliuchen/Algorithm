package com.interview.exercise.exercise697;

public class Solution {

    public int firstOccur(int[] array, int target) {
        // Write your solution here
        int left=0;
        int right=array.length-1;
        while(left<right-1) {
            int mid = left + (right - left) / 2;

            if (array[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if(array[left]==target){
            return left;
        }

        if(array[right]==target){
            return right;
        }


        return -1;
    }
    public static void main(String args[]){

        int[] array=new int[]{1, 2, 2, 2, 3};

        Solution solution=new Solution();
        int result=solution.firstOccur(array,2);

        System.out.println(result);
    }
}
