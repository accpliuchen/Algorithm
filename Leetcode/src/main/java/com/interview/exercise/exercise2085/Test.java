package com.interview.exercise.exercise2085;

import java.util.Map;
import java.util.HashMap;

public class Test {


    public int countWords(String[] words1, String[] words2) {
        int count=0;

        Map<String,Integer> wordsOne=new HashMap<>();
        Map<String,Integer> wordsTwo=new HashMap<>();

        for(String words:words1){
            wordsOne.put(words,wordsOne.getOrDefault(words,0)+1);
        }

        for(String words:words2){
            wordsTwo.put(words,wordsTwo.getOrDefault(words,0)+1);
        }

        for(String words:words1){
            if(wordsOne.get(words)==1 && wordsTwo.get(words1)==1)
                count++;
        }

        return count;
    }

    public static void main(String args[]){
//        String[] words1 = {"leetcode","is","amazing","as","is"}, words2 = {"amazing","leetcode","is"};
        String[] words1 = {"a","ab"}, words2 = {"a","a","a","ab"};
        Test test=new Test();

        System.out.println("result value is "+ test.countWords(words1,words2));

    }
}
