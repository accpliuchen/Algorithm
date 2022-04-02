package com.interview.amazon.exercise.exercise2;

public class Test {

    public int[] maximumRevenue(int[][] matrixs){
        int[] array=new int[matrixs.length];

        int max=0;

        for (int row = 0; row < matrixs.length; row++) {
            for (int col = 0; col < matrixs[row].length; col++) {
                max = Math.max(max, matrixs[row][col]);
            }
            array[row]=max;
            max=0;
        }

        return array;
    }


    public static void main(String[] args) {
        int[][] matrix=new int[][]{{100,198,333,323},{122,232,221,111},{223,565,245,764}};

        Test test=new Test();
        int[] array=test.maximumRevenue(matrix);

        for(int arr:array){
            System.out.println(arr);
        }
    }
}
