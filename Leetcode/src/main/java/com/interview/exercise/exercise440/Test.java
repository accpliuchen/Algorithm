package com.interview.exercise.exercise440;

public class Test {

//    public int findKthNumber(int n, int k) {
//        int result = 1;
//        --k;
//        while (k > 0) {
//            long step = 0, first = result, last = result + 1;
//            while (first <= n) {
//                step += Math.min((long)n + 1, last) - first;
//                first *= 10;
//                last *= 10;
//            }
//            if (step <= k) {
//                ++result;
//                k -= step;
//            } else {
//                result *= 10;
//                --k;
//            }
//        }
//        return result;
//    }

    public int findKthNumber(int n, int k) {
        long cur=1;
        k-=1;

        while(k>0){
            int nodes=countNodes(n,cur);
            if(k>=nodes){
                k-=nodes;
                cur++;
            }else{
                k--;
                cur*=10;
            }
        }

        return (int) cur;
    }

    private int countNodes(long n,long cur){
        long total=0;
        long next=cur+1;

        while(cur<=n){
            total+=Math.min(n-cur+1,next-cur);
            cur*=10;
            next*=10;
        }

        return (int) total;
    }




    public static void main(String args[]){
        int n=13;
        int k=2;

        
        Test test=new Test();
        int result=test.findKthNumber(n,k);
        
        System.out.println(result);
    }
    
}
