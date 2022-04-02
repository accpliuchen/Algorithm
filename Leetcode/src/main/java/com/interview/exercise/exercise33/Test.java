package com.interview.exercise.exercise33;

public class Test {

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0 , nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public int findPivot(int[] array){
        int start=0;
        int end=array.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && array[mid]>array[mid+1]){
                return mid;
            }

            if(mid>start && array[mid]<array[mid-1]){
                return mid-1;
            }

            if(array[mid]<array[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        Test test=new Test();
        int result=test.search(nums,target);

        System.out.println(result);

    }
}
