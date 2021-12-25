package com.interview.exercise.exercise141;

import java.util.Set;
import java.util.HashSet;

class ListNode{
    int val;

    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}

public class Test {

//    public boolean hasCycle(ListNode head){
//        ListNode slow=head;
//        ListNode fast=head;
//
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//
//            if(slow==fast)
//                break;
//        }
//
//        if(fast==null || fast.next==null)
//            return false;
//
//        while(slow!=fast){
//            slow=slow.next;
//            fast=fast.next;
//        }
//
//        return false;
//
//    }

//    public boolean hasCycle(ListNode head){
//        Set<ListNode> node=new HashSet<>();
//        while(head!=null){
//            if(node.contains(head)){
//                return true;
//            }else{
//                node.add(head);
//            }
//            head=head.next;
//        }
//        return false;
//    }

//    public boolean hasCycle(ListNode head) {
//        if(head==null || head.next==null)
//            return false;
//
//        ListNode slow=head.next;
//        ListNode fast=head.next.next;
//
//        while(slow!=fast){
//            if(fast==null || fast.next==null)
//                return false;
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//
//        return true;
//    }

    public boolean hasCycle(ListNode head) {
      if(head==null || head.next==null) return false;

      ListNode slow=head;
      ListNode fast=head;

      while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) return true;
      }

      return false;

    }


    public static void main(String args[]){
        ListNode node=new ListNode(3);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(0);
        ListNode node3=new ListNode(-4);

        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;

        Test test=new Test();
        System.out.println("==========="+test.hasCycle(node));

    }
}
