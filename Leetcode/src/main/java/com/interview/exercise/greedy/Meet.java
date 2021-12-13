package com.interview.exercise.greedy;

import java.util.List;
import java.util.ArrayList;

public class Meet {


    public static List<Integer> arrangeActivity(int[] start,int[] end){
        int total=start.length;
        int endFlag=end[0];

        List<Integer> results=new ArrayList<>();
        results.add(0);

        for(int i=0;i<total;i++){
            if(start[i]>endFlag){
                results.add(i);
                endFlag=end[i];
            }
        }
        return results;
    }


    public static void main(String args[]){
        int[] start={1,3,0,5,3,5,6,8,8,2,12};
        int[] end={4,5,6,7,8,9,10,11,12,13,14};

        List<Integer>  result=arrangeActivity(start,end);
        for(int i=0;i<result.size();i++){
            int index=result.get(i);

            System.out.println("start time is "+ start[index]+"  end time is "+ end[index]);
        }
    }
}
