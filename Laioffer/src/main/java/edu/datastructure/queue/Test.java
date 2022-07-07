package edu.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {

    public static void main(String args[]){
        Queue<Integer> queue=new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        //3 2 1
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
