package com.interview.exercise.exercise1897;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public boolean makeEqual(String[] words) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(String word:words){
            for(Character c:word.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> iter:map.entrySet()){
            if(iter.getValue()%words.length!=0) return false;
        }

        return true;
    }

    public static void main(String args[]){
//        String[] words = {"abc","aabc","bc"};

        String[] words = {"ab","ab"};

        Test test=new Test();
        boolean result=test.makeEqual(words);
        System.out.println("result value is "+ result);
    }
}

