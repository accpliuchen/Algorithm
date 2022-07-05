package com.test.interview.queue.exercise3;

import java.util.Deque;
import java.util.ArrayDeque;

public class Test {
    public static void main(String args[]){
        //Declare Deque object
        Deque<String> deque = new ArrayDeque<>();
        // add elements to the queue using various methods
        deque.add("One");           //add ()
        deque.addFirst("Two");      //addFirst ()
        deque.addLast("Three");     //addLast ()
        deque.push("Four");         //push ()
        deque.offer("Five");        //offer ()
        deque.offerFirst("Six");    //offerFirst ()
        deque.offerLast("Seven");   //offerLast ()
        System.out.println("Initial Deque:");
        System.out.print(deque + " ");



    }
}
