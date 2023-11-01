package com.interview.exercise.exercise383;

import java.util.Map;
import java.util.HashMap;

public class Test {

    private Map<Character,Integer> makeCountsMap(String str){
        Map<Character,Integer> counts=new HashMap<>();

        for(char c: str.toCharArray()){
            int currentCount=counts.getOrDefault(c,0);
            counts.put(c,currentCount+1);
        }
        return counts;
    }

    public boolean canConstruct(String ransomNote,String magazine){
        if(ransomNote.length()> magazine.length()){
            return false;
        }

        Map<Character,Integer> magazineCounts=makeCountsMap(magazine);

        for(char c:ransomNote.toCharArray()){
            int countInMagazine=magazineCounts.getOrDefault(c,0);

            if(countInMagazine==0){
                return false;
            }
            magazineCounts.put(c,countInMagazine-1);
        }
        return true;
    }

    public static void main(String args[]){
        String ransomNote = "aa", magazine = "aab";

        Test test=new Test();
        boolean result=test.canConstruct(ransomNote,magazine);

        System.out.println(result);
    }
}
