package com.test.interview.tree.treemap.exercise2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        NavigableMap<Integer, Integer> rankingMap = new TreeMap<>();

        rankingMap.put(1,1);  //ranking 1 ->1
        rankingMap.put(2,2); //ranking 2 ->2
        rankingMap.put(3,3); //ranking 3 -> 3
        rankingMap.put(4,4); //ranking 4-10 ->4
        rankingMap.put(11,5); //ranking 11-20 ->5
        rankingMap.put(21,6); //ranking 21-30 ->6
        rankingMap.put(31,7); //ranking >= 31 ->7

        System.out.println(rankingMap.floorEntry(12).getValue());
        System.out.println(rankingMap.lastEntry().getValue());
    }
}
