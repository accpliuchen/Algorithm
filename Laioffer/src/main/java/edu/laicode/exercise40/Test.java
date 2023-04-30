package edu.laicode.exercise40;


class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value=value;
		next=null;
	}
}

public class Test {

	public ListNode merge(ListNode one,ListNode two){
		ListNode dummy=new ListNode(0);
		ListNode cur=dummy;

		while(one!=null && two!=null){
			if(one.value<two.value){
		        cur.next=one;
		        one=one.next;
		      }else{
		        cur.next=two;
		        two=two.next;
		      }
		    cur=cur.next;
		}

		if(one!=null){
			cur.next=one;
		}

		return dummy.next;
	}

	public static void main(String args[]){
		ListNode node=new ListNode(1);
		node.next=new ListNode(3);
		node.next.next=new ListNode(5);

		Test test=new Test();
		ListNode tmp=test.merge(null,node);

		System.out.println("===");
	}
}
