package edu.laicode.exercise561;

public class Test {

    public int findElement(int[][] matrix, int k) {
        if (matrix == null) {
            return -1;
        }

        int row_n = matrix.length;
        int col_n = matrix[0].length;

        if (k > row_n * col_n) {
            return -1;
        }


        System.out.println((k) / col_n);
        System.out.println((k) % col_n);

        return matrix[(k) / col_n][(k) % col_n];
    }

    public static void main(String args[]){
        int[][] matrix=new int[][]{{1,3,4,},{5,6,7},{8,9,10}};
        int i=3;
        int j=5;

        System.out.println(i%j);
        System.out.println((float)i/j);

        Test test=new Test();
        int result=test.findElement(matrix,4);

        System.out.println(result);
    }
}
