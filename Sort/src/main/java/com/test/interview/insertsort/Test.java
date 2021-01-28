package com.test.interview.insertsort;

//reference link https://www.geeksforgeeks.org/insertion-sort/
public class Test {

    public static void main(String args[]){
        int[] arr={12,11,13,5,6};

        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int index=i-1;

            while(index>=0 && arr[index]>temp){
                arr[index+1]=arr[index];
                index=index-1;

            }

            arr[index+1]=temp;
        }

        printArray(arr);

    }


    public static void printArray(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
    }
}
