package com.test.interview.hashMap;

import java.util.Map;
import java.util.HashMap;

public class Test {

	public static void main(String args[]){
		Map<String,Integer> employerNumber=new HashMap<>();
		employerNumber.put("yahoo",1);
		System.out.println(employerNumber);

		employerNumber.put("google",2);
		System.out.println(employerNumber);

		Integer yc=employerNumber.get("yahoo");
		yc=employerNumber.put("yahoo",5);

		System.out.println(yc);

	}


	public void queensHelper(int n,int row,List<Integer> solution){
		 if(row==n){
		 	System.out.println(solution.toString());
		 	return;
		 }

		 for(int i=0;i<n;i++){

		 }
	}

	private void isValid(int n,int row,int col){
		return use
	}

	private void mark(int n,int row,int col,boolean toWhat){
		useCols[col]=toWhat;
		useDiagonals[row+col]=towhat;
		useRevDiagonals[col-row+n-1]=toWhat;
	}
}
