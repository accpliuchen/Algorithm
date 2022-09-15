package edu.laicode.exercise17.exercise1;

public class Test {

   public int closest(int[] array,int target){
   	  if(array==null || array.length==0){
   	  	return -1;
   	  }

   	  int left=0;
   	  int right=array.length-1;

   	  while(left<right-1){
         int mid=left+(right-left)/2;

         if(array[mid]==target){
         	return mid;
         }else if(array[mid]<target){
         	left=mid;
         }else {
         	right=mid;
         }
   	  }

   	  if(Math.abs(array[left]-target)<= Math.abs(array[right]-target)){
      	return left;
      }

   	    
   	    return right;
   }

   public static void main(String args[]){
       int[] array=new int[]{1,5,7,9,11,12};

       int target=8;
	}
}
