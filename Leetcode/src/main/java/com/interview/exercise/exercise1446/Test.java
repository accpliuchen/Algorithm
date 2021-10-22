package com.interview.exercise.exercise1446;

import java.util.HashMap;

public class Test {

    public static void main(String args[]){
        String str="leetcode";

        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
               int value=map.get(str.charAt(i));
               map.put(str.charAt(i),++value);
            }else{
                map.put(str.charAt(i),0);
            }
        }

        System.out.println("map size is "+ map.size());
    }
}
