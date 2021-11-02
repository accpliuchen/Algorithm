package com.interview.exercise.exercise172;

public class Test {


    public int trailingZeros(int n) {
        int ans=0;
        int p=5;
        while(n/p>0){
            ans+=(n/p);
            p=p*5;
        }

        return ans;
    }

    public static void main(String args[]) {

        Test test=new Test();
        int result=test.trailingZeros(5);

        System.out.println("result value is "+result);

        System.out.println(5/25);
    }
}
