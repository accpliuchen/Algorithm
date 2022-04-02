package com.test.interview.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
            Queue<String> queue=new PriorityQueue<>();

            queue.offer("apple");
            queue.offer("pear");
            queue.offer("banana");
            queue.offer("ape");


            System.out.println(queue.poll()); // apple
            System.out.println(queue.poll()); // banana
            System.out.println(queue.poll()); // pear
            System.out.println(queue.poll()); // null,因为队列为空
    }
}
