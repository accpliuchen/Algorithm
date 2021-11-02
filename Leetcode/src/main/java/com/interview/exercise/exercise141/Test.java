package com.interview.exercise.exercise141;

import com.interview.exercise.treeNode.TreeNode;

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

    public boolean hasCycle(ListNode head){
        Set<ListNode> node=new HashSet<>();
        while(head!=null){
            if(node.contains(head)){
                return true;
            }else{
                node.add(head);
            }
            head=head.next;
        }
        return false;
    }
}
