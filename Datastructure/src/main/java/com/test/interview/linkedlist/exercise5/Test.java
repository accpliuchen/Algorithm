package com.test.interview.linkedlist.exercise5;

class ListNode {
   public int value;
   public ListNode next;
   public ListNode(int value) {
      this.value = value;
      next = null;
    }
}

public class Test {

    public ListNode reverse(ListNode head) {
        // Write your solution here
        ListNode pre = null;

        while (head != null) {

            ListNode nxt = head.next;
            head.next = pre;
            pre = head;
            head = nxt;
        }

        return pre;
    }

//    public ListNode cycleNode(ListNode head) {
//        if(head==null || head.next==null) return head;
//
//        ListNode slow=head;
//        ListNode fast=head;
//
//        while(head!=null && head.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//
//            if(fast==slow){
//                return fast;
//            }
//        }
//
//        return null;
//    }


    public ListNode cycleNode(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                hasCycle=true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }

        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }

    public static void main(String args[]){

        //12, 2, 6, 9, 3, 1, 22, 5, 222, -1, 33, 66
        ListNode node=new ListNode(12);
        node.next=new ListNode(2);
        node.next.next=new ListNode(6);
        node.next.next.next=new ListNode(9);
        node.next.next.next.next=new ListNode(3);
        node.next.next.next.next.next=new ListNode(1);
        node.next.next.next.next.next.next=new ListNode(22);
        node.next.next.next.next.next.next.next=new ListNode(5);
        node.next.next.next.next.next.next.next.next=new ListNode(222);
        node.next.next.next.next.next.next.next.next.next=new ListNode(-1);
        node.next.next.next.next.next.next.next.next.next.next=new ListNode(33);
        node.next.next.next.next.next.next.next.next.next.next.next=new ListNode(66);


//        node.next.value=2;
//
//        node.next.next=new ListNode(3);
//        node.next.next.value=3;


        Test test=new Test();
        //ListNode result=test.reverse(node);

        ListNode result=test.cycleNode(node);
        System.out.println("result value "+ result);
    }

}
