package com.test.interview.linkedlist.exercise6;

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
        ListNode val = new ListNode(value);

        if (head == null || value < head.value) {
            val.next = head;
            return val;
        }

        ListNode cur = head;

        while (cur.next != null && cur.next.value < value ) {
            cur = cur.next;
        }

        if (cur.next != null) {
            val.next = cur.next;
        }

        cur.next = val;

        return head;
    }
    public static void main(String args[]) {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);

        node.next.next = new ListNode(7);

        Test test=new Test();
        ListNode result=test.insert(node,6);

        System.out.println("result value "+ result);

    }
}
