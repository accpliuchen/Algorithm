package edu.laicode.exercise36;


class ListNode {
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value=value;
		next=null;
	}
}

public class Test {

	public ListNode middleNode(ListNode head){
        if(head==null){
        	return null;
        }

        ListNode slow=head;
        ListNode fast=head;

        if(fast.next!=null && fast.next.next!=null){
        	slow=slow.next;
        	fast=fast.next.next;
        }

        return slow;
	}

    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        root.next.next=new ListNode(3);
        root.next.next.next=new ListNode(4);
        root.next.next.next.next=new ListNode(5);

        Test test=new Test();
        ListNode result=test.middleNode(root);

        System.out.println("=========="+result.value);
    }
}
