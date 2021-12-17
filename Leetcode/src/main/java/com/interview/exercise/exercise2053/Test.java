package com.interview.exercise.exercise2053;

import java.util.*;
import java.util.Set;

public class Test {

    public String kthDistinct(String[] arr, int k) {
        int count=0;
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
              if(map.containsKey(arr[i])){
                  map.put(arr[i],map.get(arr[i])+1);
              }else{
                  map.put(arr[i],1);
              }
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                if(count==k-1)
                    return arr[i];
                count++;
            }
        }

        return "";

    }

    public static void main(String args[]){
        String[] str=new String[]{"d","b","c","b","c","a"};

        Test test=new Test();

        System.out.println(test.kthDistinct(str,2));
    }
}
