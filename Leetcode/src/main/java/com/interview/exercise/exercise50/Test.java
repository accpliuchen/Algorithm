package com.interview.exercise.exercise50;

public class Test {

	public double myPow(double x, int n) {
		if(n==0)
			return 1;
		double half=myPow(x,n/2);
		if(n%2==0)
			return half*half;
		else if(n>0)
			return half*half*x;
		else
			return half*half/x;
	}

	public static void main(String args[]){
		Test test=new Test();

//		double result=test.myPow(2,50);
		double result=test.myPow(2.00000,10);

		System.out.println("result value is "+ result);	
	}
}
