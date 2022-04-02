package com.interview.exercise.exercise24;

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

//    public ListNode swapPairs(ListNode head)
//    {
//        if (head==null || head.next==null)
//            return head;
//        ListNode dummy=new ListNode(0);
//        dummy.next=head;
//
//        ListNode l1=dummy;
//        ListNode l2=head;
//
//        while(l2!=null && l2.next!=null){
//            ListNode nextStart=l2.next.next;
//
//            System.out.println(l2.next.val);
//
//            l1.next=l2.next;
//            l2.next.next=l2;
//            l2.next=nextStart;
//            l1=l2;
//            l2=l2.next;
//        }
//
//        return dummy.next;
//    }

    public ListNode swapPairs(ListNode head) {
        int counter = 1;
        ListNode temp = head;
        ListNode pre = null;
        ListNode pre_pre = null;
        while(temp != null){
            if(counter%2 == 0){
                pre.next = temp.next;
                temp.next = pre;
                if(counter != 2)
                    pre_pre.next = temp;
                else
                    head = temp;
                temp = pre.next;
            }
            else{
                if(counter != 2)
                    pre_pre = pre;
                pre = temp;
                temp = temp.next;
            }
            counter++;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head4=new ListNode(4);
        ListNode head3=new ListNode(3,head4);
        ListNode head2=new ListNode(2,head3);
        ListNode head=new  ListNode(1,head2);

        Test test=new Test();
        ListNode nodes=test.swapPairs(head);

        System.out.println("");
    }
}
