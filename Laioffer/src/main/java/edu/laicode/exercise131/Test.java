package edu.laicode.exercise131;

import java.util.HashMap;
import java.util.Map;

class RandomListNode{
	public int value;
	public RandomListNode next;
	public RandomListNode random;

    @Override
    public String toString(){
        if(this.next==null){
            return String.valueOf(this.value);
        }

        return this.value +"("+(this.random==null?"":this.random.value)+")"+" -> "+ this.next.toString();
    }

	public RandomListNode(int value){
          this.value=value;
	}
}

public class Test {

    public RandomListNode copy(RandomListNode head){
       if(head==null){
       	return null;
       }
       
       //13
       RandomListNode newHead=new RandomListNode(head.value);

	   //13
       RandomListNode cur=newHead;

       Map<RandomListNode,RandomListNode> lookup=new HashMap<>();
       lookup.put(head,newHead);// key value 13->0->1->2    value 0->1->2

       while(head!=null){
             if(head.next!=null){
             	if(!lookup.containsKey(head.next)){
             		lookup.put(head.next,new RandomListNode(head.next.value));
             	}
             }

             cur.next=lookup.get(head.next);
       

       		if(head.random!=null){
       			if(!lookup.containsKey(head.random)){
       				lookup.put(head.random,new RandomListNode(head.random.value));
       			}
       			cur.random=lookup.get(head.random);
       		}

 			head=head.next;
       		cur=cur.next;
      }
       return newHead;

    }

	public static void main(String args[]){
        //0->1->2
		RandomListNode head=createTestLinkedList();
		RandomListNode newHead=new RandomListNode(13);
         
        //13->0->1->2 
        newHead.next=head;
        //head random =2
        head.random=head.next.next;
 
        System.out.println(newHead);

		Test test=new Test();
        
        System.out.println("random list node");      

		System.out.println(test.copy(newHead));
	}

	private static RandomListNode createTestLinkedList(){
		RandomListNode head=new RandomListNode(0);

		RandomListNode curNode=head;

		for(int i=1;i<3;i++){
			curNode.next=new RandomListNode(i);
			curNode=curNode.next;
		}

		return head;
	}
}
