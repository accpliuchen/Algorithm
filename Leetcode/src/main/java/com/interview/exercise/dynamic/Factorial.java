package com.interview.exercise.dynamic;

public class Factorial {


    //recursive
    public int factorial(int i){
        if(i<0)
            return -1;
        else if(i==0)
            return 1;
        return i*factorial(i-1);
    }

    //dynamic upon to down

    public static int[] result;

    public int factorial_dynamic(int n){
        if(n<0)
            return -1;
        else if(n==0)
            return 1;

        result=new int[n+1];
        result[0]=1;

        for(int i=1;i<result.length;i++){
            result[i]=-1;
        }
        return solve(n);
    }

    //https://blog.csdn.net/yingfengfeixiang/article/details/79826878
    public int factorial_dynamic_bottomup(int n){
        if(n<0)
            return -1;
        else if(n==0)
            return 1;
        int[] result=new int[n+1];
        result[0]=1;
        for(int i=1;i<result.length;i++){
            result[i]=i*result[i-1];
        }
        return result[result.length-1];
    }

    public int solve(int n){
        if(result[n]>=0)
            return result[n];
        result[n]=n*solve(n-1);
        return result[n];
    }


    public static void main(String args[]){
        Factorial test=new Factorial();
        int result=test.factorial_dynamic(5);


        System.out.println(result);
    }

}
