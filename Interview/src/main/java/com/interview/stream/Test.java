package com.interview.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Test {
	public static void main(String args[]){
		List<String> list = Arrays.asList("a1", "a2", "b1", "c1", "c2");
		
		list.stream()
        .filter(s->s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

        IntStream intStream =IntStream.range(1,10);
        intStream.forEach(System.out::println);


		Stream.iterate(3, i -> i * 2).limit(5).forEach(System.out::println);


		List<String> result=Arrays.asList("abc1","abc2");
		result.stream()
		.map(element->element.substring(0,3))
		.forEach(System.out::println);


		Optional<Integer> result1 = Stream.of(1, 2, 3, 4).reduce(Integer::sum); //使用方法引用
		Integer result2 = Stream.of(1, 2, 3, 4).reduce(10, (x, y) -> x + y); //lambda表达式
		System.out.println("result1: " + result1.get());
		System.out.println("result2: " + result2);

		// List<User> users = Arrays.asList(new User("pj", 22), new User("pjmike", 21));
		// //对所有 User 的年龄求和
		// Integer ageSum = users.stream().reduce(0, (integer, user) -> integer + user.getAge(), Integer::sum);
		// System.out.println("the sum of ages: " + ageSum);


	}
}
