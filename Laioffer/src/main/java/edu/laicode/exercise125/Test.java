package edu.laicode.exercise125;

public class Test {

	public void rotate(int[][] matrix){
		if(matrix ==null || matrix.length<2){
			return;
		}

		int n=matrix.length;
		int round=n/2;


	   for (int i = 0; i < round; ++i) {
	      for (int j = i; j < n - i-1; ++j) {
	        int temp = matrix[i][j];
			matrix[i][j] = matrix[n - 1 - j][i];
			matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
			matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
			matrix[j][n - 1 - i] = temp;
	      }
      }
	}

	public static void main(String args[]){
//		int[][] matrix=new int[][]{ {1,  2,  3},{8,  9,  4},{7,  6,  5} };

		int[][] matrix=new int[][]{ {1,  2,  3},{4,5,6 },{7,  8,  9} };
	    
	    Test test=new Test();

	    test.rotate(matrix);

	    System.out.println("===");
	}
}
