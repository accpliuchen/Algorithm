package com.interview.exercise.exercise205;

import java.util.Map;
import java.util.HashMap;

public class Test {

    public boolean isIsomorphic(String s, String t) {
        Map map=new HashMap<Integer,Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character first = s.charAt(i);
            Character second = t.charAt(i);
            if (map.containsValue(second) && !(map.containsKey(first))) return false; //if two target are same
            if (map.containsKey(first) && !(map.get(first).equals(second))) return false;
            map.put(first, second);
        }
        return true;
    }

    public static void main(String args[]){
        String s = "egg", t = "add";

        Test test=new Test();
        boolean result=test.isIsomorphic(s,t);

        System.out.println("result value is "+ result);
    }
}
