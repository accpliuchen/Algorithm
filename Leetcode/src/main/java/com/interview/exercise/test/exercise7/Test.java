package com.interview.exercise.test.exercise7;

import java.util.Map;
import java.util.HashMap;

public class Test {

	public static void main(String args[]){
		Map<String,String> map=new HashMap<String,String>();

		map.put("A", "Angular");
        map.put("J", "Java");
        map.put("P", "Python");
        map.put("H", "Hibernate");

        for(Map.Entry<String,String> set:map.entrySet()){
        	System.out.println(set.getKey() +" = "+set.getValue());
        }
	}
}
