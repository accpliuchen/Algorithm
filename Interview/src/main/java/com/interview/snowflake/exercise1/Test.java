package com.interview.snowflake.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

//https://www.chegg.com/homework-help/questions-and-answers/3-maximum-order-volume-day-supermarket-receive-calls-customers-want-place-orders-supermark-q72706238

public class Test {
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b)->a[1] - b[1]);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int cur = dp.floorEntry(job[0]).getValue() + job[2];
            if (cur > dp.lastEntry().getValue())
                dp.put(job[1], cur);
        }
        return dp.lastEntry().getValue();

    }
//
//    public static void main(String[] args) {
//       Test test=new Test();
////       int[] startTime = {1,2,3,3};
////       int[] endTime = {3,4,5,6};
////       int[] profit = {50,10,40,70};
//
////        int[] startTime = {10,5,15,18,30};
////        int[] endTime = {30,12,20,35,35};
////        int[] profit = {50,51,20,25,10};
//
//        int[] startTime = {1,2,4};
//        int[] endTime = {2,2,1};
//        int[] profit = {1,2,3};
//
//        int result=test.jobScheduling(startTime,endTime,profit);
//
//        System.out.println(result);
//
//    }

    public static void main(String[] argv) {
        List<Integer> start = Arrays.asList(new Integer[] {10, 5, 15, 18, 30});
        List<Integer> duration = Arrays.asList(new Integer[] {30, 12, 20, 35, 35});
        List<Integer> volume = Arrays.asList(new Integer[] {50, 51, 20, 25, 10});

//        List<Integer> start = Arrays.asList(new Integer[] {1,10,100});
//        List<Integer> duration = Arrays.asList(new Integer[] {1,10,100});
//        List<Integer> volume = Arrays.asList(new Integer[] {1,10,100});

//        List<Integer> start = Arrays.asList(new Integer[] {1,2,4});
//        List<Integer> duration = Arrays.asList(new Integer[] {2,2,1});
//        List<Integer> volume = Arrays.asList(new Integer[] {1,2,3});


        int result = maxOrderVolume(start, duration, volume);
        System.out.println(result);

        int[] startTime = {10,5,15,18,30};
        int[] endTime = {30,12,20,35,35};
        int[] profit = {50,51,20,25,10};


//        int[] startTime = {1,10,100};
//        int[] endTime = {1,10,100};
//        int[] profit = {1,10,100};

//        int[] startTime = {1,2,4};
//        int[] endTime = {2,2,1};
//        int[] profit = {1,2,3};

        int res = jobScheduling(startTime, endTime, profit);
        System.out.println(res);

    }

    public static int maxOrderVolume(List<Integer> start, List<Integer> duration, List<Integer> volume) {
//        int n = volume.size();
//        int []endTime = new int[n];
//        int []startTime = new int[n];
//        int []profit = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            endTime[i]=start.get(i)+duration.get(i);
//            startTime[i]=start.get(i);
//            profit[i]=volume.get(i);
//        }
//        int[][] jobs = new int[n][3];
//        for (int i = 0; i < n; i++) {
//            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
//        }
//        Arrays.sort(jobs, (a, b)->a[1] - b[1]);
//        TreeMap<Integer, Integer> dp = new TreeMap<>();
//        dp.put(0, 0);
//        for (int[] job : jobs) {
//            int cur = dp.floorEntry(job[0]).getValue() + job[2];
//            if (cur > dp.lastEntry().getValue())
//                dp.put(job[1], cur);
//        }
//        return dp.lastEntry().getValue();

        int n = volume.size();
        int []endTime = new int[n];
        int []startTime = new int[n];
        int []profit = new int[n];
        for(int i=0;i<n;i++)
        {
            endTime[i]=start.get(i)+duration.get(i);
            startTime[i]=start.get(i);
            profit[i]=volume.get(i);
        }
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b)->a[1] - b[1]);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int cur = dp.lowerEntry(job[0]).getValue() + job[2];
            //int cur=dp.floorEntry(job[0]).getValue() + job[2];
            if (cur > dp.lastEntry().getValue())
                dp.put(job[1], cur);
        }
        return dp.lastEntry().getValue();
    }
}
