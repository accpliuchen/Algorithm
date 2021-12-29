package com.interview.exercise.exercise819;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Test {

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph= paragraph.toLowerCase();
        String[] words=paragraph.split("\\W?\\s\\W?|\\W$|\\W");

        Map<String,Integer> map=new HashMap<>();
        Set<String> bannedSet= new HashSet<>(Arrays.asList(banned));

        String result="";
        int max=0;
        for(String word:words){
            if(!bannedSet.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);

                if(map.get(word)>max){
                    max=map.get(word);
                    result=word;
                }
            }
        }

        return  result;

    }

    public static void main(String args[]){
//        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
//
//        String[] banned =new String[] {"hit"};

        String paragraph = "a.";

        String[] banned =new String[] {""};

        Test test=new Test();

        System.out.println(test.mostCommonWord(paragraph,banned));

    }
}
