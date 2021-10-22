package com.interview.exercise.exercise5;

//https://www.huaweicloud.com/articles/2babdb6f5a4f7443268ad465f6380db3.html
public class Test  {

    public String longestPalindrome(String s){
        int n=s.length();

        String longest=s.substring(0,1);

        if (s == null || s.length() == 0) return null;

        for (int i = 0; i < n; i++) {
            String p1 = expandFromCenter(s, i, i);
            if (p1.length() > longest.length())
                longest = p1;
                String p2 = expandFromCenter(s, i, i + 1);
            if (p2.length() > longest.length())
                longest = p2;

        }
        return longest;
    }

    public String expandFromCenter(String s, int c1, int c2) {
        int head = c1;
        int tail = c2;
        int m = s.length();

        while (head >= 0 && tail < m && s.charAt(head) == s.charAt(tail)) {
            head--;
            tail++;
        }
        return s.substring(head + 1, tail);
    }

    public static  void main(String args[]){
        String str="babad";

        Test test=new Test();
        System.out.println(test.longestPalindrome(str));
    }

}
