package com.interview.exercise.exercise290;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public boolean wordPattern(String pattern,String s){
        Map map_index=new HashMap();
        String[] words=s.split(" ");

        if(words.length!=pattern.length()){
            return false;
        }

        for(Integer i=0;i<words.length;i++){
            char c=pattern.charAt(i);
            String w=words[i];

            if(!map_index.containsKey(c)){
                map_index.put(c,i);
            }

            if(!map_index.containsKey(w)){
                map_index.put(w,i);
            }

            if(map_index.get(c)!=map_index.get(w)){
                return false;
            }

        }
        
        
        return true;
    }

    public static void main(String args[]){
        String pattern="abba";
        String  s="dog cat cat dog";

        Test test=new Test();
        boolean result=test.wordPattern(pattern,s);

        System.out.println(result);
    }
}
