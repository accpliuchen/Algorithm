package edu.laicode.exercise25;

import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test {

 	public int[] kSmallest(int[] array, int k) {
 		if(array.length==0 || k==0){
 			return new int[k];
 		}	

 		List<Integer> list=new ArrayList<Integer>();

 		for(int e:array){
 			list.add(e);
 		}

 		PriorityQueue<Integer> minHeap=new PriorityQueue<>(list);
 		int[] result=new int[k];

 		for(int i=0;i<k;i++){
 			result[i]=minHeap.poll();
 		}

 		return result;
    }

	public static void main(String args[]){
		int[] array=new int[]{3,4,1,2,5};

		Test test=new Test();

 		int[] arrays=test.kSmallest(array,3);

		for(int arr:arrays){
			System.out.println(arr);
		}

	}
}
