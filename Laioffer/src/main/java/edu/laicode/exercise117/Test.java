package edu.laicode.exercise117;

import java.util.*;

public class Test{
	public int[] dedup(int[] array){
       if(array==null || array.length<=1){
       	 return array;
       }

       int slow=0;
       for(int fast1=0,fast2=0;fast2<array.length;){
       	  fast1=fast2;

       	  while(fast2<array.length && array[fast1]==array[fast2]){
       	  	fast2++;
       	  }

       	  if(fast2-fast1==1){
       	  	array[slow++]=array[fast1];
       	  }
       }
       return Arrays.copyOf(array,slow);
	}

	public static void main(String args[]){
      // int[] array=new int[]{1, 2, 2, 3, 3};
        int[] array=new int[]{1, 2, 2, 1, 3};

      Test test=new Test();

      int[] arrays=test.dedup(array);

      for(int index:arrays){
        System.out.println(index);
      }
	}
}