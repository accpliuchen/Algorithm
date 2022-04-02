package com.interview.snowflake.exercise3;

import java.util.Stack;

public class Test {

    private static String getWordCompression(String word, int k) {
        char[] cArr = word.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<cArr.length;i++) {
            char c = cArr[i];
            Stack<Character> stk = new Stack<>();
            if(stack.size() < k - 1) {
                stack.push(c);
                continue;
            }else {
                for(int j=0;j<k - 1;j++) {
                    char popC = stack.pop();
                    stk.push(popC);
                    if(popC != c) {
                        while(!stk.isEmpty())
                            stack.add(stk.pop());
                        stack.add(c);
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abbcccb";
        String word2 = "aba";
        String word3 = "baac";
        int k1 = 3, k2 = 2, k3 = 2;
        System.out.println(getWordCompression(word1, k1));
        System.out.println(getWordCompression(word2, k2));
        System.out.println(getWordCompression(word3, k3));
    }
}
