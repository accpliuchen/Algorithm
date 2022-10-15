package com.interview.exercise.exercise981;


import java.util.TreeMap;

public class Example1 {

	public static void main(String args[]){
		
		//create an empty TreeMap
		TreeMap<Integer,String> numMap=new TreeMap<Integer,String>();

        numMap.put(6, "Six"); 
        numMap.put(1, "One"); 
        numMap.put(5, "Five"); 
        numMap.put(3, "Three"); 
        numMap.put(8, "Eight"); 
        numMap.put(10, "Ten"); 

        System.out.println("TreeMap: "+ numMap.toString());

        System.out.print("Floor Entry of Element 11 is :");
        System.out.println(numMap.floorEntry(11));//print 10  //return less than and equal 11

        System.out.print("Floor Entry of Element 0 is :");
        System.out.println(numMap.floorEntry(0));//print null
	}
}
