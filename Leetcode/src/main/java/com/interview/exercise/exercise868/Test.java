package com.interview.exercise.exercise868;

public class Test {


    public int binaryGap(int n) {

        int ans=0,count=0;
        boolean foundOne=false;

        while(n>0){
            if ((n & 1) == 1) {
                foundOne = true;
                ans = Math.max(ans, count);
                count = 0;
            }
            if (foundOne)
                ++count;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String args[]){
        int n=22;
    }
}
