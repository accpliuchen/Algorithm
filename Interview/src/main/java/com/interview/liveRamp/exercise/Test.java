package com.interview.liveRamp.exercise;

import java.util.Arrays;

public class Test {

    public boolean solution(int[] A){
        int n=A.length;
        boolean isflag=true;

        if(n%2!=0 || n==0){
            return false;
        }
        Arrays.sort(A);

        for(int i=0;i<n;i=i+2){
            if(A[i]!=A[i+1]){
                isflag=false;
                break;
            }
        }

        return isflag;
    }

    public static void main(String args[]){
        int[] array=new int[]{1,2,2,1};

//        int[] array=new int[]{7,7,7};

//        int[] array=new int[]{1,2,2,3};

        Test test=new Test();
        boolean result=test.solution(array);

        System.out.println(result);
    }
}
