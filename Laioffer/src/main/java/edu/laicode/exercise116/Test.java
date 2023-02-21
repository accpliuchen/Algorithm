package edu.laicode.exercise116;

import java.util.Arrays;

public class Test {

    public int[] dedup(int[] array) {
        // Write your solution here

        if(array==null || array.length==0){
            return array;
        }

        int end=1;

        for(int i=2;i<array.length;i++){
            if(array[end-1]!=array[i]){
                array[++end]=array[i];
            }
        }

        return Arrays.copyOf(array,end+1);
    }

    public static void main(String args[]){
        int[] array=new int[]{1,2,2,2,3,3,3};

        Test test=new Test();

        int[] result=test.dedup(array);

        for(int res:result){
            System.out.println(res);
        }
    }

}
