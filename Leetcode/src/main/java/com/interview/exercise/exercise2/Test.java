package com.interview.exercise.exercise2;

//https://leetcode.com/problems/add-two-numbers/


class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value=value;
	}
}

public class Test {


    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
       ListNode dummy=new ListNode(0);

       ListNode current=dummy;

       int value=0;

       while(l1!=null && l2!=null && value!=0){
            if(l1!=null){
            	value+=l1.value;
            	l1=l1.next;
            }

            if(l2!=null){
            	value+=l2.value;
            	l2=l2.next;
            }

            current.next=new ListNode(value%10);
            value=value/10;
            current=current.next;
       }
       return dummy.next;
    }

	public static void main(String[] args) {
	  ListNode root=new ListNode(2);
	  root.next=new ListNode(4);
	  root.next.next=new ListNode(3);

	  ListNode root2=new ListNode(5);
	  root2.next=new ListNode(6);
	  root2.next.next=new ListNode(4);

	}
}
