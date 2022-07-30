package edu.laicode.exercise66;

import java.util.List;
import java.util.ArrayList;

//https://app.laicode.io/app/problem/66
public class Test {

    public List<String> validParentheses(int n){
         List<String> result=new ArrayList<>();

         StringBuilder sb=new StringBuilder();
         helper(n,0,0,sb,result);

         return result;
    } 

    private void helper(int n,int left,int right,StringBuilder sb,List<String> result){
    	if(left==n && right==n){
    		result.add(sb.toString());
    		return;
    	}

    	if(left<n){
    		sb.append('(');
    		helper(n,left+1,right,sb,result);
    		sb.deleteCharAt(sb.length()-1);
    	}

    	if(right<left){
    		sb.append(')');
    		helper(n,left,right+1,sb,result);
    		sb.deleteCharAt(sb.length()-1);
    	}
    }

	public static void main(String args[]){
		int n=1;

		Test test=new Test();

		List<String> result=test.validParentheses(n);

		for(String str:result){
			System.out.print(str);
		}
	}
}
