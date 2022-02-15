package com.interview.exercise.exercise876;

class ListNode {
    int value;
    ListNode next;

    ListNode(){};
    ListNode(int value){
        this.value=value;
    };

    ListNode(int value,ListNode next){
        this.value=value;
        this.next=next;
    }

}

public class Test {

    public ListNode middleNode(ListNode head){
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            System.out.println(slow.next.value);
            slow=slow.next;
            fast=slow.next.next;
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
