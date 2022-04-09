package com.interview.exercise.exercise895;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

class FreqStack{

    HashMap<Integer,Integer> freq;
    HashMap<Integer,Stack<Integer>> map;
    int max;

    public FreqStack() {
        freq=new HashMap<>();
        map=new HashMap<>();
        max=0;
    }

    public void push(int val) {
        int f=freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        max=Math.max(max,f);
        if(!map.containsKey(f)){
            map.put(f,new Stack<Integer>());
        }
        map.get(f).push(val);
    }

    public int pop() {
        int x=map.get(max).pop();
        freq.put(x,max-1);
        if(map.get(max).size()==0){
            max--;
        }
        return x;
    }
}


public class Test {
    public static void main(String args[]){
        FreqStack freqStack = new FreqStack();
        freqStack.push(5); // The stack is [5]
        freqStack.push(7); // The stack is [5,7]
        freqStack.push(5); // The stack is [5,7,5]
        freqStack.push(7); // The stack is [5,7,5,7]
        freqStack.push(4); // The stack is [5,7,5,7,4]
        freqStack.push(5); // The stack is [5,7,5,7,4,5]
        freqStack.pop();   // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
        freqStack.pop();   // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes [5,7,5,4].
        freqStack.pop();   // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
        freqStack.pop();   // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top. The stack becomes [5,7].
    }
}
