package com.interview.exercise.exercise295;

import java.util.PriorityQueue;

public class Demo {
    private PriorityQueue<Long> small;
    private PriorityQueue<Long> large;


    public Demo(){
        small=new PriorityQueue<>();
        large=new PriorityQueue<>();
    }

    public void addNum(int num){
        large.add((long)num);
        small.add(-large.poll());

        if(large.size()< small.size()){
            large.add(-small.poll());
        }
    }

    public double findMedian(){
        if(large.size()> small.size())
            return large.peek();
        else
            return (large.peek()-small.peek())/2;
    }

    public static void main(String[] args) {
        Demo medianFinder = new Demo();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        medianFinder.findMedian(); // return 2.0
    }
}
