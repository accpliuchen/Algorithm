package com.interview.hackerrank.boringarray;

import java.util.Arrays;

public class Test {

    public static boolean transformArray(String s1,String s2)
    {

        String str1[] = s1.split(" ");
        String str2[] = s2.split(" ");
        int arr[]= new int[str1.length];
        int brr[]= new int[str2.length];
        for(int i=0;i<str1.length;i++){
            arr[i]=Integer.valueOf(str1[i]);
            brr[i]=Integer.valueOf(str2[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<str1.length;i++)
        {
            int d=brr[i]-arr[i];
            if(d==1||d==0)
                continue;
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "4 2 3 4 0";
        String s2 = "1 2 3 4 5";
        System.out.println(transformArray(s1,s2));
    }
}
