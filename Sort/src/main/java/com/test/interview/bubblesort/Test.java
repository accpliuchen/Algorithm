package com.test.interview.bubblesort;

public class Test {

    public static void main(String args[]){
        int[] arr= { 22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70 };

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                System.out.println(j+" arr[j] is "+ arr[j]);
                System.out.println((j+1)+" arr[j-1] is "+ arr[arr.length-i-1]);
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];

                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);

    }


    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
