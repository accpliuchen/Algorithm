package com.interview.exercise.exercise21;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }

    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class Test {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;

        while(l1!=null && l2!=null){

            System.out.println("l1.val is "+l1.val);
            System.out.println("l2.val is "+l2.val);

            if(l1.val<l2.val){
                cur.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                cur.next=new ListNode(l2.val);
                l2=l2.next;
            }
            cur=cur.next;
        }

        if(l1!=null){
            cur.next=l1;
        }else{
            cur.next=l2;
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head4=new ListNode(4);
        ListNode head2=new ListNode(2,head4);
        ListNode head1 =new ListNode(1,head2);


        ListNode head3_1=new ListNode(4);
        ListNode head2_2=new ListNode(3,head3_1);
        ListNode head2_1 =new ListNode(1,head2_2);

        Test test=new Test();
        test.mergeTwoLists(head1,head2_1);

        System.out.println("");
    }
}
