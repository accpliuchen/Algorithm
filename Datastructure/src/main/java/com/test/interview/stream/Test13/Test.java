package com.test.interview.stream.Test13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test {

	private static void q3(){
		List<Integer> numbers1=Arrays.asList(1,2,3);
		List<Integer> numbers2=Arrays.asList(3,4);

		List<int[]> pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));
	}

    public static void main(String args[]){
    	q3();
    }
}
