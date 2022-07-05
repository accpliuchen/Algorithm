package edu.laioffer.class9.exercise1;

import java.util.PriorityQueue;

public class exercise1 {
    public static void main(String args[]) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.offer(new Integer(4));
        minHeap.offer(new Integer(5));
        minHeap.offer(new Integer(2));
        minHeap.offer(new Integer(3));
        minHeap.offer(new Integer(1));

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}

class Integer implements  Comparable<Integer>{
    private int value;

    public Integer(int value){
        this.value=value;
    }


    @Override
    public int compareTo(Integer another){
        if(this.value==another.value){
            return 0;
        }
        return this.value< another.value?-1:1;
    }
}
