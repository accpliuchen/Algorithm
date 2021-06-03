package com.test.interview.marginsort;

import com.test.interview.selectionsort.SelectionSort;

public class Test {


    public void marginSort(int[] arr){
        int low=1;
        int high=arr.length-1;

        while(low<high) {
            int min = low;
            int max = low;

            for (int i = low; i <= high; i++) {
                if (arr[i] < arr[min])
                    min = i;

                if (arr[i] > arr[max])
                    max = i;


                if (max == low) {
                    max = min;
                }


                System.out.println("========min=====" + arr[min]);
                System.out.println("========low=====" + arr[low]);


                System.out.println("========max=====" + arr[max]);
                System.out.println("========high=====" + arr[high]);

                swap(arr[min], arr[low]);
                swap(arr[max], arr[high]);

                low = low + 1;
                high = high - 1;
              }
            }
    }

    public void swap(int i,int j){
          int temp=i;
          i=j;
          j=temp;
    }

    public void printArray(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        Test ob = new Test();

        int[] arr= {64,25,12,22,11};
        ob.marginSort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }
}
