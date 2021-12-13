package com.interview.exercise.exercise234;

//https://zhuanlan.zhihu.com/p/157977205

class ListNode{
    int val;
    ListNode next;

    public ListNode(){};

    public ListNode(int val){this.val=val;};

    public ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class Test {

    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode mid=findMid(head);
        ListNode newHead= mid.next;
        mid.next=null;

        newHead=reverse(newHead);

        while(head!=null && newHead!=null){
            if(head.val!= newHead.val){
                return false;
            }
            head=head.next;
            newHead=newHead.next;
        }

        return true;
    }

    public static ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head){
        ListNode dummy=new ListNode(-1);
        while(head!=null){
            ListNode next=head.next;
            head.next=dummy.next;
            dummy.next=head;
            head=next;
        }
        return dummy.next;
    }

    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;

        Test test=new Test();

        System.out.println(test.isPalindrome(head));
    }
}
