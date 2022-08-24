package com.interview.exercise.exercise344.exercise1;

public class Test {

	public void reverseString(char[] s) {
		int left=0;
		int right=s.length-1;

		while(left<right){
			char temp=s[left];
			s[left]=s[right];
			s[right]=temp;

			left++;
			right--;
		}

	}
    
	public static void main(String args[]){
		char[] chars=new char[]{'h','e','l','l','o'};

		Test test=new Test();

		test.reverseString(chars);

		System.out.println("===");
	}
}
