package com.interview.exercise.exercise76;

//https://leetcode.com/problems/minimum-window-substring/
public class Test {

    public String minWindows(String s,String t){
        int[] count = new int[128];

        for(char c:t.toCharArray()){
            count[c]++;
        }

        int from=0;
        int total=t.length();
        int min=Integer.MAX_VALUE;

        for(int i=0,j=0;i<s.length();i++){
            if(count[s.charAt(i)]-->0) total--;
            while(total==0){
                if(i-j+1<min){
                    min=i-j+1;
                    from =j;
                }
              if(++count[s.charAt(j++)]>0) total++;
            }
        }

        return (min==Integer.MAX_VALUE)?"":s.substring(from,from+min);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";

        Test test=new Test();
        String result=test.minWindows(s,t);

        System.out.println("result value is "+ result);
    }
}
