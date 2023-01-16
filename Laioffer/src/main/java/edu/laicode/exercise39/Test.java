package edu.laicode.exercise39;


class ListNode {
 public int value;
 public ListNode next;
 public ListNode(int value) {
       this.value = value;
       next = null;
    }
}

public class Test {

    public ListNode insert(ListNode head, int value) {
        // Write your solution here
        ListNode newNode=new ListNode(value);

        if(head==null || head.value>=value){
            newNode.next=head;
            return newNode;
        }

        ListNode cur=head;
        while(cur.next!=null && cur.next.value<value){
            cur=cur.next;
        }

        newNode.next=cur.next;
        cur.next=newNode;
        return head;
    }
    
	public static void main(String[] args) {
		// ListNode root=new ListNode(1);
		// root.next=new ListNode(3);
  		//root.next.next=new ListNode(5);

        //ListNode root=new ListNode(2);
		// root.next=new ListNode(3);
     
        //1,3,3,3,8,11,15

        ListNode root=new ListNode(1);
		root.next=new ListNode(3);
		root.next.next=new ListNode(3);
		root.next.next.next=new ListNode(3);
		root.next.next.next.next=new ListNode(8);
		root.next.next.next.next=new ListNode(11);
		root.next.next.next.next.next=new ListNode(15);
  
        // int target=2;
        // int target=3;
        // int target=1;
        int target=8;

        Test test=new Test();
        ListNode result=test.insert(root,target);

        while(result!=null){
        	
        	System.out.println(result.value); 
        	result=result.next;
        }
	}
}
