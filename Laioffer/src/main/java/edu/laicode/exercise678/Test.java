package edu.laicode.exercise678;

import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

public class Test {

    public int[] nextGreaterElement(int[] partial, int[] all) {
        
    	Map<Integer,Integer> resultMap=new HashMap<>();
    	Deque<Integer> monoStack=new ArrayDeque<>();
    	int[] result=new int[partial.length];

        for(int i=0;i<all.length;i++){
        	while(!monoStack.isEmpty() && monoStack.peekLast()<all[i]){
        		resultMap.put(monoStack.pollLast(),all[i]);
        	}

        	monoStack.offerLast(all[i]);
        }

        for(int i=0;i<partial.length;i++){
        	result[i]=resultMap.getOrDefault(partial[i],-1);
        }

        return result;
    }
    
    
	public static void main(String args[]){
		int[] all = new int[]{3,4,1,2};
		int[] partial = new int[]{4,1,2};

		Test test=new Test();

		int[] result=test.nextGreaterElement(partial,all);

		for(int res:result){
			System.out.println(res);
		}
	}
}
