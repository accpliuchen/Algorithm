package com.interview.exercise.exercise884;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();
        String[] first = s1.split(" ");
        String[] second = s2.split(" ");

        for(String s : first) map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s : second) map.put(s, map.getOrDefault(s, 0) + 1);

        List<String> res = new ArrayList<>();

        for(String s : map.keySet())
            if(map.get(s) == 1) res.add(s);

        return res.toArray(new String[1]);
    }

    public static void main(String args[]){
        String s1 = "this apple is sweet", s2 = "this apple is sour";

        Test test=new Test();
        System.out.println(test.uncommonFromSentences(s1,s2));
    }
}
