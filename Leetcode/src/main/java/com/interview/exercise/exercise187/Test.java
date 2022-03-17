package com.interview.exercise.exercise187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hp=new HashMap<>();
        // hashmap to contains all substring of 10 length and frequency map
        for(int i=0;i+10<=s.length();i++){
            String temp=s.substring(i,i+10);
            hp.put(temp,hp.getOrDefault(temp,0)+1);
        }

        List<String> ans=new ArrayList<>();
        for(String ss:hp.keySet()){
            if(hp.get(ss)>1) ans.add(ss);
        }
        // traverse in map and string with greater freq can be stored
        return ans;
    }

    public static void main(String[] args) {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Test test=new Test();
        List<String> result=test.findRepeatedDnaSequences(str);

        System.out.println(result.size());
    }
}
