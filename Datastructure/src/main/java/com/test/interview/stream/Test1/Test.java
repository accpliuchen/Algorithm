package com.test.interview.stream.Test1;

import java.util.stream.Stream;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public static void main(String args[]){
		Stream.of("张三","李四","王二","张四五1").filter(x->x.startsWith("张")).mapToInt(String::length).max().ifPresent(System.out::println);


		System.out.println("===");

		List<String> data=new ArrayList<>();
		data.add("张三");
	    data.add("李四");
	    data.add("王三");
	    data.add("马六");

	    data.stream().filter(x->x.length()==2).map(x->x.replace("三","五")).sorted().filter(x -> x.contains("五")).forEach(System.out::println);


		Stream.of(data).skip(2).forEach(n->System.out.println(n));
		//Stream.of(1,2,3,3,2,4).skip(3).forEach(n->System.out.println(n));

	}
}
