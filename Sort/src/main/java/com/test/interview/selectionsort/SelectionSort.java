package com.test.interview.selectionsort;

public class SelectionSort {


    public void sort(int arr[]){

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min_index=i;

            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[min_index])
                    min_index=j;

                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;

        }

    }

//    void sort(int arr[])
//    {
//        int n = arr.length;
//
//        // One by one move boundary of unsorted subarray
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//
//            // Swap the found minimum element with the first
//            // element
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
//    }


    public void printArray(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

    public static void main(String args[]){
        SelectionSort ob = new SelectionSort();

        int[] arr= {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }

}
