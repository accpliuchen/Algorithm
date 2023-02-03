package com.interview.exercise.exercise706.exercise1;

//https://www.youtube.com/watch?v=UFCLHxgQa8w
class Node{
    int key,value;
    Node next;

    public Node(int key,int value){
        this.key=key;
        this.value=value;
        next=null;
    }
}

class MyHashMap{
    private Node[] buckets;
    private int size;
    private static final double LOAD_FACTOR=0.75;


    public MyHashMap(){
        size=0;
        buckets=new Node[16];
    }

    public void put(int key,int value){
        int index=key%buckets.length;
        Node head=buckets[index];

        while(head!=null && head.key!=key){
            head=head.next;
        }

        if(head!=null){
            head.value=value;
        }else{
            Node newNode=new Node(key,value);
            newNode.next=buckets[index];
            buckets[index]=newNode;
            size++;
        }

//        if(size>= buckets.length*LOAD_FACTOR){
//            expand();
//        }
    }


    public int get(int key){
        int index=key% buckets.length;
        Node head=buckets[index];

        while(head!=null && head.key!=key){
            head=head.next;
        }
        return head==null?-1:head.value;
    }

    public void remove(int key){
        int index=key% buckets.length;
        Node head=buckets[index];

        Node dummy=new Node(0,0),cur=dummy;
        dummy.next=head;
        while (cur.next!=null && cur.next.key!=key){
            cur=cur.next;
        }

        if(cur.next!=null && cur.next.key==key){
            cur.next=cur.next.next;
            size--;
        }

        buckets[index]=dummy.next;
    }


    private void expand(){
        Node[] oldBuckets=buckets;
        Node[] newBuckets=new Node[buckets.length*2];
        buckets=newBuckets;

        for(Node head:oldBuckets){
            while(head!=null){
                put(head.key, head.value);
                head=head.next;
            }
        }

    }


}

public class Test {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
       /* myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]*/
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}
