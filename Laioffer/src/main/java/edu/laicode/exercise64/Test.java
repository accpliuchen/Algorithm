package edu.laicode.exercise64;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public List<String> permutations(String input) {
    // Write your solution here
    List<String> result=new ArrayList<>();

    char[] array=input.toCharArray();
    helper(array,0,result);
    return result;
  }

  private void helper(char[] input,int index,List<String> result){
     if(index==input.length){
       result.add(new String(input));
       return;
     }

     for(int i=index;i<input.length;i++){
       swap(input,index,i);
       helper(input,index+1,result);
       swap(input,index,i);
     }
  }


  private void swap(char[] array,int left,int right){
    char temp=array[left];
    array[left]=array[right];
    array[right]=temp;
  }

  public static void main(String args[]){
  	String input="abc";

    Test test=new Test();
    List<String> result=test.permutations(input);
     
	for (String i : result) {
            System.out.println(i);
        }
    
  }
}
