package edu.laicode.exercise181;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Test {

	public List<List<Integer>> allPairs(int[] array, int target) {
	    List<List<Integer>> result = new ArrayList<>();
	    Map<Integer, List<Integer>> hm = new HashMap<>();

	    for (int i = 0; i < array.length; ++i) {
	      if (hm.containsKey(target - array[i])) {
	        for (Integer index : hm.get(target - array[i])) {
	          result.add(Arrays.asList(i, index));
	        }
	      }

	      if (hm.get(array[i]) == null) {
	        List<Integer> temp = new ArrayList<>();
	        temp.add(i);
	        hm.put(array[i], temp);
	      }
	      else {
	        hm.get(array[i]).add(i);
	      }
	    }

	    return result;
	  }

	public static void main(String args[]){
		int[] array=new int[]{1,3,2,4};
        int target=5;

        Test test=new Test();
        List<List<Integer>> result=test.allPairs(array,target);


	   for(List list:result){
	      for(Object listint:list){
	     	System.out.print(listint);
	      }
	   }
          
	}
}
