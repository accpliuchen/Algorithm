package com.interview.exercise.exercise54;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return result;
        }

        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(up<down && left<right){

            for(int i=left;i<=right;i++){
                result.add(matrix[up][i]);
            }

            for(int i=up+1;i<=down-1;i++){
                result.add(matrix[i][right]);
            }

            for(int i=right;i>=left;i--){
                result.add(matrix[down][i]);
            }

            for(int i=down-1;i>=up+1;i--){
                result.add(matrix[i][left]);
            }


            up++;
            down--;
            left++;
            right--;

        }

        if(up==down){
            for(int i=left;i<=right;i++){
                result.add(matrix[up][i]);
            }
        }else if(left==right){
            for(int i=up;i<=down;i++){
                result.add(matrix[i][left]);
            }
        }

        return result;
    }


    public static void main(String args[]){

        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{3},{2}};

        Test test=new Test();
        List<Integer> result=test.spiralOrder(matrix);

        result.forEach(System.out::print);
    }
}
