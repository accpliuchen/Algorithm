package com.interview.exercise.exercise1046;

import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class Test {

//    public int lastStoneWeight(int[] stones) {
//      Queue<Integer>  maxQueue=new PriorityQueue<>(stones.length, Comparator.reverseOrder());
//
//      for(int stone:stones){
//          maxQueue.add(stone);
//      }
//
//      while(maxQueue.size()>=2){
//          int y=maxQueue.poll();
//          int x=maxQueue.poll();
//
//          if(y>x){
//              maxQueue.add(y-x);
//          }
//      }
//
//      return maxQueue.isEmpty()?0:maxQueue.peek();
//    }

    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int s:stones){
            pq.offer(s);
        }

        while(pq.size()>1){
            pq.offer(pq.poll()-pq.poll());
        }

        return pq.poll();
    }
    public static void main(String[] args) {
        int[] array={2,7,4,1,8,1};

        Test test=new Test();
        int result= test.lastStoneWeight(array);

        System.out.println("result value is "+ result);

    }
}
