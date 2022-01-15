package com.interview.exercise.exercise25;

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
//https://www.youtube.com/watch?v=DryIN7iL4pA
//https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/11423/Short-but-recursive-Java-code-with-comments

public class Test {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode dummy=new ListNode(0);
//        dummy.next=head;
//
//        ListNode pointer=dummy;
//
//        while(pointer!=null){
//            ListNode node=pointer;
//
//            for(int i=0;i<k && node!=null; i++)
//                node=node.next;
//
//            if(node==null) break;
//
//            ListNode prev=null;
//            ListNode curr=pointer.next;
//            ListNode next=null;
//
//            for(int i=0;i<k;i++){
//                next=curr.next;
//                curr.next=prev;
//                prev=curr;
//                curr=next;
//            }
//
//            ListNode tail=pointer.next;
//            tail.next=curr;
//            pointer.next=prev;
//            pointer=tail;
//        }
//
//        return dummy.next;
//    }

    public ListNode reverseKGroup(ListNode head, int k){
        if(head==null || head.next==null) return head;
        int count=0;
        ListNode cur=head;

        while(cur!=null && count!=k){
            System.out.println(""+cur.next.val);
            cur=cur.next;
            count++;
        }

        if(count==k){
            cur=reverseKGroup(cur,k);

            while(count-->0){
                ListNode temp=head.next;
                head.next=cur;
                cur=head;
                head=temp;
            }
            head=cur;
        }


        return head;
    }

    public static void main(String[] args) {
        int k=2;
        ListNode head5=new ListNode(5);
        ListNode head4=new ListNode(4,head5);
        ListNode head3=new ListNode(3,head4);
        ListNode head2=new ListNode(2,head3);
        ListNode head=new ListNode(1,head2);

        Test test=new Test();
        ListNode node=test.reverseKGroup(head,k);

        System.out.println("");
    }
}
