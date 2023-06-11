package com.test.interview.stream.Test11;

import lombok.AllArgsConstructor;

import java.util.stream.Stream;

public class Test {

	@AllArgsConstructor
	static class Tuple{
		int first;
		int second;
	}

	public static void main(String args[]){
		Stream.iterate(new Tuple(0,1),tuple->new Tuple(tuple.second,tuple.first+tuple.second)).limit(20).forEach(tuple->System.out.println("("+ tuple.first +","+ tuple.second +")"));
	}
}
