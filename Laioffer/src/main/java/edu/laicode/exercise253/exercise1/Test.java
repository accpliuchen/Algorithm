package edu.laicode.exercise253.exercise1;

import java.util.Set;
import java.util.HashSet;

public class Test {

    public int longest(String input) {
        // Write your solution here
        Set<Character> distinct=new HashSet<>();

        int slow=0;
        int fast=0;
        int longest=0;

        while(fast<input.length()){
            if(distinct.contains(input.charAt(fast))){
                distinct.remove(input.charAt(slow++));
            }else{
                distinct.add(input.charAt(fast++));
                longest=Math.max(longest,fast-slow);
            }
        }

        return longest;
    }

    public static void main(String args[]){
        String input="bcdfbd";

        Test test=new Test();
        int result=test.longest(input);

        System.out.print(result);
    }
}
