package com.interview.exercise.exercise3;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

    public int lengthOfLongestSubstring(String s){
        int res=0;
        int left=0;

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }

            map.put(c,i);
            res=Math.max(res,i-left+1);
        }


        return  res;
    }

    public int lengthOfLongestSubstring2(String s){
        if(s==null || s.length()==0) return 0;
        HashSet<Character> set=new HashSet<>(); // HashSet  Set Interface

        int res=0;

        for(int i=0,j=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));
            }else{
                set.add(s.charAt(i));
                res=Math.max(res,set.size());
            }
        }

        return res;
    }

    public static void main(String args[]){
        String str="bbbbb";

        Test test=new Test();
        int result=test.lengthOfLongestSubstring2(str);

        System.out.println(result);

    }
}
