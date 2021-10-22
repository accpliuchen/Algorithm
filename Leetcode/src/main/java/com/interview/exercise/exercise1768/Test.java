package com.interview.exercise.exercise1768;

public class Test {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder st= new StringBuilder();
        for(int i=0;i<word1.length();i++){

            for(int j=i;j<=i;j++) {
                st.append(word1.charAt(i));
                if (j == word1.length() - 1 && j < word2.length()) {
                    st.append(word2.substring(j));
                } else if (j < word2.length()) {
                    st.append(word2.charAt(j));
                }

            }

        }
        return st.toString();
    }

    public static void main(String args[]){
        String word1 = "abc", word2 = "pqr";

        Test test=new Test();
        String result=test.mergeAlternately(word1,word2);

        System.out.println(result);
    }
}
