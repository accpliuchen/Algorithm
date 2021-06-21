package com.test.interview.priorityqueues;

import java.util.*;

public class MinHeapPriorityQueue {
    static PriorityQueue minHeap = new PriorityQueue();

    public static void view() {
        for (Object x : minHeap) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // using "add" operation to insert elements
        minHeap.add(3);
        System.out.print("minHeap.add(3) = ");
        view();
        minHeap.add(13);
        minHeap.add(7);
        minHeap.add(16);
        minHeap.add(21);
        minHeap.add(12);
        minHeap.add(9);

        // printing Min-Heap
        System.out.print("minHeap.view() = ");
        view();

        // using "peek" method to view the head
        System.out.println("minHeap.peek() = " + minHeap.peek());

        // using "poll" method to remove and retrieve the head
        minHeap.poll();
        System.out.print("minHeap.poll() = ");
        view();

        // using "remove" method to remove specified element
        minHeap.remove(7);
        System.out.print("minHeap.remove(7) = ");
        view();

        // Check if an element is present using contains()
        boolean elementFound = minHeap.contains(11);
        System.out.println("minHeap.contains(11) = " + elementFound);
        elementFound = minHeap.contains(16);
        System.out.println("minHeap.contains(16) = " + elementFound);
    }
}