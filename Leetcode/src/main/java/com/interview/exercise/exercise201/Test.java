package com.interview.exercise.exercise201;

public class Test {

    public int rangeBitwiseAnd(int left, int right) {
        for(int i=right-1;i>=left;i--) {

            right=right&i;
            i=right;
        }
        return right;
    }


    public static void main(String args[]){
        //left = 5, right = 7
    }
}
