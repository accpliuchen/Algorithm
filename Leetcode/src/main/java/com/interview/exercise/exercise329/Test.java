package com.interview.exercise.exercise329;

public class Test {

	// public int longestIncreasingPath(int[][] matrix) {
 //        int ROW = matrix.length;
 //        int COL = matrix[0].length;

 //        int[][] memo = new int[ROW][COL];

 //        int max = Integer.MIN_VALUE;

 //        for(int i = 0; i < ROW; i++) {
 //            for(int j = 0; j < COL; j++) {
 //               int currMax = dfs(matrix, i, j, -1, memo);
 //               max = Math.max(max, currMax);
 //            }
 //        }
 //        return max;
 //    }

 //    private int dfs(int[][] matrix, int i, int j, int previous, int[][] memo) {
 //        if(!isInBound(matrix, i, j)) return 0;
 //        if(previous >= matrix[i][j]) return 0;
 //        if(memo[i][j] != 0) return memo[i][j];


 //        int curr = matrix[i][j];

 //        int top = dfs(matrix, i-1, j, curr, memo);
 //        int bottom = dfs(matrix, i+1, j, curr, memo);
 //        int left = dfs(matrix, i, j-1, curr, memo);
 //        int right = dfs(matrix, i, j+1, curr, memo);

 //        int max = top;
 //        max = Math.max(max, bottom);
 //        max = Math.max(max, left);
 //        max = Math.max(max, right);


 //        memo[i][j] = max + 1;
 //        return memo[i][j];
 //    }

 //    private boolean isInBound(int[][] matrix, int i, int j) {
 //        return i >=0 && j >= 0 && i < matrix.length && j < matrix[i].length;
 //    }

	public int longestIncreasingPath(int[][] matrix) {
        Integer[][] cache = new Integer[matrix.length][matrix[0].length];
        int longest = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                longest = Math.max(longest, dfs(i, j, -1, matrix, cache));
            }
        }
        return longest;
    }
    
    public int dfs(int row, int col, int parent, int[][] matrix, Integer[][] cache){
        if(row < 0 || row == matrix.length || col < 0 || col == matrix[0].length ||
          matrix[row][col] <= parent){
            return 0;
        }
        if(cache[row][col] != null){
            return cache[row][col];
        }
        int up = 1 + dfs(row + 1, col, matrix[row][col], matrix, cache);
        int down = 1 + dfs(row - 1, col, matrix[row][col], matrix, cache);
        int left = 1 + dfs(row, col - 1, matrix[row][col], matrix, cache);
        int right = 1 + dfs(row, col + 1, matrix[row][col], matrix, cache);
        
        int longestPath = Math.max(Math.max(up, down), Math.max(left, right));
        cache[row][col] = longestPath;
        return longestPath;
    }

    public static void main(String args[]){
     int[][] matrix = {{1, 2,3,4}, {5,6,7,8}, {4,3,2,1}};    

     Test test=new Test();

     int result=test.longestIncreasingPath(matrix);
     System.out.println(result);
    }
}
