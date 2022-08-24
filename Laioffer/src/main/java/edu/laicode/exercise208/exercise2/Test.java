package edu.laicode.exercise208.exercise2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Test {

    public List<Integer> majority(int[] array,int k){
        HashMap<Integer,Integer> counters=new HashMap<Integer,Integer>();

        List<Integer> result=new ArrayList<Integer>();

        for(Integer num:array){
        	if(!counters.containsKey(num)){
        		counters.put(num,1);
        	}else{
        		counters.put(num,counters.get(num)+1);
        	}

        	if(counters.size()>=k){
        		removeKey(counters);
        	}
        }

        if(counters.size()==0){
        	return result;
        }

        for(Integer num:counters.keySet()){
        	counters.put(num,0);
        }

        for(Integer num:array){
        	if(counters.containsKey(num)){
        		counters.put(num,counters.get(num)+1);
        	}
        }

        for (Integer num : counters.keySet()) {
              if(counters.get(num)>array.length/k){
              	 result.add(num);
              }
        }
    	
    	return result;
    }

    private void removeKey(HashMap<Integer,Integer> counters){
    	Set<Integer> set=counters.keySet();

    	List<Integer> removeList=new ArrayList<>();

    	for(Integer key:set){
    		counters.put(key,counters.get(key)-1);

    		if(counters.get(key)==0){
    			removeList.add(key);
    		}
    	}

    	for(Integer key:removeList){
    		counters.remove(key);
    	}

    }

	public static void main(String args[]){
	    int[] array=new int[]{1,2,1,2,1};
	    int k=3;
	}
}
