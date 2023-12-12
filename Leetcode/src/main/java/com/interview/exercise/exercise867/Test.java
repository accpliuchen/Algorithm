package com.interview.exercise.exercise867;

import java.util.Arrays;

public class Test {

    public int[][] transpose(int[][] matrix){

        int row=matrix.length;
        int col=matrix[0].length;

        int[][] ans=new int[col][row];

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                ans[c][r]=matrix[r][c];
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int[][] matrix=new int[][]{{1,2,3},{4,5,6}};

        Test test=new Test();

        int[][] result=test.transpose(matrix);

        Arrays.stream(result)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    }
}
