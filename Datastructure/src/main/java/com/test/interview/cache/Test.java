package com.test.interview.cache;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String args[]){
        Queue<Integer> que=new LinkedList<>();

        for(int i=0;i<10;i++){
            que.add(i);
        }

        // display queue
        System.out.println("Elements of queue "+que);

        // remove the head of queu
        int remove=que.remove();

        System.out.println("removed element-" + remove);

        System.out.println(que);

        int head = que.peek();
        System.out.println("head of queue-" + head);

        int size = que.size();
        System.out.println("Size of queue-" + size);
    }
}
