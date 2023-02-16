package edu.laicode.exercise35;


class ListNode{
    int val;

    ListNode next;

    ListNode(){}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
public class Test {

    public ListNode reverseInPairs(ListNode head) {
        // Write your solution here
        if(head==null || head.next==null){
            return head;
        }

        ListNode N2=head.next;
        ListNode N3=head.next.next;

        ListNode subHead=reverseInPairs(N3);

        N2.next=head;
        head.next=subHead;
        return N2;
    }

    public static void main(String args[]) {

        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        Test test=new Test();
        ListNode node=test.reverseInPairs(one);

        System.out.println("===");
    }
}
