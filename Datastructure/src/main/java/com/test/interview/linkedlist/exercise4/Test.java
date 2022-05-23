package com.test.interview.linkedlist.exercise4;

class LinkedList{
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void push(int new_data){
        Node new_node=new Node(new_data);

        new_node.next=head;
        head=new_node;
    }

    public void insertAfter(Node prev_node,int new_data){
         if(prev_node==null){
            System.out.println("The given pervious node cannot be null");
            return;
         }

         Node new_node=new Node(new_data);
         new_node.next=prev_node.next;
         prev_node.next=new_node;
    }

    public void append(int new_data){
        Node now_node=new Node(new_data);

        if(head==null){
            head=new Node(new_data);
            return;
        }

        now_node.next=null;

        Node last=head;
        while(last.next!=null){
            last=last.next;
        }

        last.next=now_node;
        return ;
    }

    public void printList(){
        Node tnode=head;

        while(tnode!=null){
            System.out.println(tnode.data+" ");

            tnode=tnode.next;
        }
    }
}

public class Test {
    public static void main(String args[]){
        
        LinkedList llist=new LinkedList();

        llist.append(6);

        llist.push(7);
        llist.push(1);

        llist.append(4);

        llist.insertAfter(llist.head.next,8);

        System.out.println("\nCreated Linked list is :");
        llist.printList();
    }
}
