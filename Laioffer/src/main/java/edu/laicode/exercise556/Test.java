package edu.laicode.exercise556;

class ListNode{
    int val;
    ListNode next;

    public ListNode(){};

    public ListNode(int val){this.val=val;};

    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class Test {

	public ListNode findMiddleNode(ListNode head) {
	    // Write your solution here
	    if(head==null){
	      return null;
	    }

	    ListNode slow=head;
	    ListNode fast=head;

	    while(fast.next!=null && fast.next.next!=null){
	      slow=slow.next;
	      fast=fast.next.next;
	    }


	    return slow;
	}
	
	public static void main(String args[]){

	}
}
