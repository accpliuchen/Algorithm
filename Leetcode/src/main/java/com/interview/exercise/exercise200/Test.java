package com.interview.exercise.exercise200;

public class Test {

	int numIsland=0;

	public int numIslands(char[][] grid) {

		for(int i=0;i<grid.length; i++){
			for(int j=0;j<grid[0].length; j++){
				if(grid[i][j]=='1'){
					dfs(grid, i, j);
					numIsland++;

				}
			}
		}
		return numIsland;
	}

	public void dfs(char[][] grid, int m, int n){
		if(m<0 || m>=grid.length || n<0 || n>=grid[0].length || grid[m][n]=='0'){
			return;
		}
		grid[m][n]='0';
		dfs(grid, m+1, n);
		dfs(grid, m-1,n);
		dfs(grid, m, n+1);
		dfs(grid, m, n-1);
	}
	public static void main(String args[]){
		char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};	

		Test test=new Test();
		int result=test.numIslands(grid);

		System.out.println("result value is "+ result);
	}
}
