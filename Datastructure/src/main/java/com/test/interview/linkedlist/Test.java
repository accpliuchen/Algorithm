package com.test.interview.linkedlist;

//https://www.geeksforgeeks.org/find-smallest-largest-elements-singly-linked-list/
public class Test {

    static class Node{
        int data;
        Node next;
    }

    static Node head=null;

    static int largestElement(Node head){
        int max=Integer.MIN_VALUE;
        while(head!=null){
            if(max<head.data)
                max=head.data;
            head=head.next;
        }

        return max;
    }

    public static int smallestElement(Node head){

        int min=Integer.MAX_VALUE;

        while(head!=null){
             if(min>head.data)
                 min=head.data;


             head=head.next;
        }
        return min;
    }

    static void push(int data){
        Node newNode=new Node();

        newNode.data=data;

        newNode.next=(head);

        (head)=newNode;
    }

    static void printList(Node head){
        while(head!=null){
            System.out.println(head.data+" -> ");
            head=head.next;
        }

        System.out.println("NUll");
    }



    public static void main(String args[]){
        push(15);
        push(14);
        push(13);
        push(22);
        push(17);

        System.out.println("Linked list is : ");
        printList(head);

        System.out.print("Maximum element in linked list: ");
        System.out.println(largestElement(head));

        System.out.print("Minimum element in linked list: ");

        System.out.println(smallestElement(head));

    }
}
