package com.test.interview.comparator;

//https://zhuanlan.zhihu.com/p/54004622

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;


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

		//ascending
		//return o1.a-o2.a;

		//desc
		return o2.a-o1.a;

	}
}

public class ComparatorTest {

	public static void main(String args[]){
		A a1=new A(5);
		A a2=new A(7);

        List<A> list=new ArrayList<A>();
        list.add(a1);
        list.add(a2);


        Collections.sort(list,new MyComparator());
        System.out.println(list);
	}
}
