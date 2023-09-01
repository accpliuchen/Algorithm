package com.interview.exercise.exercise692;

import java.util.*;

public class Test {

    public List<String> topKFrequent(String[] words,int k){
        //O(n)
        Map<String,Integer> hashMap=buildMap(words);

        PriorityQueue<Map.Entry<String,Integer>> minHeap=new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue()==o2.getValue()){
                    return o2.getKey().compareTo(o1.getKey());
                }else{
                    return Integer.compare(o1.getValue(),o2.getValue());
                }
            }
        });

        System.out.println(minHeap);

        ////O(N)+O(Nlogk)+O(klogk)=O(Nlogk)
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            minHeap.offer(entry);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        System.out.println("After");

        System.out.println(minHeap);


        return toList(minHeap);
    }

    //O(klogk)
    private List<String> toList(PriorityQueue<Map.Entry<String,Integer>> minHeap){
        String[] result=new String[minHeap.size()];

        int size=minHeap.size()-1;

        for(int i=size;i>=0;i--){
            result[i]=minHeap.poll().getKey();
        }

        return Arrays.asList(result);
    }

    //TC O(n)
    private Map<String,Integer> buildMap(String[] words){
        Map<String,Integer> hashMap=new HashMap<>();

        for(String word:words){
            hashMap.put(word,hashMap.getOrDefault(word,0)+1);
        }
        return hashMap;
    }
    public static void main(String args[]){
        String[] words = new String[]{"i","love","leetcode","i","love","coding"};
        int k = 2;

        Test test=new Test();

        List<String> result=test.topKFrequent(words,k);

        result.forEach(System.out::println);
    }
}
