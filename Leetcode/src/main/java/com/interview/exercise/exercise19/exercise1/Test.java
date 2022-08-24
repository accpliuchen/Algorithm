package com.interview.exercise.exercise19.exercise1;


class ListNode{
	int val;
	ListNode next;
    
    ListNode(){}
    ListNode(int val){
    	this.val=val;
    }

    ListNode(int val,ListNode next){
    	this.val=val;
    	this.next=next;
    }
}

public class Test {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	 	ListNode dummy=new ListNode(0);
	 	ListNode slow=dummy;
	 	ListNode fast=dummy;

	 	dummy.next=head;

	 	for(int i=0;i<=n;i++){
	 		System.out.println(fast.next.val);
	 		fast=fast.next;
	 	}

	 	while(fast!=null){
	 		fast=fast.next;
	 		slow=slow.next;
	 	}

	 	slow.next=slow.next.next;

	 	return dummy.next;
	 }
	 
	 public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        node1.next=new ListNode(2);
        node1.next.next=new ListNode(3);
        node1.next.next.next=new ListNode(4);
        node1.next.next.next.next=new ListNode(5);

        Test test=new Test();
        ListNode nodes=test.removeNthFromEnd(node1,2);

        System.out.println("nodes");
    }
}
