package com.interview.codsignal.question5;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public int[] solution(String[] queries,int diff){
        int[] numbers=new int[queries.length];
        List<Integer> list=new ArrayList<Integer>();
        int length=0;
        int[] result=new int[queries.length];

        for(String str:queries){
           System.out.println(str.substring(1));
           int number=Integer.parseInt(str.substring(1));

           if(str.substring(0,1).equals("+")){
               list.add(number);
               length+=1;
           }else{
               for(int i=0;i<list.size();i++){
                   list.remove(i);
                   length-=1;
               }
           }

            int pairs_count = 0;

           for(int i=0;i<length;i++){
               for(int j=i+1;j<length;j++){
                   if(Math.abs(list.get(i)-list.get(j))==diff){
                       pairs_count += 1;
                   }
               }
               result[i]=pairs_count;
           }

        }

        return result;
    }

    public static void main(String[] args) {
       String[] queries={"+4","+5","+2","-1"};
//        String[] queries={"+4","+5","+2","-4"};
       int diff=1;

       Test test=new Test();

       System.out.println(test.solution(queries,diff));
    }

}
