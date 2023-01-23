package com.interview.exercise.exercise50;

public class Test {

	public int myPow(int x, int n) {
		if(n==0)
			return 1;
		int half=myPow(x,n/2);
		if(n%2==0)
			return half*half;
		else if(n>0)
			return half*half*x;
		else
			return half*half/x;
	}

	public static void main(String args[]){
		Test test=new Test();

		int result=test.myPow(2,1);

		System.out.println("result value is "+ result);	
	}
}
