package com.interview.exercise.exercise204;

//https://blog.csdn.net/qq_20304723/article/details/100903053?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1.nonecase&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1.nonecase
public class Test {

//    public int countPrimes(int n) {
//        if(n==0) return 0;
//        if(n==1) return 0;
//        if(n==2) return 0;
//        int[] dp=new int[n+1];
//
//        for(int i=3;i<=n;i++){
//            if(isPrime(i-1)){
//                dp[i]=dp[i-1]+1;
//            }else{
//                dp[i]=dp[i-1];
//            }
//        }
//
//        return dp[n];
//    }

//    public boolean isPrime(int n){
//        for(int i=2;i<n;i++){
//            if(n%1==0) return false;
//        }
//        return true;
//    }

//    public int countPrimes(int n){
//        if(n<3) return 0;
//        if(n==3) return 1;
//
//        boolean[] notPrime=new boolean[n+1];
//
//        for(int i=2;i<Math.sqrt(n);i++){
//            for(int j=2;i*j<n;j++){
//                notPrime[i*j]=true;
//            }
//        }
//
//        int count=0;
//        for(int i=2;i<n;i++){
//            if(!notPrime[i]) count++;
//        }
//        return count;
//    }

//    public int countPrimes(int n) {
//
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(isPrime(n)) count++;
//        }
//
//        return count;
//    }
//
//    public boolean isPrime(int n){
//        if(n<2)  return false;
//        for(int i=2;i<n;++i){
//            if(n%i==0) return false;
//        }
//        return true;
//    }

    public int countPrimes(int n){
        boolean[] primeNum=new boolean[n];
        int result=0;

        for(int i=2;i<n;i++){
            if(primeNum[i]==false){
                result++;

                for(int time=2;i*time<n;time++){
                    primeNum[i*time]=true;
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
//        int n=10;
        int n=10;

        Test test=new Test();
        int result=test.countPrimes(n);

        System.out.println("result value is "+ 5%10);
    }
}
