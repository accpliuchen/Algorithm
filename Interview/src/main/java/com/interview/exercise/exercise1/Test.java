package com.interview.exercise.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public int countChar(String str){
      HashMap<Character,Integer> map=new HashMap<>();
      int max=0;

      for(Character ch:str.toCharArray()){

          if(map.containsKey(ch)){
             int temp= map.get(ch)+1;
              if(max<temp)
                  max=temp;
              map.put(ch,temp);
          }else {
              map.put(ch, 1);
          }
      }

      return max;
    }

    public static void main(String[] args) {
        String str="haveagoodday";

        Test test=new Test();
        int result=test.countChar(str);

        System.out.println("result value is "+ result);
    }
}
