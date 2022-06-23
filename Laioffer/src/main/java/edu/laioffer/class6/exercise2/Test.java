package edu.laioffer.class6.exercise2;

//implementation of Stack
//stack using linked list

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}

class Stack{
    private ListNode head;
    private int size;

    public Stack(){
        this.head=null;
        this.size=0;
    }

    public Integer pop(){
        if(head==null){
            return null;
        }

        ListNode result=head;
        head=head.next;
        result.next=null;
        size--;
        return result.value;
    }

    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.value;
    }

    public boolean push(int element){
        ListNode newNode=new ListNode(element);
        newNode.next=head;
        head=newNode;
        size++;
        return true;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
public class Test {
    public static void main(String args[]){
       Stack stack=new Stack();
       stack.push(1);
       stack.push(2);
       stack.push(3);

       System.out.println(stack.size());
    }
}
