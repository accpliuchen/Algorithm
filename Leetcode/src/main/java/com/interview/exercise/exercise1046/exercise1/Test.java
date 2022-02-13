package com.interview.exercise.exercise1046.exercise1;

import java.util.Queue;
import java.util.PriorityQueue;

public class Test {

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> bq=new PriorityQueue<>((a,b)->b-a);

        for(int s:stones){
            bq.offer(s);
        }

        while(bq.size()>1){

            System.out.print(bq.poll() + "   ");
            System.out.print(bq.poll());

            System.out.println("==============");
            //bq.offer(bq.poll()-bq.poll());
        }

        return bq.poll();
    }

    public static void main(String[] args) {
        int[] array={2,7,4,1,8,1};

        Test test=new Test();
        int result= test.lastStoneWeight(array);

        System.out.println("result value is "+ result);
    }
}
