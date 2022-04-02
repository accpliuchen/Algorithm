package com.interview.exercise.exercise767;

import java.util.*;

public class Test {

    public String reorganizeString(String s) {
       Integer count=s.length();

       if(s==null || s.length()==0 || count==1)
           return s;

       StringBuilder result=new StringBuilder();
       Map<Character,Integer> map=new HashMap<>();

       for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

       PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
           @Override
           public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
               return o2.getValue()-o1.getValue();
           }
       });
       pq.addAll(map.entrySet());

       Map.Entry<Character,Integer> prev =  new AbstractMap.SimpleEntry<Character,Integer>('#',-1);

       while(!pq.isEmpty()){
           Map.Entry e=pq.poll();
           result.append(e.getKey());


           System.out.println("=========="+ prev.getValue());
           if(prev.getValue()>0){
               pq.add(prev);
           }

           int freq=(int)e.getValue()-1;
           e.setValue(freq);
           prev=e;
       }

       if(result.length()==0)
           return result.toString();
       return "";
    }

    public static void main(String[] args) {
        String str= "aab";

        Test test=new Test();
        String result=test.reorganizeString(str);

        System.out.println("result value is "+result);
    }
}
