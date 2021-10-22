package com.interview.exercise.exercise367;

public class Test {

    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }

        long low=2;
        long high=num/2;

        while(low<=high){

            long mid = low+(high-low)/2;

            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }

        return false;

    }

    public static void main(String args[]){
        Test test=new Test();

        int nums=16;

        System.out.println(test.isPerfectSquare(nums));
    }
}
