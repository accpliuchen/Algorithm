package edu.laioffer.class10;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Test {
    public static void main(String args[]) {

    }

    // MinHeap heap=new MinHeap();
    // MinHeap heap=new MinHeap(array,comparator);
    class MinHeap{
        private int[] array;
        private int size;

        public MinHeap(int[] array){
             if(array==null || array.length<=1){
                 throw new IllegalArgumentException("input array can not be null or empty");
             }
             this.array=array;
             this.size= array.length;
             heapfiy();
        }

        private void heapfiy(){
            for(int i=size/2-1;i>=0;i++){
                percolateDown(i);
            }
        }

        public MinHeap(int cap){
            if(cap<=0){
                throw new IllegalArgumentException("capacity can not be <=0");
            }

            this.array=new int[cap];
            size=0;
        }

        public int size(){
            return this.size;
        }

        public boolean isEmpty(){
            return size==0;
        }

        public boolean isFull(){
            return size== array.length;
        }

        public int peek(){
            if(this.size==0){
                throw new NoSuchElementException("heap is empty");
            }
            return array[0];
        }

        public int poll(){
            int result=array[0];
            array[0]=array[size-1];
            this.size--;
            percolateDown(0);
            return result;
        }

        public void offer(int ele){
            if(size== array.length){
                array= Arrays.copyOf(array,(int)(array.length*1.5));
            }
            array[size]=ele;
            size++;
            percolateUp(size-1);
        }

        public int update(int index,int ele){
            if(index<0 || index>size-1){
                throw new ArrayIndexOutOfBoundsException("invalid index range");
            }

            int result=array[index];
            array[index]=ele;
            if(result>ele){
                percolateUp(index);
            }else{
                percolateDown(index);
            }

            return result;
        }

        private void percolateUp(int index){
            while(index>0){
                int parentIndex=(index-1)/2;
                if(array[parentIndex]>array[index]){
                    swap(parentIndex,index);
                }else{
                    break;
                }
                index=parentIndex;
            }
        }

        private void percolateDown(int index){
            while(index<=size/2-1){
                int leftChildIndex=index*2+1;
                int rightChildIndex=index*2+2;
                int swapCandidate=leftChildIndex;

                if(rightChildIndex<size-1 && array[leftChildIndex]>=array[rightChildIndex]){
                    swapCandidate=rightChildIndex;
                }

                //swap
                if(array[index]>array[swapCandidate]){
                    swap(index,swapCandidate);
                }else{
                    break;
                }

                index=swapCandidate;
            }
        }

        private void swap(int i,int j){
             int temp=array[i];
             array[i]=array[j];
             array[j]=temp;
        }


    }
}
