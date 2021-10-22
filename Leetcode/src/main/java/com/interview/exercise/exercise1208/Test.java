package com.interview.exercise.exercise1208;

import java.util.Map;

//https://blog.csdn.net/qq_15764477/article/details/104261951
public class Test {

    public int equalSubstring(String s,String t,int maxCost){
        int result=0;
        int[] arr=new int[s.length()];

        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(t.charAt(i)-s.charAt(i));
        }

        int sum=0;

        for(int j=0,i=0;j<t.length();j++){
            sum+=arr[j];

            while(sum>maxCost){
                sum-=arr[i];
                i++;
            }

            result=Math.max(j-i+1,result);
        }
        return result;
    }


    public int equalSubstring_slider(String s,String t,int maxCost){
        int left=0,right=0;
        int sum=0;
        int res=0;

        while(right<s.length()){

            sum+=Math.abs(s.charAt(right)-t.charAt(right));
            right++;


            while(sum>maxCost){
                sum -=  Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            res=Math.max(res,right-left);
        }
        return res;
    }

    public static void main(String args[]){
        String s="abcd";
        String t="acde";
        int maxCost=0;

        Test test=new Test();
        int result=test.equalSubstring_slider(s,t,maxCost);

        System.out.println(result);
    }
}
