package com.interview.exercise.exercise1235;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeMap;

public class Test {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[][] jobs=new int[n][3];

        for(int i=0;i<n;i++){
            jobs[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }

        Arrays.sort(jobs,(a,b)->a[1]-b[1]);
        TreeMap<Integer,Integer> dp=new TreeMap<>();
        dp.put(0,0);

        for (int[] job : jobs) {

            System.out.println("job[0] value is "+job[0] +" job[2] value is "+job[2]);

            //System.out.println("dp.floorEntry(job[0]).getValue() value is "+dp.floorEntry(job[0]).getValue()+" job[2] value is "+job[2]);

            if(job[0]==18) {
                System.out.println("=========job[0]==="+job[0]);
                System.out.println("==========="+dp.floorEntry(job[0]).getValue());
                System.out.println("========job[2]==="+job[2]);
            }
            int cur = dp.floorEntry(job[0]).getValue() + job[2];

            //System.out.println("current value is "+cur);

            //System.out.println("dp.lastEntry().getValue() is "+dp.lastEntry().getValue());

            if (cur > dp.lastEntry().getValue())
                dp.put(job[1], cur);
        }

        return dp.lastEntry().getValue();
    }

    public static void main(String[] args) {
        int[] startTime = {10,5,15,18,30};
        int[] endTime = {30,12,20,35,35};
        int[] profit = {50,51,21,25,10};

        Test test=new Test();
        int result=test.jobScheduling(startTime,endTime,profit);
        System.out.println("result value is "+result);
    }
}
