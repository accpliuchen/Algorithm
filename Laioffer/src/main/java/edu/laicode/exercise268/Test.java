package edu.laicode.exercise268;

public class Test {

    public int[] search(int[][] matrix, int target) {
        // Write your solution here
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0) {
            return new int[]{-1, -1};
        }
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[]{i, j};
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String args[]){
//		int[][] matrix=new int[][]{{1, 2, 3},{2, 4, 5},{6, 8, 10}};
//
//		int target=5;

        int[][] matrix=new int[][]{{1,2,5,6,8},{4,5,5,7,11},{7,7,10,11,11},{9,12,14,14,14}};

        int target=10;

		Test test=new Test();
		int[] result=test.search(matrix,target);

		for(int res:result)
		 System.out.println(res);
		
	}
}
