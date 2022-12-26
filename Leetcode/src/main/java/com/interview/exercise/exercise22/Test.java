package com.interview.exercise.exercise22;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Test {

//    public List<String> generateParenthesis(int n) {
//        Set<String> set=new HashSet<>();
//        set=createParenthesis(n,set);
//        return new ArrayList<>(set);
//    }
//
//    private static Set<String> createParenthesis(int n, Set<String> currentList) {
//        Set<String> temp = new HashSet<>();
//
//    }


    public static List<String> generateParenthesis(int n){
        List<String> result=new ArrayList<>();
        if(n==0) return result;
        helper(result,"",n,n);
        return result;
    }

    private static void  helper(List<String> result,String str,int left,int right){
        if(left>right){
            return;
        }

        if(left==0 && right==0){
            result.add(str);
            return;
        }

        if(left>0){
            helper(result,str+"(",left-1,right);
        }

        if(right>0){
            helper(result,str+")",left,right-1);
        }
    }

    public static void main(String[] args) {
        int n=2;
        Test test=new Test();
        List<String> result=test.generateParenthesis(n);

        System.out.println(result);
    }
}
