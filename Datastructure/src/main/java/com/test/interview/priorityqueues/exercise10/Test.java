package com.test.interview.priorityqueues.exercise10;

import java.util.Comparator;
import java.util.PriorityQueue;


class MyComparator implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        if(a<b){
            return -1;
        }else if(a>b){
            return 1;
        }else{
            return 0;
        }

    }

}

public class Test {

    public static void main(String args[]){

        PriorityQueue<Integer> pq=new PriorityQueue<>(new MyComparator());

        pq.add(5);
        pq.add(2);
        pq.add(8);


        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
