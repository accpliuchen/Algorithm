package com.interview.exercise.exercise74;

import java.util.Arrays;

public class Test {

//    public boolean searchMatrix(int[][] matrix, int target) {
//        for(int i=0;i<matrix.length;i++){
//            if(target>=matrix[i][0] && target<=matrix[i][matrix.length-1]){
//                int index= Arrays.binarySearch(matrix[i],target);
//
//                if(index<0){
//                    return false;
//                }else{
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1]) {
                int index = Arrays.binarySearch(matrix[i], target);
                return index < 0 ? false : true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 60;

        Test test=new Test();

        boolean result=test.searchMatrix(matrix,target);

        System.out.println("result value is "+result);
    }
}
