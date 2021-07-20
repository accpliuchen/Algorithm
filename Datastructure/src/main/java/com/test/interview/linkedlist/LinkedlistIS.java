package com.test.interview.linkedlist;

//https://www.geeksforgeeks.org/insertion-sort-for-singly-linked-list/
public class LinkedlistIS {

    node head;
    node sorted;

    class node{
        int val;
        node next;

        public node(int val){
            this.val=val;
        }
    }

    void push(int val){
        node newnode=new node(val);

        newnode.next=head;

        head=newnode;
    }

    void insertionSort(node headref){
        sorted=null;

        node current=headref;

        while(current!=null){
            node next=current.next;

            sortedInsert(current);
            current=next;

        }

        head=sorted;
    }


    void sortedInsert(node newnode){
        if(sorted==null || sorted.val>= newnode.val){
            newnode.next=sorted;
            sorted=newnode;
        }else{
            node current=sorted;

            while(current.next!=null && current.next.val < newnode.val){
                current=current.next;
            }

            newnode.next=current.next;
            current.next=newnode;
        }
    }

    void printlist(node head){
        while (head!=null){
            System.out.println(head.val + "");
            head=head.next;
        }
    }


    public static void main(String args[]){
        LinkedlistIS list=new LinkedlistIS();
        list.push(5);
        list.push(20);
        list.push(4);
        list.push(3);
        list.push(30);
        System.out.println("Linked List before Sorting..");
        list.printlist(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList After sorting");
        list.printlist(list.head);
    }

}
