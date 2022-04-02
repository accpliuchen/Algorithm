package com.interview.exercise.exercise1160;

public class Test {

    public int countCharacters(String[] words, String chars) {
        int result=0;


        for(int i=0;i<words.length;i++){
            if(containsWord(words[i],chars)){
                result+=words[i].length();
            }
        }

        return result;
    }

    public boolean containsWord(String s1,String s2){
        int[] count=new int[26];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }


        for(int i=0;i<s2.length();i++){
            count[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"hello","world","leetcode"};
        String chars = "welldonehoneyr";

        Test test=new Test();
        int result=test.countCharacters(words,chars);

        System.out.println("result value is "+ result);

    }
}
