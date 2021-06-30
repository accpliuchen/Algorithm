package com.test.interview.insertsorted;


//https://www.geeksforgeeks.org/search-insert-and-delete-in-a-sorted-array/
public class Test {

    static int insertSorted(int arr[], int n, int key, int capacity){

        if(n>=capacity)
            return n;

        int i;
        for(i=n-1;(i>=0 && arr[i]>key);i--)
            arr[i+1]=arr[i];

        arr[i+1]=key;

        return (n+1);
    }

    public static void main(String args[]){
        int[] arr=new int[20];

        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;

        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key
        n = insertSorted(arr, n, key, capacity);

        System.out.println("\nn value is "+n);
        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}
