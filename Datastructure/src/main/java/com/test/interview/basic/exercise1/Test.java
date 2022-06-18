package com.test.interview.basic.exercise1;

public class Test {

    public int minIndex(int[] array, int i) {
        // Write your solution here

        int min=i;
        for(++i;i<array.length;++i){
            if(array[i]<array[min]){
                min=i;
            }
        }

        return min;
    }

    public static void main(String args[]){
       Test test=new Test();
       int[] array=new int[]{0, 3, 9, 8, 5, 4};
       int result=test.minIndex(array,2);

       System.out.println("result value is "+ result);
    }
}
