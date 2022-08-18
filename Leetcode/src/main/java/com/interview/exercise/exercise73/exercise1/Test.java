package com.interview.exercise.exercise73.exercise1;

public class Test {
    
    public void setZeroes(int[][] matrix){
    	boolean[] zeroRow=new boolean[matrix.length];

    	boolean[] zeroColumn=new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
        		if(matrix[i][j]==0){
        			zeroRow[i]=true;
        			zeroColumn[j]=true;
        		}
        	}
        }

        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
        		if(zeroRow[i] || zeroColumn[j]){
        			matrix[i][j]=0;
        		}
        	}
        }
    }
     
	public static void main(String args[]){
	    // int[][] matrix=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
		
		int[][] matrix=new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

		Test test=new Test();

		test.setZeroes(matrix);

		System.out.println("===");
	}
}
