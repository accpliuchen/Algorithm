package com.interview.exercise.exercise387;

import java.util.HashMap;
import java.util.Map;

public class Test {

//    public int firstUniqChar(String s){
//        Map<Character,Integer> map=new HashMap<>();
//
//        for(int i=0;i<s.length();i++){
//            if(map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }else{
//                map.put(s.charAt(i),1);
//            }
//        }
//
//
//        for(int i=0;i<s.length();i++){
//            if(map.get(s.charAt(i))==1)
//                return i;
//        }
//        return -1;
//
//    }

//    public int firstUniqChar(String s){
//       for(int i=0;i<s.length();i++){
//           if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) return i;
//       }
//
//       return -1;
//    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String args[]){
        String str="leetcode";

        //String str="loveleetcode";
        Test test=new Test();
        int result=test.firstUniqChar(str);

        System.out.println("result value is "+ result);
    }
}
