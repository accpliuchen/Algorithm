package com.test.interview.linkedlist.exercise7;


class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class Test {

    public ListNode merge(ListNode one, ListNode two) {
        // Write your solution here

        ListNode dummy=new ListNode(0);
        ListNode current=dummy;

        while(one!=null && two!=null){
            if(one.value<=two.value){
                current.next=one;
                one=one.next;
            }else{
                current.next=two;
                two=two.next;
            }
            current=current.next;
        }

        if(one!=null){
            current.next=one;
        }

        if(two!=null){
            current.next=two;
        }

        return dummy.next;

    }
    public static void main(String args[]) {
        ListNode one = new ListNode(1);
        one.next = new ListNode(4);
        one.next.next = new ListNode(6);

        ListNode two = new ListNode(2);
        two.next = new ListNode(5);
        two.next.next = new ListNode(7);

        Test test=new Test();
        ListNode result=test.merge(one,two);

        System.out.println("result value "+ result);

    }
}
