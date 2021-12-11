package com.interview.exercise.exercise8;

//https://leetcode.com/problems/string-to-integer-atoi/

public class Test {


//    public int myAtoi(String str) {
//      if(str==null || str.length()==0) return 0;
//         str=str.trim();
//         char firstChar=str.charAt(0);
//         int sign=1;
//         int start=0;
//         long res=0;
//
//         if(firstChar=='+'){
//             sign=1;
//             start++;
//         }else if(firstChar=='-'){
//             sign=-1;
//             start++;
//        }
//
//         for(int i=start;i<str.length();i++){
//             if(!Character.isDigit(str.charAt(i))){
//                 return (int) res*sign;
//             }
//
//             res=res*10+str.charAt(i)-'0';
//             if(sign==1 && res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
//             if(sign==-1 && res>Integer.MAX_VALUE) return Integer.MIN_VALUE;
//         }
//
//         return (int)res*sign;
//
//    }

    public int myAtoi(String str) {
        if(str.length()==0 || str==null)
            return 0;

        int index=0;

        //remove white space
        while(index<str.length() && str.charAt(index)==' '){
            index++;
        }

        if(index==str.length()){
            return 0;
        }

        int sign=1;

        if(str.charAt(index)=='+' || str.charAt(index)=='-'){
            sign=str.charAt(index)=='+'?1:-1;
            index++;
        }

        int res=0;

        while(index<str.length()){
            int digit=str.charAt(index)-'0';

            if(digit<0 || digit>9) break;

            int newRes=res*10+digit;

            if(Integer.MAX_VALUE/10<res || (Integer.MAX_VALUE/10==res && Integer.MAX_VALUE%10<digit))
                return  sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;

            res=newRes;
            index++;
        }

        return res*sign;
    }

    public static void main(String args[]){
//        String str="-91283472332";
        String str="-42";

        Test test=new Test();
        System.out.println(test.myAtoi(str));
    }
}
