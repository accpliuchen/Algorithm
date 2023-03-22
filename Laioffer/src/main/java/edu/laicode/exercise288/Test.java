package edu.laicode.exercise288;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Test {

    static class Node{
        Node prev;
        Node next;

        Character ch;

        public Node(Character ch){
            this.ch=ch;
        }
    }


    private Node head;
    private Node tail;


    private HashMap<Character,Node> singled;
    private HashSet<Character> repeated;

    public Test() {
        // Initialize the class.

        tail=new Node(null);
        tail.next=tail.prev=tail;
        head=tail;

        singled=new HashMap<Character,Node>();
        repeated=new HashSet<Character>();
    }

    private void append(Node node){
        singled.put(node.ch,node);

        tail.next=node;
        node.prev=tail;
        node.next=head;
        tail=tail.next;
    }

    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;

        if(node==tail){
            tail=node.prev;
        }

        node.prev=node.prev=null;
        repeated.add(node.ch);
        singled.remove(node.ch);
    }

    public void read(char ch) {
        // Implement this method here.
        if(repeated.contains(ch)){
            return;
        }

        Node node=singled.get(ch);
        if(node==null){
            node=new Node(ch);
            append(node);
        }else{
            remove(node);
        }
    }

    public Character firstNonRepeating() {
        // Implement this method here.
        if(head==tail){
            return null;
        }
        return head.next.ch;
    }

    public static void main(String args[]){
        //a   b   c   a   c   c    b
        char[] array=new char[]{'a','b','a','b','c'};

        Test test=new Test();

        for(char ch:array){
            test.read(ch);
        }

        Character result=test.firstNonRepeating();

        System.out.println("===");
    }
}
