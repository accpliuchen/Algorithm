package com.interview.exercise.exercise1636.exercise2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

class Element{
	int value;
	int frequency;

	public Element(int value,int frequency){
		this.value=value;
		this.frequency=frequency;
	}
}

class ElementComparator implements Comparator<Element>{

	@Override
	public int compare(Element e1,Element e2){
		if(e1.frequency==e2.frequency){
			return e2.value-e1.value;
		}else{
			return e1.frequency-e2.frequency;
		}
	}
}

public class Test {

    public int[] frequencySort(int[] nums){
    	PriorityQueue<Element> minHeap=new PriorityQueue<>(new ElementComparator());

    	Map<Integer,Integer> freqMap=new HashMap<>();

        for(int num:nums){
        	freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
        	// System.out.println("key value is "+entry.getKey());
        	// System.out.println("value is "+entry.getValue());
        	minHeap.offer(new Element(entry.getKey(),entry.getValue()));
        }

        int[] answer=new int[nums.length];
        int j=0;

        while(!minHeap.isEmpty()){
        	Element element=minHeap.poll();
        	int i=element.frequency;
        	while(i>0){
        		answer[j++]=element.value;
        		i--;
        	}
        }

        return answer;
    }

	public static void main(String args[]){
        int[] array=new int[]{1,1,2,2,2,3};


        //System.out.println(2%1000);
        Test test=new Test();
		int[] result=test.frequencySort(array);

		for(int nums:result) {
			System.out.println("Result value is: " +nums);
		}

    }
}
