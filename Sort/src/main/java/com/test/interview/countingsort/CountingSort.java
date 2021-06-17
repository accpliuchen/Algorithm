package com.test.interview.countingsort;

import javax.sound.midi.SysexMessage;

public class CountingSort {


    public static void main(String args[]) throws Exception {
        int[] array = { 4,6,3,5,0,5,1,3,5,5 };

        CountingSort sort=new CountingSort();
        int max= sort.getMaxValue(array);
        sort.countingSort(array,max);

    }

    private int getMaxValue(int[] arr){
        int maxValue=arr[0];
        for(int value:arr){
            if(maxValue<value){
                maxValue=value;
            }
        }
        return  maxValue;
    }

    private static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private int[] countingSort(int[] arr,int maxValue)throws Exception{
        int bucketLen=maxValue+1;
        int[] bucket=new int[bucketLen];

        printArray(bucket);

        for(int value:arr){
            bucket[value]++;
        }

        printArray(bucket);

        System.out.println("bucketLen is "+ bucketLen);

        int sortedIndex=0;
        for(int j=0;j<bucketLen;j++){
            while(bucket[j]>0){
                System.out.println("sortedIndex++ is "+ j);
                arr[sortedIndex++]=j;
                bucket[j]--;
            }
        }

        printArray(arr);

        printArray(bucket);

        return arr;
    }
}
