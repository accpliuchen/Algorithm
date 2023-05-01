package com.test.interview.linkedlist.exercise9;

import java.util.LinkedList;

public class Test{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();

        list.add(2);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(6);

        // Getting the first element
        System.out.println("First Element is : "
                + list.getFirst());

        // Getting the last element
        System.out.println("Last Element is : "
                + list.getLast());
    }
}

