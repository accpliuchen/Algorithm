package com.interview.questions.exercise7;

public class Test {

    public int solution(String s) {
        int firstIndex = s.indexOf("b"); // # of a's before first occurence of b
        int lastIndex = s.lastIndexOf("b");
        int strLen = s.length();
        // (strLen - 1 - lastIndex) => # of a's after last occurence of b
        if (firstIndex > 1 && (strLen - 1 - lastIndex) > 1) {
            return 2 + solution(s.substring(0, firstIndex) + s.substring(firstIndex + 1));
        } else if (firstIndex == 0 || firstIndex == 1) {
            return 1 + firstIndex + solution(s.substring(firstIndex + 1));
        } else if (lastIndex >= 0 && (strLen - 1 - lastIndex) == 0 || (strLen - 1 - lastIndex) == 1) {
            return 1 + (strLen - 1 - lastIndex) + solution(s.substring(0, lastIndex));
        }

        return 0;
    }

    public static void main(String[] args) {

        Test test=new Test();
        String str="baaaaa";
        int result=test.solution(str);

        System.out.println("result value is "+ result);

    }
}
