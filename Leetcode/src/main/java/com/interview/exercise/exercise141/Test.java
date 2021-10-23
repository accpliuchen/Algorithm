package com.interview.exercise.exercise141;

class ListNode{
    int val;

    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}

public class Test {

    public boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                break;
        }

        if(fast==null || fast.next==null)
            return false;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return false;

    }
}
