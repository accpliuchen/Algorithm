package com.interview.exercise;

import java.io.IOException;
import java.util.*;

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

    class Main extends  Exception{
        String i1;
        Main(String i2){
            i1=i2;
        }
        public String toString(){
            return ("My Exception defineds:"+i1);
        }
    }


    private static int getAns(int[] arr,int currentIndex,int target,int[][] dp){
        if(target==0) return 0;
        if(currentIndex==arr.length) return -1;
        if(arr[currentIndex]==0) return getAns(arr,currentIndex+1,target,dp);
        if(dp[target][currentIndex]!=-2) return dp[target][currentIndex];

        int ans=Integer.MAX_VALUE;
        int currentCount=0;

        while(currentCount*arr[currentIndex]<=target){
            int leftCount=getAns(arr,currentIndex+1,target-currentCount*arr[currentIndex],dp);

            if(leftCount!=-1){
                ans=Math.min(ans,leftCount+currentCount);
                System.out.println(ans);
            }
            currentCount++;
        }

        if(ans==Integer.MAX_VALUE) return dp[target][currentIndex]=-1;
        return dp[target][currentIndex]=ans;
    }

    public static int getMinCount(int[] arr,int k){
        int[][] dp=new int[k+1][arr.length+1];
        int s=dp.length;
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-2);
        }
//        System.out.println(arr.length);
//        System.out.println(dp.length);

        
        int ans=getAns(arr,0,k,dp);
        return ans;
    }

    public static void main(String[] args) {


        Test test=new Test();

//        int[] array=new int[]{1,14,30,17};
//        int result=test.getMinCount(array,68);

        int[] array=new int[]{1,5,12};
        int result=test.getMinCount(array,13);

        //System.out.println(result);

////        String result=test.reverseWrods("uevndvd");
//        String result=test.reverseWords(3,"You are having fun coding Java today");
//
//

//        ArrayList<String> strings=new ArrayList<String>();
//        strings.add("aAaA");
//        strings.add("AaA");
//        strings.add("aAa");
//        strings.add("AAaa");
//
//        Collections.sort(strings);
//        for(String s:strings){
//            System.out.println(s);
//        




    }
}
