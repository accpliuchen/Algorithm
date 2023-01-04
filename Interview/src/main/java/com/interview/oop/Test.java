package com.interview.oop;

public class Test {


	public static void main(String args[]){
		JavaTester s=new JavaTester();
		s.run(5);
	}
}

class JavaTester{
	static int x=11;
	private int y=33;

	public void run(int x){
       JavaTester t=new JavaTester();
       this.x=22;
       y=44;

       System.out.println("x: "+x); //5
       System.out.println("JavaTester.x: "+JavaTester.x); //22

       System.out.println("t.x: "+t.x);//22
       System.out.println("t.y: "+t.y);//33
	}
}
