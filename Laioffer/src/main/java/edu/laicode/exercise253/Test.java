package edu.laicode.exercise253;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;
import java.util.HashSet;

public class Test {

    // public int longest(String input){
    //    int maxCnt=0;

    //    if(input==null || input.length()==0){
    //    	 return maxCnt;
    //    }

    //    Map<Character,Integer> hm=new HashMap<>();
    //    int start=0;


    //    for(int i=0;i<input.length();i++){
    //    	 char ch=input.charAt(i);

    //    	 if(hm.containsKey(ch)){
    //    	 	maxCnt=Math.max(maxCnt,i-start);
    //    	 	start=Math.max(start,hm.get(ch)+1);
    //    	 }

    //    	 hm.put(ch,i);
    //    }


    //    maxCnt=Math.max(maxCnt,input.length()-start);

    //    return maxCnt;

    // }

    public int longest(String input){
    	int maxCnt=0;

    	if(input==null || input.length()==0){
    		return maxCnt;
    	}

        int fast=0;
        int slow=0;

        Set<Character> set=new HashSet<>();

        while(fast<input.length()){
        	char chF=input.charAt(fast);

        	if(set.contains(chF)){
        		char chS=input.charAt(slow);

        		set.remove(chS);
        	    slow++;
        	}else{
        		set.add(chF);
        		maxCnt=Math.max(maxCnt,set.size());
        		fast++;
        	}
        }

        return maxCnt;

    }

   
	public static void main(String args[]){
		String str="pwwkew";  //abcabcbb 3 //bbbbb 1 // pwwkew 3
        
        Test test=new Test();

        int result=test.longest(str);

        System.out.println("result value is "+ result);
	}
}
