package com.interview.exercise.exercise203.exercise1;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Test {

    public ListNode removeElements(ListNode head, int val) {
        return remove(head,val);   
    }

    private ListNode remove(ListNode head,int val){
        if(head==null){
            return null;
        }
        
        ListNode result=remove(head.next,val);
        if(head.val==val){
            return result;
        }
        
        head.next=result;
        return head;
    }

    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        root.next.next=new ListNode(6);
        root.next.next.next=new ListNode(3);
        root.next.next.next.next=new ListNode(4);
        root.next.next.next.next.next=new ListNode(5);
        root.next.next.next.next.next.next=new ListNode(6);

        Test test=new Test();

        ListNode result=test.removeElements(root,6);

        System.out.println("");
    }
}
