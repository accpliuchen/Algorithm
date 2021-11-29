package com.interview.exercise.exercise206;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;

    public ListNode(){};

    public ListNode(int val){this.val=val;};

    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class Test {

    public ListNode reverseList(ListNode head){
        if(head==null)
            return null;

        List<Integer> values=new ArrayList<>();
        while(head!=null){
            values.add(head.val);
            head=head.next;
        }

        Collections.reverse(values);
        return node(values);
    }

    public ListNode node(List<Integer> list){
        int x=list.remove(0).intValue();
        if(list.size()==0){
            return new ListNode(x);
        }else{
            return new ListNode(x,node(list));
        }
    }


    public static void main(String args[]){
        ListNode node5=new ListNode(5);
        ListNode node4=new ListNode(4,node5);
        ListNode node3=new ListNode(3,node4);
        ListNode node2=new ListNode(2,node3);
        ListNode node1=new ListNode(1,node2);


        Test test=new Test();
        ListNode node=test.reverseList(node1);

        System.out.println(node.toString());
    }
}
