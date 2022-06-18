package com.test.interview.queue.exercise1;

import  java.util.ArrayDeque;
import  java.util.Deque;
import  java.util.Queue;

public class Test {

    public static void main(String args[]){
        Queue<Integer> queue=new ArrayDeque<Integer>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);


        while(!queue.isEmpty()){
            System.out.print(queue.peek());
            //.out.println("")
            System.out.print(queue.poll());
        }

        //3  2   1
        Deque<Integer> deque=new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);

        //3 2 1 4 5 6
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);


        int size=deque.size();

        for(int i=0;i<size;i++){
            if(i%2==0){
                System.out.println(deque.peekFirst());
                System.out.println(deque.pollFirst());
            }else{
                System.out.println(deque.peekLast());
                System.out.println(deque.pollFirst());
            }
        }

    }
}


