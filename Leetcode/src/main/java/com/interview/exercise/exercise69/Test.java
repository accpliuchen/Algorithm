package com.interview.exercise.exercise69;

public class Test {

    public int mySqrt(int x){
        long start=1;
        long end=x;

        while(start+1<end){
            long mid=start+(end-start)/2;

            if(mid* mid==x){
                return (int) mid;
            }else if(mid*mid<x){
                start=mid;
            }else {
                end=mid;
            }
        }

        if(end * end <=x){
            return (int) end;
        }else{
            return (int) start;
        }
    }

    public static void main(String args[]){
        int nums=4;

        Test test=new Test();

        System.out.println(Math.sqrt(4));
        System.out.println(test.mySqrt(nums));
    }
}
