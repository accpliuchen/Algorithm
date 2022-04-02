package com.interview.exercise.exercise1572;

public class Test {

    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for(int i=0;i<n;i++) sum = sum + mat[i][i];
        for(int i=0;i<n;i++) sum = sum + mat[i][n-i-1];
        sum = sum - ((n%2==0) ? 0 : mat[n/2][n/2]);
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat= {{1,2,3},{4,5,6}, {7,8,9}};

        Test test=new Test();
        int result=test.diagonalSum(mat);

        System.out.println("result value is "+ result);

    }
}
