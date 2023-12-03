package com.interview.exercise.exercise1727;

import java.util.Arrays;

public class Test {

    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] prevRow = new int[n];
        int ans = 0;

        for (int row = 0; row < m; row++) {
            int[] currRow = matrix[row].clone();
            for (int col = 0; col < n; col++) {
                if (currRow[col] != 0) {
                    currRow[col] += prevRow[col];
                }
            }

            int[] sortedRow = currRow.clone();
            Arrays.sort(sortedRow);
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, sortedRow[i] * (n - i));
            }

            prevRow = currRow;
        }

        return ans;
    }

    public static void main(String args[]){
        int[][] matrix =new int[][] {{0,0,1},{1,1,1},{1,0,1}};

        Test test=new Test();

        System.out.println(test.largestSubmatrix(matrix));
    }
}
