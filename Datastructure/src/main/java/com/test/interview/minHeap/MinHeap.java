package com.test.interview.minHeap;

public class MinHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    private static final int FRONT=1;


    public MinHeap(int maxsize){
        this.maxsize=maxsize;
        this.size=0;
        Heap=new int[this.maxsize+1];
        Heap[0]=Integer.MAX_VALUE;
    }

    private int parent(int pos){
        return pos/2;
    }

    private int leftChild(int pos){
        return (2*pos);
    }

    private int rightChild(int pos){
        return (2*pos)+1;
    }

    private boolean isLeaf(int pos){
        if(pos>=(size/2) && pos<=size){
            return true;
        }
        return false;
    }

    private void swap(int fpos,int spos){
        int temp;
        temp=Heap[fpos];
        Heap[fpos]=Heap[spos];
        Heap[spos]=temp;
    }

    private void minHeapify(int pos){
        
    }

}
