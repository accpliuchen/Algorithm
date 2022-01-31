package com.test.interview.priorityqueues.exercise3;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueExample  {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers=new PriorityQueue<>();

        numbers.add(3);
        numbers.add(2);

        System.out.println("PriorityQueue :"+numbers);

        numbers.offer(1);

        System.out.println("PriorityQueue :"+numbers);

        System.out.println("Item:"+ numbers.poll());
        System.out.println("Item:"+ numbers.poll());
        System.out.println("Item:"+ numbers.poll());


        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Employee(1l, "AAA", LocalDate.now()));
        priorityQueue.add(new Employee(4l, "CCC", LocalDate.now()));
        priorityQueue.add(new Employee(5l, "BBB", LocalDate.now()));
        priorityQueue.add(new Employee(2l, "FFF", LocalDate.now()));
        priorityQueue.add(new Employee(3l, "DDD", LocalDate.now()));
        priorityQueue.add(new Employee(6l, "EEE", LocalDate.now()));

        while(true)
        {
            Employee e = priorityQueue.poll();
            System.out.println(e);

            if(e == null) break;
        }
    }
}
