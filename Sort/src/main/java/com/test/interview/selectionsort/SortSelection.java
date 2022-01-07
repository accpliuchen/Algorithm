package com.test.interview.selectionsort;

public class SortSelection {

    public void selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
           int minPos=i;
           for(int j=i+1;j<array.length;j++){
               if(array[j]<array[minPos]){
                   minPos=j;
               }
           }
            swap(array,i,minPos);
        }

    }

    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={64,25,12,22,11};

        SortSelection test=new SortSelection();

        System.out.println("before sort:");

        for(int i=0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
        System.out.println("\n");

        test.selectionSort(arr);

        System.out.println("after sort:");
        for(int i=0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
        System.out.println("\n");
    }
}
