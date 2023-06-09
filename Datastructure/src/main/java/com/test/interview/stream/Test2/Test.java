package com.test.interview.stream.Test2;

import java.util.stream.Stream;

public class Test {

	public static void main(String args[]){
		//distinct
		Stream<Integer> numbers=Stream.of(1,2,3,3,2,4);

		numbers.distinct().limit(3).forEach(n->System.out.println(n));
	}
}
