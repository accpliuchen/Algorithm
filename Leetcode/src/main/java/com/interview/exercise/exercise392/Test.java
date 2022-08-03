package com.interview.exercise.exercise392;

public class Test {

	public boolean isSubsequence(String s,String t){
		if(s.length()==0) return true;
		if(t.length()==0) return false;

		int letter=0;
   
	    //ahbgdc	t
	    //abc       s
	    
		for(int i=0;i<t.length();i++){
		   if(s.charAt(letter)==t.charAt(i)){
		   	letter++;
		   	if(letter>=s.length()) return true;
		   } 
		}
        return false;
	}


	public static void main(String args[]){
		String s = "abc", t = "ahbgdc";

		Test test=new Test();
		boolean result=test.isSubsequence(s,t);

		System.out.println("result value is "+ result);
	}
}
