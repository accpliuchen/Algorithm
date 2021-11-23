package com.interview.hackerrank.exercise2;

import java.util.*;

public class Test {

    public static long maxInversions(List<Integer> arr){
        long  inversions_count =0;
        for(int i=0;i< arr.size()-2 ;i++){
            for(int j=i+1;j<arr.size()-1;j++){
                if(arr.get(i)>arr.get(j)){
                    for(int k=j+1;k<arr.size();k++){
                        if(arr.get(j) > arr.get(k)){
                            inversions_count++;
                        }
                    }
                }
            }
        }
        return inversions_count;

    }
}
