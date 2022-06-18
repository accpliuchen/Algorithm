package com.test.interview.linkedlist.exercise8;

class ListNode{
    int value;
    ListNode next;

    ListNode(){}

    ListNode(int value){
        this.value=value;
    }

    ListNode(int value,ListNode next){
        this.value=value;
        this.next=next;
    }
}

public class Test {

    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode small=new ListNode(0);
        ListNode large=new ListNode(0);


        ListNode curSmall=small;
        ListNode curLarge=large;

        while(head!=null){
            if(head.value<x){
                curSmall.next=head;
                curSmall=curSmall.next;
            }else{
                curLarge.next=head;
                curLarge=curLarge.next;
            }
            head=head.next;
        }

        curSmall.next=large.next;
        curLarge.next=null;

        return small.next;

    }

    public static  void main(String args[]){
        ListNode node=new ListNode(1);
        node.next=new ListNode(4);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(2);
        node.next.next.next.next=new ListNode(5);
        node.next.next.next.next.next=new ListNode(2);

        Test test=new Test();
        ListNode result=test.partition(node,3);

        System.out.println("result is "+result);
    }
}
