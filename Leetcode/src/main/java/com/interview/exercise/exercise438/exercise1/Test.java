package com.interview.exercise.exercise438.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Test {

        public List<Integer> allAnagrams(String sh, String lo) {
            // Write your solution here
            int longSize=lo.length();
            int shortSize=sh.length();

            if(longSize<shortSize){
                return new ArrayList();
            }

            Map<Character,Integer> countMap=new HashMap();
            Map<Character,Integer> longCountMap=new HashMap();

            for(char ch:sh.toCharArray()){
                if(countMap.containsKey(ch)){
                    countMap.put(ch, countMap.get(ch) + 1);
                }else{
                    countMap.put(ch, 1);
                }
            }

            List<Integer> result=new ArrayList<>();

            for(int i=0;i<longSize;++i){
                char ch=lo.charAt(i);

                if(longCountMap.containsKey(ch)){
                    longCountMap.put(ch, longCountMap.get(ch) + 1);
                }else{
                    longCountMap.put(ch,1);
                }

                if(i>=shortSize){
                    ch=lo.charAt(i-shortSize);

                    if(longCountMap.get(ch)==1){
                        longCountMap.remove(ch);
                    }else{
                        longCountMap.put(ch,longCountMap.get(ch)-1);
                    }
                }

                if(countMap.equals(longCountMap)){
                    result.add(i-shortSize+1);
                }
            }
            return result;
        }


    public static void main(String[] args) {
        String lo = "ab";
        String sh = "abcbac";

        Test test = new Test();

        List<Integer> result = test.allAnagrams("ab", "abcbac");

        for (Integer items : result) {
            System.out.println(items);
        }

    }

}
