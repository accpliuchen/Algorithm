package com.interview.exercise.exercise1860;

//https://leetcode.com/problems/incremental-memory-leak/
public class Test {


    public int[] memLeak(int memory1,int memory2){

        int time=1;
        while(memory1 >= time || memory2 >= time){
            if(memory1>=memory2){
                memory1-=time;
            }else{
                memory2-=time;
            }
            time++;
        }
        return new int[]{time,memory1,memory2};
    }

    public static  void main(String args[]){
        Test test=new Test();
        int[] array=test.memLeak(2,2);

        System.out.println(array.toString());
    }
}
