package com.interview.exercise.exercise452;


import java.util.Arrays;
import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test {
    
    public int findMinArrowsShots(int[][] points){

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int reach = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > reach) {
                arrows++;
                reach = points[i][1];
            }
        }

        return arrows;
    }
    
    public static void main(String args[]){
        int[][] matrix=new int[][]{{10,16},{2,8},{1,6},{7,12}};
        
        Test test=new Test();

        int result=test.findMinArrowsShots(matrix);

        System.out.println(result);
    }
}
