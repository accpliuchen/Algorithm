package edu.laicode.exercise280.exercise1;

import java.util.LinkedList;
import java.util.Deque;

public class Test {

    public void sort(LinkedList<Integer> s1){
        if(s1==null || s1.size()<=1){
            return;
        }
        LinkedList<Integer> s2=new LinkedList<Integer>();
        sort(s1,s2);
    }

    private void sort(Deque<Integer> input,Deque<Integer> buffer){
        while(!input.isEmpty()){
            int curMin=Integer.MAX_VALUE;
            int count=0;

            while(!input.isEmpty()){
                int cur=input.pollFirst();
                if(cur<curMin){
                    curMin=cur;
                    count=1;
                }else if(cur==curMin){
                    count++;
                }

                buffer.offerFirst(cur);
            }


            while(!buffer.isEmpty() && buffer.peekFirst()>=curMin){
                int tmp=buffer.pollFirst();

                if(tmp!=curMin){
                    input.offerFirst(tmp);
                }
            }

            while(count>0){
                buffer.offerFirst(curMin);
                count--;
            }
        }

        while(!buffer.isEmpty()){
            input.offerFirst(buffer.pollFirst());
        }
    }

    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);

        Test test=new Test();
        test.sort(list);

        System.out.println("===");

    }
}
