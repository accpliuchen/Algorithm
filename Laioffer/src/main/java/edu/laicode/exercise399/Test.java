package edu.laicode.exercise399;

public class Test {

	public int[] rainbowSortII(int[] array) {
	    // Write your solution here
	    if(array==null || array.length<=1){
	      return array;
	    }

	    int i=0;
	    int j=0;
	    int left=0;
	    int right=array.length-1;

	    while(left<=right){
	      if(array[left]==0){
	        swap(array,j,left++);
	        swap(array,i++,j++);
	      }else if(array[left]==1){
	        swap(array,j++,left++);
	      }else if(array[left]==2){
	        left++;
	      }else{
	        swap(array,left,right--);
	      }
	    }
	    return array;
	}

	private void swap(int[] array,int i,int j){
	    int temp=array[i];
	    array[i]=array[j];
	    array[j]=temp;
	}

	public static void main(String args[]){
		//int[] arrays=new int[]{1,3,1,2,0};
        
        int[] arrays=new int[]{3,3,1,2,3};

        Test test=new Test();
        int[] result=test.rainbowSortII(arrays);

		for (int num : result) 
        {
        	System.out.print(num);
        }
	}
}
