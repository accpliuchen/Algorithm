package com.interview.exercise.exercise205.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Test {

    private String transformString(String s){
        Map<Character,Integer> indexMapping=new HashMap<>();
        StringBuilder builder=new StringBuilder();

        for(int i=0;i<s.length();++i){
            char c1=s.charAt(i);

            if(!indexMapping.containsKey(c1)){
                indexMapping.put(c1,i);
            }

            builder.append(Integer.toString(indexMapping.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isIsomorphic(String s,String t){
        return transformString(s).equals(transformString(t));
    }

    public static void main(String args[]){
        //String s = "egg", t = "add";

        String s = "foo", t = "bar";

        Test test=new Test();
        boolean result=test.isIsomorphic(s,t);

        System.out.println("result value is "+ result);
    }
}
