package com.interview.exercise.exercise2108;

public class Test {


	public String firstPalindrome(String[] words){

	     for(String word:words){
	     	if(!isPalindrome(word)){
	     		continue;
	     	}else{
	     		return word;
	     	}
	     }
	     return "";

	}
     
    private boolean isPalindrome(String word){
    	int count=word.length()-1;

    	for(int i=0;i<count;i++){
    		if(word.charAt(i)!= word.charAt(count-i)){
    			return false;
    		}
    	}
    	return true;
    } 

	public static void main(String args[]){
		String[] words=new String[]{"abc","car","ada","racecar","cool"};

		Test test=new Test();

		String result=test.firstPalindrome(words);

		System.out.println("result value is "+ result);
	}
}
