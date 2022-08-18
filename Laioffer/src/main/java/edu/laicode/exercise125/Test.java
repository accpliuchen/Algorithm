package edu.laicode.exercise125;

public class Test {

	public void rotate(int[][] matrix){
		if(matrix ==null || matrix.length<2){
			return;
		}

		int n=matrix.length-1;
		int round=n/2;


	   for (int i = 0; i < round; ++i) {
	      for (int j = i; j < n - i; ++j) {
	        int temp = matrix[i][j];
	        matrix[i][j] = matrix[n - j][i];
	        matrix[n  - j][i] = matrix[n  - i][n - j];
	        matrix[n  - i][n - j] = matrix[j][n - i];
	        matrix[j][n - i] = temp;
	      }
      }
	}

	public static void main(String args[]){
		int[][] matrix=new int[][]{ {1,  2,  3},{8,  9,  4},{7,  6,  5} };
	    
	    Test test=new Test();

	    test.rotate(matrix);

	    System.out.println("===");
	}
}
