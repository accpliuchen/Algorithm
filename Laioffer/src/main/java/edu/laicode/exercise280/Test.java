package edu.laicode.exercise280;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        // Write your solution here.

        while (!s1.isEmpty()) {
            int globalMin = s1.peekFirst();
            int cnt = 1;
            s2.offerFirst(s1.pollFirst());

            while (!s1.isEmpty()) {
                int temp = s1.peekFirst();

                 if (temp < globalMin) {
                   globalMin = temp;
                   cnt = 1;
                 }
                 else if (temp == globalMin) {
                   ++cnt;
                }

                s2.offerFirst(s1.pollFirst());
            }

            while (!s2.isEmpty() && s2.peekFirst() >= globalMin) {
                if (s2.peekFirst() > globalMin) {
                    s1.offerFirst(s2.pollFirst());
                }
                else {
                    s2.pollFirst();
                }
            }

            while (cnt != 0) {
                s2.offerFirst(globalMin);
                --cnt;
            }
        }

        while (!s2.isEmpty()) {
            s1.offerFirst(s2.pollFirst());
        }

    }

    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);

        Test test=new Test();
        test.sort(list);

        System.out.println("===");

    }
}

