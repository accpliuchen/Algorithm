package com.interview.exercise.exercise49;

import java.util.*;
import java.util.stream.Collectors;

public class Test {


    public List<List<String>> groupAnagrams(String[] strs){
        if(strs.length==0) return new ArrayList();
        
        Map<String,List> map=new HashMap<>();
        int[] count=new int[26];

        for(String str:strs){
            Arrays.fill(count,0);

            for(char ch:str.toCharArray()){
                count[ch-'a']++;
            }

            StringBuilder sb=new StringBuilder();

            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }

            String key=sb.toString();

            if(!map.containsKey(key))
                map.put(key,new ArrayList());
//            }else{
//                map.get(key).add(str);
//            }
                map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }

    public static void main(String args[]){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Test test=new Test();

        List<List<String>> result=test.groupAnagrams(strs);

        List<String> flatList = result.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);

    }
}
