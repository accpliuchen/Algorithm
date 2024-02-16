package com.interview.exercise.exercise451;

import java.util.*;

public class Test {

//    public String frequencySort(String s){
//        HashMap<Character,Integer>  map=new HashMap<>();
//
//        for(char ch:s.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        while(map.size()>0){
//            int currentMax=0;
//            char max=0;
//
//            for(Map.Entry<Character,Integer> it:map.entrySet()){
//                if(it.getValue()> currentMax){
//                    max=it.getKey();
//                    currentMax=it.getValue();
//
//                    System.out.println("max is ================"+max);
//                    System.out.println("currentMax is ================"+currentMax);
//
//                }
//            }
//
//            while(currentMax--!=0) sb.append(max);
//            map.remove(max);
//
//        }
//        return sb.toString();
//    }

    public String frequencySort_priorityQueue(String s){
        Map<Character,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            pq.offer(entry);
        }

        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry=pq.poll();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }


        return sb.toString();
    }

    public String frequencySort(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        
        Map<Character,Integer> counts=new HashMap<>();
        for(char c:s.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        
        int maximumFrequency= Collections.max(counts.values());

        List<List<Character>> buckets=new ArrayList<>();
        for(int i=0;i<=maximumFrequency;i++){
            buckets.add(new ArrayList<Character>());
        }

        for(Character key:counts.keySet()){
            int freq=counts.get(key);
            buckets.get(freq).add(key);
        }

        StringBuilder sb=new StringBuilder();
        for(int i=buckets.size()-1;i>=1;i--){
            for(Character c:buckets.get(i)){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }



    public static void main(String args[]){
        String str="tree";

        Test test=new Test();

        System.out.println(test.frequencySort(str));
    }
}
