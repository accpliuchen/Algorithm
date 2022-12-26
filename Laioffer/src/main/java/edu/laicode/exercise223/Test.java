package edu.laicode.exercise223;

class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value=value;
	}
}

public class Test{

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        int value=0;

        while(l1!=null || l2!=null || value!=0){
        	if(l1!=null){
        		value+=l1.value;
        		l1=l1.next;
        	}

        	if(l2!=null){
        		value+=l2.value;
        		l2=l2.next;
        	}

        	cur.next=new ListNode(value%10);
        	value=value/10;
        	cur=cur.next;
        }

        return dummy.next;
    }

	public static void main(String args[]){
	    ListNode node1=new ListNode(2);
	    node1.next=new ListNode(4);
	    node1.next.next=new ListNode(3);

        ListNode node2=new ListNode(5);
	    node2.next=new ListNode(6);
	    node2.next.next=new ListNode(4);

	    Test test=new Test();
	    ListNode node=test.addTwoNumbers(node1,node2);

	    System.out.println("===");

	}
}