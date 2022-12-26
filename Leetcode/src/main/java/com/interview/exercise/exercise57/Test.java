package com.interview.exercise.exercise57;

import java.util.List;
import java.util.ArrayList;

public class Test {

    public int[][] insert(int[][] intervals,int[] newInterval){
    	List<int[]> result=new ArrayList<>();

    	for(int[] i:intervals){
    		if(newInterval==null || i[1]<newInterval[0]){
    			result.add(i);
    		}else if(i[0]>newInterval[1]){
    			result.add(newInterval);
    			result.add(i);

    			newInterval=null;
    		}else{
    			 newInterval[0] = Math.min(newInterval[0], i[0]);//get min
                 newInterval[1] = Math.max(newInterval[1], i[1]);//get max
    		}
    	}

    	return result.toArray(new int[result.size()][]);
    }

	public static void main(String args[]){
		int[][] intervals=new int[][]{{1,3},{6,9}};
		int[] newsInterval=new int[]{2,5};

		Test test=new Test();
		int[][] result=test.insert(intervals,newsInterval);

		System.out.println("==========");
	}
}
