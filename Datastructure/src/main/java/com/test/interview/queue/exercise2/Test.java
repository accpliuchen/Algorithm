package com.test.interview.queue.exercise2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String args[]){
        Deque<String> cities_deque = new ArrayDeque<String>();
        cities_deque.add("Delhi");
        cities_deque.add("Mumbai");
        cities_deque.add("Bangaluru");
        System.out.println("Deque Contents:");
        //Traverse the Deque
        for (String str : cities_deque) {
            System.out.print(str + " ");
        }
    }
}
