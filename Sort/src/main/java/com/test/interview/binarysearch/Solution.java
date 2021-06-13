package com.test.interview.binarysearch;

//https://iq.opengenus.org/binary-search-iterative-recursive/
public class Solution {


    public static void main(String args[]){
        int arr[] = { 2, 3, 4, 10, 40 };

        int n=arr.length;

        System.out.println(binarySearchByRecursion(arr,0,n-1,10));
    }

    private static int binarySearchByRecursion(int[] arr,int start,int end, int num){

        if(end>=start){
            int mid=start+(end-start)/2;

            if(arr[mid]==num)
                return mid;

            if (arr[mid] > num)
                return binarySearchByRecursion(arr, start, mid - 1, num);

            return binarySearchByRecursion(arr,mid+1, end, num);
        }

       return -1;
    }

    private static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
