package com.test.interview.deque.exercise1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    public static void main(String args[]){
        Deque<Integer> de_que = new ArrayDeque<Integer>();

        // Use add() method to add elements into the Deque
        de_que.add(10);
        de_que.add(15);
        de_que.add(30);
        de_que.add(20);
        de_que.add(5);

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + de_que);

        // Displaying the first element
        System.out.println("The element at head is: " +
                de_que.pollFirst());



        // Displaying the last element
        System.out.println("The element at last is: " +
                de_que.pollLast());

        // Displaying the final ArrayDeque
        System.out.println("ArrayDeque after operation: "
                + de_que);

    }
}
