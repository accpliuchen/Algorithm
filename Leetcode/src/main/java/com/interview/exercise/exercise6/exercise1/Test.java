package com.interview.exercise.exercise6.exercise1;

public class Test {

	public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
 
    }

	public static void main(String args[]){
		String str="PAYPALISHIRING";
		int numRows=3;


		Test test =new Test();
		String result=test.convert(str,numRows);

		System.out.println("result value is "+ result);
	}
}
