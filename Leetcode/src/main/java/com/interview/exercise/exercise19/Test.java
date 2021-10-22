package com.interview.exercise.exercise19;

import java.util.Deque;
import java.util.LinkedList;

//https://www.taowong.com/blog/2018/10/20/data-strutctures-and-algorithm-04.html
//https://www.huaweicloud.com/articles/792769ec363cd51813e30490edc9f372.html
//https://blog.csdn.net/zjkC050818/article/details/77298447
//https://zhuanlan.zhihu.com/p/41754593
//https://www.programcreek.com/2014/05/leetcode-remove-nth-node-from-end-of-list-java/
//https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/solution/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-b-61/
public class Test {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int x){
            val=x;
        }

        public ListNode(ListNode head,int x){
            next=head;
            val=x;
        }
    }

    public  ListNode removeNthFromEnd(ListNode head,int n){
        if(head==null || n<=0) {
            return null;
        }

        ListNode p=head;
        ListNode q=head;

        int i=0;
        while(i<n){
            p=p.next;
            System.out.println("p.val is "+p.val);

            if(p==null){
                head=head.next;
                System.out.println("p==null");

                return head;
            }
            i++;
        }

        while(p.next!=null){
            p=p.next;
            q=q.next;
        }

        q.next=q.next.next;
        return head;
    }


    public ListNode removeNthFromEnd(int n,ListNode head){
        ListNode dummpy=new ListNode(0);

        dummpy.next=head;

        ListNode first=dummpy;
        ListNode second=dummpy;

        for(int i=1;i<=n+1;i++){
            first=first.next;
        }

        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummpy.next;

    }

    public ListNode removeNthFromEnd_Stack(ListNode head, int n){
        ListNode dummy=new ListNode(head,n);
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur=dummy;

        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }

        for(int i=0;i<n;++i){
            stack.pop();
        }
        ListNode prev=stack.peek();
        prev.next=prev.next.next;
        ListNode ans=dummy.next;
        return ans;

    }


    public static void main(String args[]){

        ListNode mon1 = new ListNode(1);
        ListNode mon2 = new ListNode(2);
        ListNode mon3 = new ListNode(3);
//        ListNode mon4 = new ListNode(4);
//        ListNode mon5 = new ListNode(5);

        mon1.next = mon2;
        mon2.next = mon3;
//        mon3.next = mon4;
//        mon4.next = mon5;


        Test test=new Test();

        //ListNode node=test.removeNthFromEnd(mon1,1);
        ListNode node=test.removeNthFromEnd_Stack(mon1,1);
        while(node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}


