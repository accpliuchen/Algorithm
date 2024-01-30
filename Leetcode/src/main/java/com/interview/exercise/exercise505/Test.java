package com.interview.exercise.exercise505;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {

    private static final int[][] DIRS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public int shortestDistance(int[][] maze, int[] start, int[] dest) {
        int[][] distance = new int[maze.length][maze[0].length];
        // Initialize the distance array
        for (int[] row: distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        // Sort the minHeap according to distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[2] - b[2]));
        // Put the start position into minHeap
        pq.offer(new int[]{start[0], start[1], 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            if (distance[curr[0]][curr[1]] != Integer.MAX_VALUE) {
                continue;
            }

            distance[curr[0]][curr[1]] = curr[2];
            for (int[] dir : DIRS) {
                int x = curr[0], y = curr[1];
                int count = 0;
                while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
                    x += dir[0];
                    y += dir[1];
                    count++;
                }
                x -= dir[0];
                y -= dir[1];
                count--;

                if (distance[x][y] == Integer.MAX_VALUE) {
                    pq.offer(new int[]{x, y, curr[2] + count});
                }
            }
        }

        return distance[dest[0]][dest[1]] == Integer.MAX_VALUE ? -1 : distance[dest[0]][dest[1]];
    }

    public static void main(String args[]){
        int[][] maze =new int[][]{{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
        int[] start = new int[]{0,4};
        int[] destination = new int[]{4,4};

        Test test=new Test();
        int result=test.shortestDistance(maze,start,destination);

        System.out.println("result value is "+ result);

    }
}
