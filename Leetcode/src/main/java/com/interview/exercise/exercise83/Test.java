package com.interview.exercise.exercise83;


class ListNode{
	int val;
	ListNode next;
	ListNode (){};
	ListNode (int val){
		this.val=val;
	}

	ListNode(int val,ListNode next){
		this.val=val;
		this.next=next;
	}
}

public class Test {
 
    public ListNode deleteDuplicates(ListNode head){
           if(head==null) return null;

           ListNode p=head;
           ListNode q=p;

           while(p!=null){
           	 if(p.val==q.val){
                q.next=p.next;
                p=q.next;
           	 }else{
                q=p;
                p=p.next;
           	 } 
           }

           return head;
    }

	public static void main(String args[]){
		ListNode root=new ListNode(1);
		root.next=new ListNode(1);
		root.next.next=new ListNode(2);

 	    Test test=new Test();
		ListNode list=test.deleteDuplicates(root);

		while(list.next!=null){

            System.out.println(list.val);
			list=list.next;
		}
	}

}
