package edu.laicode.exercise63;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Test {

   public List<String> subSets(String set){
   	 List<String> result=new ArrayList();

   	 if(set==null){
   	 	return result;
   	 }

   	 char[] array=set.toCharArray();
   	 StringBuilder sb=new StringBuilder();

   	 Arrays.sort(array);

     helper(array,0,sb,result);
     return result;
   }

   private void helper(char[] array,int index,StringBuilder sb,List<String> result){
         if(index==array.length){
         	result.add(sb.toString());
         	return;
         }

         sb.append(array[index]);
         helper(array,index+1,sb,result);
         sb.deleteCharAt(sb.length()-1);

         while(index<array.length-1 && array[index]==array[index+1]){
         	++index;
         }



         helper(array,index+1,sb,result);
   }


	public static void main(String args[]){
	   //String str="abc";
       String str="aabb";
       Test test=new Test();

       List<String> result=test.subSets(str);
       
       for(String list:result){
          System.out.println(list);
       }
	}
}
