package com.interview.exercise.exercise2109;

public class Test {

	public String addSpaces(String s,int[] spaces){
        char[] charArrays=s.toCharArray();

		StringBuilder sb=new StringBuilder();

        int count=s.length();
        int array=spaces.length;

        for(int i=0,j=0;i<count;i++){
        	if(j<array && i== spaces[j]){
        		sb.append(" ");
        		j++;
        	}
        	sb.append(charArrays[i]);
        }

		return sb.toString();
	}

	public static void main(String args[]){
		String str="LeetcodeHelpsMeLearn";
		int[] array=new int[]{8,13,15};

		Test test=new Test();

		String result=test.addSpaces(str,array);

		System.out.println("result value is "+ result);
	}
}
