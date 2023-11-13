package com.interview.exercise.exercise92;



class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Test {


    public static  ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return null;

        ListNode prev=null;
        ListNode current=head;

        while(left>1){
            prev=current;
            current=current.next;
            left--;
            right--;
        }

        ListNode connection=prev;
        ListNode tail=current;

        while(right>0){
            ListNode next_node=current.next;
            current.next=prev;
            prev=current;
            current=next_node;
            right--;
        }

        if(connection!=null){
            connection.next=prev;
        }else{
            head=prev;
        }

        tail.next=current;

        return head;
    }


    public static void main(String args[]){

        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(values);

        Test test=new Test();
        ListNode result=test.reverseBetween(head,2,4);
        printLinkedList(result);
    }
}
