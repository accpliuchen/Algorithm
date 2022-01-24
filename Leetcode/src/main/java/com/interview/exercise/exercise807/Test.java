package com.interview.exercise.exercise807;

public class Test {

    public int maxIncreaseKeepingSkyline(int[][] grid){
        int res=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
                //System.out.print(grid[i][j]);
                System.out.print(helper(grid,i,j)+"===");
                System.out.println("grid value is "+grid[i][j]);
                res+=helper(grid,i,j)-grid[i][j];
            }
            System.out.println("");
            System.out.println("res value is "+res);
        }
        return res;
    }

    private int helper(int[][] grid,int i,int j){
        int max1=0,max2=0;

        for(int c=0;c<grid[0].length;c++){
            max1=Math.max(max1,grid[i][c]);
        }
        //System.out.println("max1 vaue "+ max1);

        for(int r=0;r<grid[0].length;r++){
            max2=Math.max(max2,grid[r][j]);
        }

        //System.out.println("max2 vaue "+ max2);
        return Math.min(max1,max2);
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};

        Test test=new Test();
        test.maxIncreaseKeepingSkyline(grid);
    }
}
