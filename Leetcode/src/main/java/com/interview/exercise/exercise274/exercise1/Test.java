package com.interview.exercise.exercise274.exercise1;

public class Test {

    public int hIndex(int[] citations){
        int n=citations.length;
        int[] papers=new int[n+1];

        for(int c:citations){
            papers[Math.min(n,c)]++;
        }

        int k=n;

        for(int s=papers[n];k>s;s+=papers[k]) {
            k--;
        }

        return k;
    }

    public static void main(String args[]){
        int[] citations =new int[] {3,0,6,1,5};

        Test test=new Test();

        int result=test.hIndex(citations);


        System.out.println(result);

    }
}
