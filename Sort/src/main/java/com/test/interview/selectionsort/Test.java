package com.test.interview.selectionsort;

public class Test {

    public static void main(String args[]){

        int[] arr={64,25,12,22,11};

        System.out.println("before sort:");

        for(int i=0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
        System.out.println("\n");

        sort(arr);

        System.out.println("after sort:");
        for(int i=0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
        System.out.println("\n");
        
    }


    public static void sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
              int minIndex=i;
              for(int j=i+1;j<n;j++){
                  if(arr[minIndex]>arr[j]){
                      minIndex=j;
                      swap(arr,minIndex,i);
                  }
              }
        }
    }

    private static void swap(int[] arr,int minIndex,int i){
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
    }
}
