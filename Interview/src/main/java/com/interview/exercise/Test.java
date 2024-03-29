package com.interview.exercise;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.SortedMap;
import java.text.SimpleDateFormat;

public class Test {

    public static List<Log> list=new ArrayList<>();
    public static SortedMap<Timestamp,Log> map=new TreeMap<>();

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    long time=500;

    public Test() throws InterruptedException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date();

        for(int i=0;i<100;i++) {
            Log log = new Log(1, "sina.com", new Timestamp(i));

            list.add(log);
            map.put(new Timestamp(i),log);
            Thread.sleep(time);
        }
    }

    public static final int notFound=-1;

    public int binarySearch(double s[],int low, int high,double key){
        int mid;
        while (low <= high) {
             mid=low+(high-low)/2;

             if(mid>key)
                 high=mid-1;
             else if(mid<key)
                 low=mid+1;
             else
                 return mid;

        }
        return notFound;

    }



    public static void main(String args[]) throws InterruptedException {

        Test test=new Test();

        System.out.println(list.size());
        System.out.println("");

        System.out.println(map.size());

        System.out.println("");
    }
}
