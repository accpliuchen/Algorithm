package com.interview.exercise.exercise252;

import java.util.Arrays;

public class Test {

    public boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]>intervals[i+1][0]){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
//        int[][] intervals=new int[][]{{0,30},{5,10},{15,20}};
        int[][] intervals=new int[][]{{7,10},{2,4}};

        Test test=new Test();
        boolean result=test.canAttendMeetings(intervals);

        System.out.println(result);
    }
}
