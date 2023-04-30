package com.interview.exercise.exercise707;

class MyLinkedList{

    class ListNode{
        int val;
        ListNode prev,next;

        public ListNode(int val){
            this.val=val;
        }
    }

    ListNode head;
    ListNode tail;
    int size;


    public MyLinkedList(){
        head=new ListNode(0);
        tail=new ListNode(0);

        head.next=tail;
        tail.prev=head;

        this.size=0;
    }

    public int get(int index){
        if(index<0 || index>=this.size){
            return -1;
        }
        ListNode cur=this.head;
        while(index-->0){
            cur=cur.next;
        }
        return cur.next.val;
    }

    public void addAtHead(int val){
        addAtIndex(0,val);
    }

    public void addAtTail(int val){
        addAtIndex(this.size,val);
    }

    public void addAtIndex(int index,int val){
        if(index>this.size){
            return ;
        }

        ListNode cur=this.head;
        while(index-->0){
            cur=cur.next;
        }

        ListNode addedNode=new ListNode(val);
        addedNode.next=cur.next;
        addedNode.prev=cur;

        cur.next.prev=addedNode;
        cur.next=addedNode;
        this.size++;

    }

    public void deleteAtIndex(int index){
       if(index<0 || index>=this.size){
           return ;
       }

       ListNode cur=this.head;
        while(index-->0){
            cur=cur.next;
        }

        ListNode deletedNode=cur.next;
        cur.next=deletedNode.next;
        deletedNode.next.prev=cur;
        this.size--;
    }
}

public class Test {

    public static void main(String args[]){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);              // return 3

        System.out.println("");
    }
}
