package com.interview.exercise.exercise542;

import java.util.Queue;
import java.util.LinkedList;

public class Test {

    public int[][] updateMatrix(int[][] mat) {
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) q.offer(new int[] {i, j});
                else mat[i][j] = Integer.MAX_VALUE;
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for (int[] d : dir) {
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];
                if (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] > mat[curr[0]][curr[1]] + 1) {
                    q.offer(new int[] {r, c});
                    mat[r][c] = mat[curr[0]][curr[1]] + 1;
                }
            }
        }
        return mat;
    }

    public static void main(String args[]){
        int[][] mat = new int[][] {{0,0,0},{0,1,0},{0,0,0}};

        Test test=new Test();
        int[][] result=test.updateMatrix(mat);

        for (int i = 0; i < result.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            // Print a new line at the end of each row
            System.out.println();
        }

    }
}
