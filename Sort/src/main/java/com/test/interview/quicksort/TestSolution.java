package com.test.interview.quicksort;

public class TestSolution {

    public int[] quickSort(int[] array){

        if(array==null || array.length<=1){
            return array;
        }

        return quickSort(array,0,array.length-1);
    }

    private int[] quickSort(int[] array, int left,int right){
       if(left<right){
          int index=partition(array,left,right);

          quickSort(array,left,index-1);
          quickSort(array,index-1,right);
       }
       return array;
    }

    private int partition(int[] arr,int left,int right){
        int pivot=left;
        int index=pivot+1;
        for(int i=index;i<=right;i++){
            if(arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }

    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String args[]){
        int[] arr = { 3,2,1};

        TestSolution test=new TestSolution();
        int[] array=test.quickSort(arr);
        for(int element : array){
            System.out.print(element+" ");
        }
    }
}
