package com.interview.exercise.exercise74.exercise1;

public class Test {

    public boolean searchMatrix(int[][] matrix, int target) {
    	 int row=matrix.length;
         int col=matrix[0].length;
         int i=0;
         int j=row*col-1;

         while(i<=j){
             int mid=i+(j-i)/2;

             int r=mid/col;
             int c=mid%col;

             if(matrix[r][c]==target){
                 return true;
             }else if(matrix[r][c]>target){
                 j=mid-1;
             }else{
                 i=mid+1;
             }
         }

         return false;
    }
	
	public static void main(String args[]){
      int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
      int target = 3;

      Test test=new Test();

      boolean result=test.searchMatrix(matrix,target);

      System.out.println("result value is "+ result); 
	}
}
