package edu.laicode.exercise121;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public List<Integer> spiral(int[][] input) {
		List<Integer> res = new ArrayList<>();
		if(input==null || input.length==0) {
			return res;
		}
		
		spiralHelper(input, res, 0, input.length);
		return res;
	}
	
	private void spiralHelper(int[][] input, List<Integer> result, int offset, int size) {
		if(size==0) {
			return;
		}
		if(size==1) {
			result.add(input[offset][offset]);
		}
		for(int i=offset; i<offset+size-1; i++) {
			result.add(input[offset][i]);
		}
		for(int i=offset; i<size-1+offset; i++) {
			result.add(input[i][offset+size-1]);
		}
		for(int i=size-1+offset; i>offset; i--) {
			result.add(input[size-1+offset][i]);
		}
		for(int i=size-1+offset; i>offset; i--) {
			result.add(input[i][offset]);
		}
		spiralHelper(input, result, offset+1, size-2);
  	}
	
	public static void main(String[] args) {
		Test ss = new Test();
		int[][] input = {{1,2,3}, {4,5,6}, {7,8,9}};
		List<Integer> result = ss.spiral(input);
		System.out.println(result);
	}

}
