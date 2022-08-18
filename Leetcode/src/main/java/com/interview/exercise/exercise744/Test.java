package com.interview.exercise.exercise744;

public class Test {

    public char nextGreatestLetter(char[] letters,char target){
    	int a=(int) target;

        int temp=0;
    	for(int i=0;i<letters.length;i++){
    		int b=(int) letters[i];

    		if(a>b){
    			temp=i;
    			break;
    		}
    	}

    	return letters[temp];
    }

	public static void main(String args[]){
       char[] letters=new char[]{'c','f','j'};

       char target='a';

       Test test=new Test();
       char result=test.nextGreatestLetter(letters,target);

       System.out.println("result value is "+ result);
	}
}
