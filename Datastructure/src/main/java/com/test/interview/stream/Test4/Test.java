package com.test.interview.stream.Test4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String args[]){

		List<String> list=Arrays.asList("hello","world");
		Stream<String> stream=list.stream();

		stream.forEach(n->System.out.println(n));
	}
}
