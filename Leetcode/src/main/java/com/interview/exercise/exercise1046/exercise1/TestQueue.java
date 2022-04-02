package com.interview.exercise.exercise1046.exercise1;

import java.util.PriorityQueue;
public class TestQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> o2 -o1);

        queue.offer(2);
        queue.offer(7);
        queue.offer(4);
        queue.offer(1);
        queue.offer(8);
        queue.offer(1);
        //queue.offer(7);

        while (!queue.isEmpty()){
            Integer cur = queue.poll();
            System.out.print(cur+" ");
        }
    }
}