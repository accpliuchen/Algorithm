package com.interview.exercise.exercise852;

public class Test {

	public int peakIndexInMountainArray(int[] arr) {
        // int low = 1;
        // int high = arr.length-2;
        
        // while(low <= high){
        //     int mid = (low + high)/2;
            
        //     if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
        //         return mid;
        //     } else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
        //         low = mid+1;
        //     } else {
        //         high = mid-1;
        //     }
        // }
        // return 0;

        int low=1;
        int high=arr.length-2;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return 0;
    }

	public static void main(String args[]){
		// int[] arr = new int[]{0,2,1,0};

		int[] arr = new int[]{0,1,0};

		Test test=new Test();

		int result=test.peakIndexInMountainArray(arr);

		System.out.println("result value is "+ result);

	}
}
