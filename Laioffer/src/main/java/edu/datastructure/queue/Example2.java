package edu.datastructure.queue;

import java.util.Deque;
import java.util.Queue;
import java.util.ArrayDeque;

public class Example2 {
    public static void main(String args[]){
        Deque deque=new ArrayDeque();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);

//        deque.offerLast(4);
//        deque.offerLast(5);
//        deque.offerLast(6);

        int size=deque.size();

        System.out.println("deque size is "+ size);

//        for(int i=0;i<size;i++){
//            if(i%2==0){
//                System.out.println(deque.peekFirst());
//                System.out.println(deque.pollFirst());
//            }else{
//                System.out.println(deque.peekFirst());
//                System.out.println(deque.pollFirst());
//            }
//        }

        while(!deque.isEmpty()){
            System.out.println(deque.peekFirst());
            System.out.println(deque.pollFirst());
        }
    }
}
