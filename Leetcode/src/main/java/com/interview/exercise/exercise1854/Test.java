package com.interview.exercise.exercise1854;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

    public int maximumPopulation(int[][] logs) {
        int[] diff=new int[110];

        for(int[] log:logs){
            diff[log[0]-1950]++;
            diff[log[1]-1950]--;
        }

        int cnt=0,max=0,res=1950;

        for(int i=0;i<=100;i++){
            if(i==1|| i==10 || i==20 )
            System.out.println(i);
            cnt+=diff[i];
            if(cnt>max){
                max=cnt;
                res=i+1950;
            }
        }

        return res;
    }


//    public int maximumPopulation(int[][] logs) {
//        Queue<int[]> minHeap = new PriorityQueue<>((a, b)-> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
//        for(int[] l : logs){
//            minHeap.offer(new int[]{l[0], 1});
//            minHeap.offer(new int[]{l[1], -1});
//        }
//        int res = Integer.MAX_VALUE, max = 0, tmp = 0;
//        while(!minHeap.isEmpty()){
//            int[] cur = minHeap.poll();
//            tmp += cur[1];
//            if(tmp > max){
//                res = cur[0];
//                max = tmp;
//            }
//        }
//        return res;
//    }


    public static void main(String args[]){
//        int[][] logs ={{1993,1999},{2000,2010}};
        int[][] logs ={{1950,1961},{1960,1971},{1970,1981}};

        Test test=new Test();
        int result=test.maximumPopulation(logs);



        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,map.getOrDefault(1,0)+1);


        System.out.println("result value is "+ result);
    }
}
