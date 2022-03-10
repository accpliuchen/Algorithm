package com.interview.exercise.exercise1209.exercise1;


import java.util.ArrayDeque;
import java.util.Deque;

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

    public java.lang.String removeDuplicates(String s, int key) {
        if(s.isEmpty() || s.length()<key) return s;

        Deque<Node> stack=new ArrayDeque<>();

        for(char c:s.toCharArray()){
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
            for(int i=0;i<node.getValue();i++){
                sb.append(node.getKey());
            }
        }

        return sb.reverse().toString();
    }



    public static void main(String args[]){
        String str = "deeedbbcccbdaa";
        int k = 3;
    }
}
