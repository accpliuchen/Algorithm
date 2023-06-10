package com.test.interview.stream.Test7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String args[]){
		List<String> list = Arrays.asList("I am a boy", "I love the girl", "But the girl loves another girl");

        list.stream()
                .map(word -> word.split(" "))   // Stream<String>
                .flatMap(Stream::of)
                .distinct()
                .collect(Collectors.toList()).forEach(n->System.out.println(n));
	}
}
