package com.interview.exercise.exercise1646;

//https://leetcode.com/problems/get-maximum-in-generated-array/
public class Test {


    public int getMaximumGenerated(int n){
        if(n==0 || n==1)
            return n;

        int num[]=new int[n+1];
        num[0]=0;
        num[1]=1;
        int max=0;

        for(int i=2;i<=n;i++){
           if(i%2==0)
               num[i]=num[i/2];
           else
               num[i]=num[i/2]+num[(i/2)+1];

           max=Math.max(max,num[i]);
        }
        return max;
    }

    public static void main(String args[]){
        int num=4;

        Test test=new Test();

        System.out.println(test.getMaximumGenerated(7));
    }
}
