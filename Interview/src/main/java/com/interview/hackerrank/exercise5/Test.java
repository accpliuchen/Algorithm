package com.interview.hackerrank.exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Test {

    public List<String> generateReport(int numOfRunways,List<List<Integer>> requests){

        requests.sort((x,y)->Integer.compare(x.get(0),y.get(0)));
        PriorityQueue<List<Integer>> queue = new PriorityQueue<List<Integer>>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<numOfRunways;i++){
            if(i<numOfRunways){
                queue.add(requests.get(i));
                sb.append(requests.get(i).get(1)+" "+ requests.get(i).get(0)+"ACCEPTED");
            }
        }

        requests.remove(numOfRunways);


        while(!queue.isEmpty()){

        }



        //requests.sort((x,y)->Integer.compare(x.get(0),y.get(0)));
        //requests.sort((x,y)->Integer.compare(x.get(0), y.get(0)));


//        PriorityQueue<List<Integer>> heap = new PriorityQueue<List<Integer>>((x,y) ->Integer.compare(x.get(0),y.get(0)));
//        heap.add(requests.get(0));
        return null;
    }

    public static void main(String[] args) {
        int numOfRunways=1;

        List<Integer> one=new ArrayList<>();
        one.add(new Integer(377));
        one.add(new Integer(45));

        List<Integer> two=new ArrayList<>();
        two.add(new Integer(367));
        two.add(new Integer(45));

        List<Integer> three=new ArrayList<>();
        three.add(new Integer(357));
        three.add(new Integer(50));


        List<Integer> four=new ArrayList<>();
        four.add(new Integer(347));
        four.add(new Integer(51));

        List<List<Integer>> result=new ArrayList<>();
        result.add(one);
        result.add(two);
        result.add(three);
        result.add(four);

        Test test=new Test();
        List<String> list=test.generateReport(numOfRunways,result);
        System.out.println("list value is "+ list.size());
    }
}
