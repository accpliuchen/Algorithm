package com.test.interview.quicksort.exercise;

import  java.util.Random;

public class Solution {

    public int[] quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        helper(array, 0, array.length - 1);

        return array;
    }

    private Random rand = new Random();

    private void helper(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = left + rand.nextInt(right - left + 1);

        swap(array, pivot, right);

        int i = left;
        int j = right - 1;

        while (i <= j) {
            if (array[i] > array[right]) {
                swap(array, i, j);
                --j;
            }
            else {
                ++i;
            }
        }

        swap(array, i, right);

        helper(array, left, i - 1);
        helper(array, i + 1, right);
    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String args[]){
        int[] arr = { 3,2,1};

        Solution test=new Solution();
        int[] array=test.quickSort(arr);
        for(int element : array){
            System.out.print(element+" ");
        }
    }
}
