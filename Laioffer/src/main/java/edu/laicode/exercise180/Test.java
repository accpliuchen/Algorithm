package edu.laicode.exercise180;

import java.util.Set;
import java.util.HashSet;

public class Test {

	public boolean existSum(int[] array,int target){
       Set<Integer> set=new HashSet<Integer>();

       for(int num:array){
       	if(set.contains(target-num)){
       		return true;
       	}
       	set.add(num);
       }

       return false;
	}

	public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4};
		int target=5;

        Test test=new Test();
        boolean result=test.existSum(array,target);

        System.out.println("result value is "+ result);
	}
}
