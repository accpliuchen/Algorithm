package edu.laicode.exercise29;


class ListNode{
	int val;

    ListNode next;
    
	ListNode(){}

	ListNode(int val) { this.val = val; }

	ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
public class Test {

	public ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode middleNode=findMid(head);
		ListNode midHead=middleNode.next;
		middleNode.next=null;

        ListNode left=mergeSort(head);
        ListNode right=mergeSort(midHead);

		return merge(left,right);
	}

	private ListNode findMid(ListNode head){
		ListNode slow=head;
		ListNode fast=head;

		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
    
     private ListNode merge(ListNode left, ListNode right) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode cur = dummyHead;

	    while (left != null && right != null) {
	      if (left.val <= right.val) {
	        cur.next = left;
	        left = left.next;
	      }
	      else {
	        cur.next = right;
	        right = right.next;
	      }

	      cur = cur.next;
	    }

//     while (left != null) {
//       cur.next = left;
//       left = left.next;
//       cur = cur.next;
//     }

//     while (right != null) {
//       cur.next = right;
//       right = right.next;
//       cur = cur.next;
//     }
        
	    if(left!=null){
	      cur.next=left;
	    }

	    if(right!=null){
	      cur.next=right;
	    }

	    return dummyHead.next;
    }

	public static void main(String args[]){

		// ListNode five=new ListNode(5);
		// ListNode four=new ListNode(4,five);
		// ListNode three=new ListNode(3,four);
		// ListNode two=new ListNode(0,three);
		// ListNode one=new ListNode(-1,two);

	
		ListNode four=new ListNode(3);
		ListNode three=new ListNode(1,four);
		ListNode two=new ListNode(2,three);
		ListNode one=new ListNode(4,two);
		

		Test test=new Test();
		ListNode node=test.mergeSort(one);

		System.out.println("===");
	}
}
