package edu.laicode.exercise640;

import java.util.List;
import java.util.ArrayList;

public class Test {

    public List<String> subSetsOfSizeK(String set,int k){
    	List<String> result=new ArrayList<String>();

    	if(set==null){
    		return result;
    	}

    	char[] arraySet=set.toCharArray();
    	StringBuilder sb=new StringBuilder();
    	helper(arraySet,k,sb,0,result);

    	return result;
    }

    private void helper(char[] set,int k,StringBuilder sb,int index,List<String> result){
    	if(sb.length()==k){
    		result.add(sb.toString());
    		return;
    	}

    	if(index==set.length){
    		return;
    	}

    	helper(set,k,sb,index+1,result);
		helper(set,k,sb.append(set[index]),index+1,result);

    	sb.deleteCharAt(sb.length()-1);
    }

	public static void main(String args[]){
		String str="abc";
		int k=2;

		Test test=new Test();

		List<String> result=test.subSetsOfSizeK(str,k);

		for(String st:result){
			System.out.println(st);
		}
	}
}
