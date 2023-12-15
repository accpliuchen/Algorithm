package com.interview.exercise.exercise59;

public class Test {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int upper = 0, lower = n - 1;
        int left = 0, right = n - 1;

        int val = 1;

        while(val <= n * n) {
            if(upper <= lower) {
                for (int j = left; j <= right; j++) {
                    res[upper][j] = val++;
                }

                upper++;
            }

            if(left <= right) {
                for (int i = upper; i <= lower; i++) {
                    res[i][right] = val++;
                }

                right--;
            }

            if (upper <= lower) {
                for (int j = right; j >= left; j--) {
                    res[lower][j] = val++;
                }

                lower--;
            }

            if (left <= right) {
                for (int i = lower; i >= upper; i--) {
                    res[i][left] = val++;
                }

                left++;
            }
        }

        return res;
    }


    public static void main(String args[]){
        Test test=new Test();



    }
}
