package com.interview.exercise.exercise73;

public class Test {

    public void setZeros(int[][] matrix) {
        boolean[] zeroRow = new boolean[matrix.length];
        boolean[] zeroColumn = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zeroRow[i]=true;
                    zeroColumn[i]=true;
                }
            }
        }
        for (int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(zeroRow[i] || zeroColumn[j]){
                    matrix[i][j] =0;
                }
            }
        }

    }
        public static void main(String args[]){
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};

        Test test=new Test();
        test.setZeros(matrix);

//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }

    }
}
