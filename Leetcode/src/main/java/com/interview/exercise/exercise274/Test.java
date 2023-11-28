package com.interview.exercise.exercise274;

import java.util.Arrays;

public class Test {


    public int hIndex(int[] citations){
        Arrays.sort(citations);
        int i=0;

        while(i<citations.length && citations[citations.length-1-i]>i){
            i++;
        }

        return i;
    }

    public static void main(String args[]){
        int[] citations =new int[] {3,0,6,1,5};

        Test test=new Test();

        int result=test.hIndex(citations);


        System.out.println(result);

    }
}

