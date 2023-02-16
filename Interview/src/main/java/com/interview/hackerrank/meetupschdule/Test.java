package com.interview.hackerrank.meetupschdule;

import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static int countMeetings(List<Integer>firstDay,List<Integer>lastDay)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> a[1]-b[1]);
        for (int i = 0; i <firstDay.size(); i++)
        {
            pq.offer(new int[]{firstDay.get(i),lastDay.get(i)});
        }
        Set<Integer> days = new HashSet<Integer>();
        int count = 0;
        while(!pq.isEmpty())
        {
            int[] e = pq.poll();
            for(int i=e[0]; i<=e[1]; i++)
            {
                if(!days.contains(i))
                {
                    days.add(i);
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String args[]){
//        List<Integer>firstDay=new ArrayList<>();
//        firstDay.add(1);
//        firstDay.add(2);
//        firstDay.add(1);
//        firstDay.add(2);
//        firstDay.add(2);
//
//        List<Integer>lastDay=new ArrayList<>();
//        lastDay.add(3);
//        lastDay.add(2);
//        lastDay.add(1);
//        lastDay.add(3);
//        lastDay.add(3);


        List<Integer>firstDay=new ArrayList<>();
        firstDay.add(1);
        firstDay.add(2);
        firstDay.add(3);
        firstDay.add(3);
        firstDay.add(3);

        List<Integer>lastDay=new ArrayList<>();
        lastDay.add(2);
        lastDay.add(2);
        lastDay.add(3);
        lastDay.add(4);
        lastDay.add(4);

        Test test=new Test();

        int result=test.countMeetings(firstDay,lastDay);

        System.out.println(result);

    }
}
