package com.test.interview.insertionsort;

//reference link https://www.geeksforgeeks.org/insertion-sort/
//https://www.geeksforgeeks.org/insertion-sort/
public class Test {


    public void insertionSort(int[] array){

        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
              if(array[j]<=array[j-1]){
                  swap(array,j,j-1);
                  printArray(array);
              }
            }
        }

    }

    private void swap(int[] a, int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String args[]){
        int[] arr={12,11,13,5,6};

//        for(int i=1;i<arr.length;i++){
//            int temp=arr[i];
//            int index=i-1;
//
//            while(index>=0 && arr[index]>temp){
//                arr[index+1]=arr[index];
//                index=index-1;
//
//            }
//
//            arr[index+1]=temp;
//        }

        System.out.println("before");
        printArray(arr);

        Test test=new Test();
        test.insertionSort(arr);

        System.out.println("after");
        printArray(arr);

    }


    public static void printArray(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }

        System.out.println();
    }
}
