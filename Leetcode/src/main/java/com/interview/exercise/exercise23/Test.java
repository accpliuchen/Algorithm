package com.interview.exercise.exercise23;

import java.util.PriorityQueue;

class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val=val;
    }

    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class Test {
    public class pair implements Comparable<pair>{
        public ListNode head;
        pair(ListNode head){
            this.head = head;
        }
        public int compareTo(pair p){
            return this.head.val - p.head.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode temp=head;
        if(lists.length==0) return null;
        if(lists.length==1) return lists[1];

        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pair p=new pair(lists[i]);
                pq.add(p);
            }
        }

        while(pq.size()!=0){
            pair p=pq.remove();

            System.out.println(p.head.val);
            ListNode temp2=p.head;
            temp.next=temp2;
            temp=temp.next;
            if(temp2.next!=null){
                System.out.println("============"+temp2.val);
                p.head=temp2.next;
                pq.add(p);
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode[] lists=new ListNode[3];

        ListNode list3=new ListNode(5);
        ListNode list2=new ListNode(4,list3);
        ListNode list1=new ListNode(1,list2);


        ListNode lists3=new ListNode(4);
        ListNode lists2=new ListNode(3,lists3);
        ListNode lists1=new ListNode(1,lists2);

        ListNode listt2=new ListNode(6);
        ListNode listt1=new ListNode(2,listt2);

        lists[0]=list1;
        lists[1]=lists1;
        lists[2]=listt1;

        Test test=new Test();
        ListNode nodes=test.mergeKLists(lists);

        System.out.println("");

    }

}
