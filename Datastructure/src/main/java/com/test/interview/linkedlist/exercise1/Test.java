package com.test.interview.linkedlist.exercise1;

//https://blog.csdn.net/zyx_ly/article/details/104319295

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val=x;
    }
}

public class Test {

    private static ListNode createLinkedList(int[] arr){
        if(arr.length==0){
            return null;
        }

        ListNode head=new ListNode(arr[0]);
        ListNode current=head;

        for(int i=1;i<arr.length;i++){
            current.next=new ListNode(arr[i]);
            current=current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.printf("%d->",current.val);
            current=current.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6};
        ListNode list=createLinkedList(x);
        printLinkedList(list);
    }
}
