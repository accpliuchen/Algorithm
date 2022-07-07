package edu.datastructure.stack;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}

// Integer pop
// Integer peek
// boolean push
// int size
// boolean isEmpty

class Stack{
   private ListNode head;
   private int size;


   public Stack(){
       this.head=null;
       this.size=0;
   }

   public Integer pop(){
       if(head==null){
           return null;
       }
       ListNode result=head;
       head=head.next;
      // result

       return null;
   }

}

public class Test {
    public static void main(String args[]){

    }
}
