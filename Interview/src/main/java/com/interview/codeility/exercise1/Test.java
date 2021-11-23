package com.interview.codeility.exercise1;

public class Test {

    public int solution(String A, String B) {
        int count[] = new int[26];
        int ans = 0;

        for(int i = 0; i < A.length(); ++i) {
            count[A.charAt(i) - 'a']++;
        }
        for(int i = 0; i < B.length(); ++i) {
            count[B.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; ++i) {
            ans += java.lang.Math.abs(count[i]);
        }
        return ans;
    }

    public static void main(String args[]){

    }

}
