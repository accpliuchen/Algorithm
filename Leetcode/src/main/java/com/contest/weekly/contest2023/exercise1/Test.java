package com.contest.weekly.contest2023.exercise1;

public class Test {

    public int findChampion(int[][] grid) {
        int n = grid.length;
        boolean[] isChampion = new boolean[n];

        for (int i = 0; i < n; i++) {
            boolean isStronger = false;
            for (int j = 0; j < n; j++) {
                if (i != j && grid[j][i] == 1) {
                    isStronger = true;
                    break;
                }
            }
            isChampion[i] = !isStronger;
        }

        for (int i = 0; i < n; i++) {
            if (isChampion[i]) {
                return i;
            }
        }

        return -1; // No champion found
    }
    public static void main(String args[]){
        int[][] grid = new int[][]{{0,0,1},{1,0,1},{0,0,0}};

        Test test=new Test();
        int result=test.findChampion(grid);


        System.out.println(result);
    }
}
