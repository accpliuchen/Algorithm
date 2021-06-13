package com.test.interview.binarysearch;

public class Test {

    public static void main(String args[]){
        int arr[] = { 2, 3, 4, 10, 40 };
        System.out.println(binarySearch(arr,3));
    }


    private static int binarySearch(int[] arr,int num){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=end+(start-end)/2;

            if(num==arr[mid]){
                return mid;
            }else if(num>arr[mid]){
                start+=1;
            }else{
                end-=1;
            }

        }

        return -1;
    }
}
