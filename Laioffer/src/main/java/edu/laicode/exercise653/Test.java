package edu.laicode.exercise653;

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

    public ListNode reverseList(ListNode head) {
        // Write your solution here
        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
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
