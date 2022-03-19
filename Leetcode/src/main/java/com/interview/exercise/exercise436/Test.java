package com.interview.exercise.exercise436;

import java.util.TreeMap;

public class Test {

    public int[] findRightInterval(int[][] intervals){
        if(intervals==null || intervals.length==0) return new int[0];

        int n= intervals.length;
        int[] res=new int[n];

        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(intervals[i][0],i);
        }

        for(int i=0;i<n;i++){
            System.out.println(intervals[i][1]);
            Integer key=map.ceilingKey(intervals[i][1]);

            if(key==null){
                res[i]=-1;
            }else{
                res[i]=map.get(key);
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        int[][] intervals= {{3,4},{2,3},{1,2}};
        int[][] intervals= {{1,4},{2,3},{3,4}};


        Test test=new Test();
        int[] array=test.findRightInterval(intervals);

        for(int nums:array)
            System.out.println(nums);

    }
}
