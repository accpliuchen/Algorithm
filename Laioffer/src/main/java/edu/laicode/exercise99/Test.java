package edu.laicode.exercise99;

import java.util.Set;
import java.util.HashSet;

public class Test {

    public boolean canBreak(String input,String[] dict){

       Set<String> dictSet=toSet(dict);

       boolean[] canBreak=new boolean[input.length()+1];
       canBreak[0]=true;

       for(int i=1;i<canBreak.length;i++){
       	for(int j=0;j<i;j++){
            if(dictSet.contains(input.substring(j,i)) && canBreak[j]){

              System.out.println("j value is "+j);

              canBreak[i]=true;
              break; 
           }
       	}
       }

       return canBreak[canBreak.length-1];
    }

    private Set<String> toSet(String[] dict){
      Set<String> set=new HashSet<>();

      for(String s:dict){
      	set.add(s);
      }

      return set;
    }

	public static void main(String args[]){
      String[] dict=new String[]{"bob","cat","rob"};

      Test test=new Test();
      boolean result=test.canBreak("robcatbob",dict);

      System.out.println("result value is "+ result);

	}
}
