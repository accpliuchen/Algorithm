package edu.laicode.exercise11;

public class Test {

	public int[] rainbowSort(int[] array) {
	    // Write your solution here

	    int nego=0;
	    int left=0;
	    int right=array.length-1;

	    while(left<=right){
	      if(array[left]==-1){
	        swap(array,nego++,left++);
	      }else if(array[left]==0){
	        left++;
	      }else{
	        swap(array,left,right--);
	      }


	      // if(array[left]==-1){
	      //   swap(array,neg++,left++);
	      // }else if(array[left]==0){
	      //   left++;
	      // }else{
	      //   swap(array,left,right--);
	      // }
	    }

	    return array;
	}

	private void swap(int[] array,int i,int j){
	    int temp=array[i];
	    array[i]=array[j];
	    array[j]=temp;
	}

	public static void main(String args[]){
		int[] array=new int[]{1, 0, 1, -1, 0};

		Test test=new Test();
		int[] result=test.rainbowSort(array);

		for (int num : result) 
        {
        	System.out.println(num);
        }
	}
}
