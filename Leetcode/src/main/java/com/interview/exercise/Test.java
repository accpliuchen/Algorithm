package com.interview.exercise;

/**
 Input: a string and an integer N

 given a string, extract a new string with every Nth character from each word in the string, in the reversed order, and then form words with N length

 example input: N = 3, "You are having fun coding Java today"

 extracted characters: "uevndvd"  reverse into -->  "dvdnveu"

 expected output: "dvd nve u"

 "I am having fun coding Java today"
 "vndvd"
 */

public class Test {

//    public String reverseWrods(String str){
//      String[] strArray=str.split(" ");
//      StringBuilder sb=new StringBuilder();
//
//      for(int i=0;i<strArray.length;i++){
//          char[] res=strArray[i].toCharArray();
//          int start=0;
//          int end=res.length-1;
//
//          while(start<end){
//             char temp=res[start];
//             res[start++]=res[end];
//             res[end--]=temp;
//          }
//          sb.append(res);
//          if(i< strArray.length-1){
//              sb.append(" ");
//          }
//      }
//
//      return sb.toString();
//    }

    public String reverseWords(int n,String str){
        String[] words=str.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=0;i< words.length;i++){
            sb.append(words[i].substring(n-1,n));
        }

        StringBuilder reverse=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);
            reverse.append(String.valueOf(ch));
        }

        StringBuilder result=new StringBuilder();
        int count=0;
        for(int i=0;i<reverse.length();i++){
            result.append(String.valueOf(reverse.charAt(i)));
            count++;
           if(count==n){
               result.append(" ");
               count=0;
           }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        Test test=new Test();
//        String result=test.reverseWrods("uevndvd");
        String result=test.reverseWords(3,"You are having fun coding Java today");

        System.out.println(result);
    }
}
