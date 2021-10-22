package com.interview.exercise.dynamic;

//https://blog.csdn.net/qq_28193019/article/details/89278941
public class RecursiveTest {

//    public int numWays(int n){
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//           return 2;
//        }
//        return numWays(n-1) + numWays(n-2);
//    }

    public int numWays(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return numWays(n-1) + numWays(n-2);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }


    public static int Fibonacci_recursion(int n){

        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci_recursion(n-1) + Fibonacci_recursion(n-2);
    }

    public static int Fibonacci(int n) {
        // 由数组a[]存储子问题的解
        int a[] = new int[1024];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }


    public int factorial (int n){
        if(n<0)
            return -1;
        else if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String args[]){

        RecursiveTest test=new RecursiveTest();

        int result=test.Fibonacci(10);
        int recursion_result=test.Fibonacci_recursion(10);

        System.out.println(result);
        System.out.println(recursion_result);

        System.out.println(test.factorial(5));
    }
}
