package edu.laicode.exercise25.exercise1;

import java.util.PriorityQueue;
import java.util.Collections;

public class Test {

    public int[] kSmallest(int[] array, int k){
        if(array.length == 0 || k == 0){
            return new int[0];
        }
        int[] res = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.offer(array[i]);
        }
        for(int i=k; i<array.length; i++){
            if(array[i]<pq.peek()){
                pq.poll();
                pq.offer(array[i]);
            }
        }
        for(int i=res.length-1; i>=0; i--){
            res[i] = pq.poll();
        }
        return res;
    }

    public static void main(String args[]){
        int[] array=new int[]{3,4,1,2,5};

        Test test=new Test();

        int[] arrays=test.kSmallest(array,3);

        for(int arr:arrays){
            System.out.println(arr);
        }

    }


}
