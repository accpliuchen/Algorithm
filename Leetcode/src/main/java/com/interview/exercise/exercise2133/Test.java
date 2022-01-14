package com.interview.exercise.exercise2133;

import java.util.Set;
import java.util.HashSet;

public class Test {

    public boolean checkValid(int[][] matrix){
        for(int i=0;i<matrix.length;++i){
            Set<Integer> row=new HashSet<>();
            Set<Integer> col=new HashSet<>();

            for(int j=0;j<matrix.length;++j){
                System.out.print(matrix[i][j]);
                System.out.print(matrix[j][i]);
                if(!row.add(matrix[i][j]) || !col.add(matrix[j][i]))
                    return false;
            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,1,2},{2,3,1}};
        //int[][] matrix = {{1,1,1},{1,2,3},{1,2,3}};

        Test test=new Test();

        boolean result=test.checkValid(matrix);

        System.out.println("result value is "+ result);
    }
}
