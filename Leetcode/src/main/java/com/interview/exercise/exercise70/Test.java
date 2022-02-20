package com.interview.exercise.exercise70;

public class Test {

    public int climbStairs(int n){
        int[] array=new int[n+1];
        array[0]=1;
        array[1]=1;

        for(int i=2;i<array.length;i++){
            array[i]=array[i-1]+array[i-2];
        }

        return array[n];
    }

    public static void main(String[] args) {
        int n=2;

        Test test=new Test();
        int result=test.climbStairs(n);

        System.out.println("result value is "+ result);
    }
}
