package com.interview.exercise.exercise48;

//https://leetcode.com/problems/rotate-image/
//https://leetcode.jp/leetcode-48-rotate-image-%E8%A7%A3%E9%A2%98%E6%80%9D%E8%B7%AF%E5%88%86%E6%9E%90/

//https://www.cxyzjd.com/article/mine_song/69939062
//https://leetcode.com/problems/rotate-image/discuss/18895/Clear-Java-solution
public class Test {


    public void rotate(int[][] matrix) {
        if (matrix == null)
            return;
        int n = matrix.length;
        // 沿着副对角线旋转
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = temp;
            }
        // 沿着中间水平线旋转
        for (int i = 0; i < n / 2; i++)
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
                break;
            }
    }

    public static void main(String args[]){
        int[][] matrix = { {  5, 1, 9,11 },
                { 2, 4, 8,10},
                { 13, 3, 6, 7},
                { 15,14,12,16 } };

        Test test=new Test();
        test.rotate(matrix);

        //System.out.println(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
