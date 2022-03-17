package com.interview.exercise.exercise203;

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

        return remove(head, val);
    }

    private ListNode remove(ListNode head, int val){
        if(head == null){
            return null;
        }
        ListNode result = remove(head.next, val);
        if(head.val == val){
            return result;
        }
        head.next = result;
        return head;
    }

    public static void main(String[] args) {
        int val=6;
        ListNode nodes=new ListNode(1);
        nodes.next=new ListNode(2);
        nodes.next.next=new ListNode(6);
        nodes.next.next.next=new ListNode(3);
        nodes.next.next.next.next=new ListNode(4);
        nodes.next.next.next.next.next=new ListNode(5);
        nodes.next.next.next.next.next.next=new ListNode(6);

        Test test=new Test();

        ListNode results=test.removeElements(nodes,val);

        System.out.println("result done");
    }
}
