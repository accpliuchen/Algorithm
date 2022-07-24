package com.interview.exercise.exercise139.exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Test {


    public boolean wordBreak(String s,List<String> wordDict){
    	Set<String> set=toSet(wordDict);


    	boolean[] wordsBreak=new boolean[s.length()+1];
    	wordsBreak[0]=true;

    	for(int i=1;i<wordsBreak.length;i++){
    		for(int j=0;j<i;j++){
    			System.out.println(s.substring(j,i));
    			System.out.println("j number is "+j);
    			if(set.contains(s.substring(j,i)) && wordsBreak[j]){
    				wordsBreak[i]=true;
    				break;
    			}
    		}

			System.out.println();
    	}
    	return wordsBreak[wordsBreak.length-1];
    }

	private Set<String> toSet(List<String> wordDict){
		Set<String> set=new HashSet<>();

		for(String str:wordDict){
			set.add(str);
		}
		return set;
	}

    
	public static void main(String arg[]){
       List<String> wordList=new ArrayList<>();
       
       wordList.add("leet");
       wordList.add("code");

       String str="leetcode";

       Test test=new Test();
       boolean result=test.wordBreak(str,wordList);

       System.out.println("result value is "+ result);

	}
}
