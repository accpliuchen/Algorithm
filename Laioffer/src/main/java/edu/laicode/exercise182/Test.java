package edu.laicode.exercise182;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class Test {

    public List<List<Integer>> allPairs(int[] array,int target){
    	List<List<Integer>> result=new ArrayList<>();
    	Map<Integer,Boolean> hm=new HashMap<>();

    	for(int num:array){
           
           if(hm.containsKey(target-num) && !hm.get(target-num)){
           	  result.add(Arrays.asList(num,target-num));

           	  hm.put(num,true);
           	  hm.put(target-num,true);
           }

           if(hm.get(num)==null){
           	hm.put(num,false);
           }
    	}

    	return result;
    }
    
	public static void main(String args[]){
		int[] array=new int[]{2,1,3,2,4,3,4,2};
		int target=6;

        Test test=new Test();
        List<List<Integer>> result=test.allPairs(array,target);

		for(List list:result){
	      for(Object listint:list){
	     	System.out.print(listint);
	      }
	    }

	}
}
