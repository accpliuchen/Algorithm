package com.interview.exercise.exercise240;

public class Test {

    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;

        while(i<matrix.length && j>=0){
            System.out.println("matrix[i][j] value "+matrix[i][j]);
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]<target) i++;
            else j--;
        }
        return false;
    }

    public static void main(String args[]){
        int[][]  matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}, {18,21,23,26,30}};

        Test test=new Test();
        boolean result=test.searchMatrix(matrix,20);
        System.out.println("result value is "+ result);
    }
}
