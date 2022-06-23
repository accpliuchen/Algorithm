package edu.laioffer.class6.exercise1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    public static void main(String args[]){
       Deque<Integer> stack=new ArrayDeque<>();

       stack.offerFirst(1);
       stack.offerFirst(2);
       stack.offerFirst(3);
       
       while(!stack.isEmpty()){
           System.out.println(stack.peekFirst());
           System.out.println(stack.pollFirst());
       }
       
       System.out.println(stack.peekFirst());
       System.out.println(stack.pollFirst());
    }
}
