package com.interview.exercise.exercise1209;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

import java.util.Deque;
import java.util.ArrayDeque;

class Node{
    private char key;
    private int value;

    public Node(char key,int value){
        this.key=key;
        this.value=value;
    }

    public char getKey(){
        return key;
    }

    public int getValue(){
        return value;
    }
}

public class Test {

    public String removeDuplicates(String str,int key){
           if(str.isEmpty() ||str.length()<key){
               return str;
           }

           Deque<Node> stack=new ArrayDeque<>();

           for(char c:str.toCharArray()){
               if(stack.isEmpty()){
                   stack.push(new Node(c,1));
               }else{
                   if(stack.peek().getKey()==c){
                       Node temp=stack.pop();
                       stack.push(new Node(c,temp.getValue()+1));
                   }else{
                       stack.push(new Node(c,1));
                   }
               }

               if(stack.peek().getValue()==key){
                   stack.pop();
               }
           }

           StringBuilder sb=new StringBuilder();
           for(Node node:stack){
                for(int i=0;i< node.getValue();i++){
                    sb.append(node.getKey());
                }
           }
           return sb.reverse().toString();
    }

    public static void main(String[] args) {
//        String str = "deeedbbcccbdaa";
//        int key = 3;

        String str = "abbcccb";
        int key = 3;

        Test test=new Test();
        String result=test.removeDuplicates(str,key);

        System.out.println("result value is "+ result);
    }
}
