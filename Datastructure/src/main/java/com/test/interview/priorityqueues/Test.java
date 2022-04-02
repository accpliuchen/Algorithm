package com.test.interview.priorityqueues;


import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

//即返回结果为负数，零，正数，对应a小于，等于，大于b。
class Person{
    private int age;

    public Person(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
}
public class Test {
    public static void main(String[] args) {
        Person p1=new Person(1);
        Person p2=new Person(2);
        Person p3=new Person(3);
        Person p4=new Person(4);
        Person p5=new Person(5);


        PriorityQueue<Person> pq=new PriorityQueue<>(
                (a,b)->a.getAge()-b.getAge()
        );

        pq.offer(p3);
        pq.offer(p5);
        pq.offer(p2);
        pq.offer(p1);
        pq.offer(p4);

        Iterator<Person> it=pq.iterator();

        while(it.hasNext()){
            Person temp=(Person) it.next();

            System.out.println(temp.getAge());
        }


        System.out.println("==============");


        PriorityQueue<Person> qp=new PriorityQueue<>(
                (a,b)->b.getAge()-a.getAge()
        );

        qp.offer(p3);
        qp.offer(p5);
        qp.offer(p2);
        qp.offer(p1);
        qp.offer(p4);

        Iterator<Person> itp=qp.iterator();

        while(itp.hasNext()){
            Person temp=(Person) itp.next();

            System.out.println(temp.getAge());
        }


        System.out.println("==============");

        while(!pq.isEmpty()){
            Person p=(Person) pq.poll();

            System.out.println(p.getAge());
        }


        System.out.println("==============");

        PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        Integer val = null;
        while( (val = queue.poll()) != null) {
            System.out.println(val);
        }

    }
}
