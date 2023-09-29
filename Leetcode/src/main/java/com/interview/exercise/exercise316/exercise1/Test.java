package com.interview.exercise.exercise316.exercise1;

import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.HashSet;

public class Test {

    public String removeDuplicateLetters(String str){
        Map<Character,Integer> map=new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Deque<Character> deque=new ArrayDeque<>();
        Set<Character> set=new HashSet<>();

        for(char c:str.toCharArray()){

            while(!deque.isEmpty() && c<deque.peekLast() && map.get(deque.peekLast())>=1 && !set.contains(c)){
                set.remove(deque.peekLast());
                deque.pollLast();
            }

            if(!set.contains(c)){
                deque.offerLast(c);
                set.add(c);
            }
            map.put(c,map.get(c)-1);
        }


        StringBuilder sb = new StringBuilder();

        while(!deque.isEmpty()){
            sb.append(deque.poll());
        }
        return sb.toString();
    }


    public static void main(String args[]){
        //String str="bcabc";
        String str="cbacdcbc";

        Test test=new Test();

        String result=test.removeDuplicateLetters(str);

        System.out.println(result);

    }
}
