package edu.laicode.exercise320;

class ListNode {
   public int value;
   public ListNode next;
   public ListNode(int value) {
      this.value = value;
      next = null;
    }
}
public class Test {

    public ListNode deleteNodes(ListNode head, int[] indices) {
        // Write your solution here

        if (head == null) {
            return null;
        } else if (indices.length == 0) {
            return head.next;
        } else {
            ListNode n = head;
            for (int i = 0; i < indices.length - 1; i++) {
                if(i==indices[i])
                    n = n.next;
            }
            n.next = n.next.next;
            return head;
        }

    }

    public static void main(String args[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);

        int[] indices=new int[]{0,3,5};
        Test test=new Test();
        ListNode result=test.deleteNodes(head,indices);


        System.out.println("result: "+ result);

    }
}
