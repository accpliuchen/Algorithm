package edu.laicode.exercise10;

public class Test {


  	public int[] quickSort(int[] array) {
	    // Write your solution here
	    if(array==null){
	      return array;
	    }
	 
	    quickSort(array,0,array.length-1);
	    return array;
  	}

     public void quickSort(int[] array,int left,int right){
	    if(left>=right){
	      return;
	    }

	    int pivotPos=partition(array,left,right);
	    
	    quickSort(array,left,pivotPos-1);
	    quickSort(array,pivotPos+1,right);
  	}

  	private int partition(int[] array,int left,int right){
	    int pivotIndex=pivotIndex(left,right);
	    int pivot=array[pivotIndex];

	    swap(array,pivotIndex,right);

	    int leftBound=left;
	    int rightBound=right-1;

	    while(leftBound<=rightBound){
	      if(array[leftBound]<=pivot){
	         leftBound++;
	      }else if(array[rightBound]>=pivot){
	        rightBound--;
	      }else{
	        swap(array,leftBound++,rightBound--);
	      }
	    }
	    swap(array,leftBound,right);
	    return leftBound;
  	}

	private int pivotIndex(int left,int right){
	   return left+(int)(Math.random()*(right-left+1));
	}

	private void swap(int[] array,int left,int right){
	     int tmp=array[left];
	     array[left]=array[right];
	     array[right]=tmp;
  	}

	public static void main(String args[]){
		int[] array=new int[]{4,2,-3,6,1};

		Test test=new Test();
		test.quickSort(array);

		for(int nums:array){
			System.out.println(nums);
		}
	}
}
