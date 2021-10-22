package com.interview.exercise.exercise202;

public class Test {

    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            n=sumSequare(n);
        }
        return n==1;
    }

    private int sumSequare(int n){
        if(n<=0) return 0;
        return (n%10) * (n%10) +sumSequare((int)n/10);
    }

    public static void main(String args[]){
        int n=19;

        Test test=new Test();
        boolean result=test.isHappy(n);
        System.out.println("result is "+result);
    }
}
