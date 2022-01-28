package com.test.interview.tree.treemap.exercise1;

import java.util.*;

//https://www.jianshu.com/p/2dcff3634326
public class Test {
    public static void main(String[] args) {
        Map<Person,Integer> map=new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);

        for (Person key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.get(new Person("Bob"))); // 2
    }

    static class Person{
        public String name;
        Person(String name){
            this.name=name;
        }

        public String toString(){
            return "{Person: "+name+"}";
        }
    }
}
