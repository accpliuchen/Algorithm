package com.interview.exercise.exercise61;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }

    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class Test {

    public ListNode rotateRight(ListNode head,int k){
        if (head == null) return null;

        int index=1;
        ListNode tail=head;

        while(tail.next!=null){
            tail=tail.next;
            ++index;
        }
        k%=index;
        if(k==0) return head;

        ListNode prev=head;

        for(int i=0;i<index-k-1;++i){
            prev=prev.next;
        }


        ListNode new_head=prev.next;
        prev.next=null;
        tail.next=head;
        return new_head;
    }

    public static void main(String args[]){
        int k=2;

        Test test=new Test();
        
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        root.next.next=new ListNode(3);
        root.next.next.next=new ListNode(4);
        root.next.next.next.next=new ListNode(5);

        ListNode head=root;
        while(head.next!=null){
            head=head.next;
            System.out.println(head.val);
        }
        
        ListNode heads=test.rotateRight(root,k);

        System.out.println("==================");

        while(heads.next!=null){
            heads=heads.next;
            System.out.println(heads.val);
        }
    }
}
