package edu.laicode.exercise617;

import java.util.Map;
import java.util.HashMap;

public class Test {

    public int firstUniqChar(String str){
    	Map<Character,Integer> map=new HashMap<>();

    	for(int i=0;i<str.length();i++){
    	   if(map.containsKey(str.charAt(i))){
    	   	 map.put(str.charAt(i),map.get(str.charAt(i))+1);
    	   }else{
    	   	 map.put(str.charAt(i),1);
    	   }
    	}

    	for(int i=0;i<str.length();i++){
    		if(map.get(str.charAt(i))==1){
    			return i;
    		}
    	}


    	return -1;
    }

	public static void main(String args[]){
		String str="leetcode";

		Test test=new Test();

	}
}
