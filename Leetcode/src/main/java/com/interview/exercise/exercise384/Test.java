package com.interview.exercise.exercise384;

public class Test {

//    public int firstUniqChar(String s){
//        for(int i=0;i<s.length();i++){
//            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
//                return i;
//            }
//        }
//
//        return -1;
//    }

    public int firstUniqChar(String s){
        int[] letter=new int[26];

        for(int i=0;i<s.length();i++){
            letter[s.charAt(i)-'a']++;
        }

        for(int j=0;j<s.length();j++){
            if((letter[s.charAt(j)-'a'])==1){
                return j;
            }
        }

        return -1;
    }
    
    public static void main(String args[]){
        String str="loveleetcode";
        Test test=new Test();

        int result=test.firstUniqChar(str);

        System.out.println("result value is "+ result);

    }
}
