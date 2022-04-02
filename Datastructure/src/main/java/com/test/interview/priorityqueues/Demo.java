package com.test.interview.priorityqueues;

import java.util.Iterator;
import java.util.PriorityQueue;

//https://blog.csdn.net/haohulala/article/details/122125529
public class Demo {
    public static void main(String[] args) {
        PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->a[0]-b[0]);

        queue.add(new int[]{2,5});
        queue.add(new int[]{1,6});
        queue.add(new int[]{3,2});
        queue.add(new int[]{4,9});
        queue.add(new int[]{5,1});

        Iterator<int[]> it=queue.iterator();

        while(it.hasNext()){
            int[] temp=(int[]) it.next();

            System.out.println(temp[0]);
        }
        System.out.println("==============");

        PriorityQueue<int[]> queue2=new PriorityQueue<>((a,b)->a[1]-b[1]);

        queue2.add(new int[]{2,5});
        queue2.add(new int[]{1,6});
        queue2.add(new int[]{3,2});
        queue2.add(new int[]{4,9});
        queue2.add(new int[]{5,1});

        Iterator<int[]> its=queue2.iterator();

        while(its.hasNext()){
            int[] temp=(int[]) its.next();

            System.out.println(temp[1]);
        }





    }
}
