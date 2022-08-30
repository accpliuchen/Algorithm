package com.interview.exercise.exercise539;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public int findMinDifference(List<String> timePoints) {
        boolean[] mark=new boolean[24*60];
        
        for(String time:timePoints){
            String[] t=time.split(":");
            
            int h=Integer.parseInt(t[0]);
            int m=Integer.parseInt(t[1]);
            
            if(mark[h*60+m]) return 0;
            
            mark[h*60+m]=true;
        }
        
        int prev=0;
        int min=Integer.MAX_VALUE;
        
        int first=Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;
        
        for(int i=0;i<24*60;i++){
            if(mark[i]){
                 if(first!=Integer.MAX_VALUE){
                     min=Math.min(min,i-prev);
                 }else{
                     first=Math.min(first,i);
                 }
                
                last=Math.max(last,i);
                prev=i;
            }
        }
        
        min=Math.min(min,(24*60-last+first));
        return min;
    }

	public static void main(String args[]){
		List<String> timePoints=new ArrayList();
		timePoints.add("23:59");
		timePoints.add("00:00");

		Test test=new Test();

		int result=test.findMinDifference(timePoints);

		System.out.println("result value is "+ result);
	}
}
