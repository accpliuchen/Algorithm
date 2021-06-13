package com.test.interview.countingsort;

public class Solution {

    public static void main(String args[]){
        int[] array = { 2, 5, 3, 0, 2, 3, 0, 3 };
        printArray(countingSort(array, 5));
    }


    public static int[] countingSort(int[] array,int max){
        int[] result=new int[array.length];
        int[] temp=new int[max+1];

        for(int i:array){
            temp[i]++;
        }

        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }

        for(int i=array.length-1;i>-1;i--){
            result[temp[array[i]]-1]=array[i];
            temp[array[i]]--;
        }

        return result;

    }

    public static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private int getMaxValue(int[] arr){
        int maxValue=arr[0];
        for(int value: arr){
            if(maxValue<value){
                maxValue=value;
            }
        }
        return maxValue;
    }
}
