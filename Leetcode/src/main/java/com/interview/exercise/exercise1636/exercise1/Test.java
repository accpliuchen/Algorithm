package com.interview.exercise.exercise1636.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class A{
	int a;

	public A(int a){
		this.a=a;
	}

	@Override
	public String toString(){
		return "[a="+a+"]";
	}
}

class MyComparator implements Comparator<A>{
	@Override
	public int compare(A o1,A o2){
		return o2.a-o1.a;
	}
}

public class Test {

	public static void main(String[] args){
		A a1=new A(5);
		A a2=new A(7);

		List<A> list=new ArrayList<A>();
		list.add(a1);
		list.add(a2);

		Collections.sort(list,new MyComparator());
		System.out.println(list);
	}
}
