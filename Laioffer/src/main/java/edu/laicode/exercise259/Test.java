package edu.laicode.exercise259;

public class Test {

    public int[] moveZero(int[] array){
      if(array==null || array.length<1){
      	return array;
      }

      int slow=0;
      int fast=0;

      while(fast<array.length){
      	if(array[fast]!=0){
      		swap(array,slow++,fast);
      	}
      	fast++;
      }

      for(int i=slow;i<array.length;i++){
      	array[slow]=0;
      }

      return array;
    }


    private void swap(int[] array,int i,int j){
    	int temp=array[i];
    	array[i]=array[j];
    	array[j]=temp;
    }

	public static void main(String args[]){
		int[] array=new int[]{1,0,3,0,1};

		Test test=new Test();
		int[] arrays=test.moveZero(array);

		for(int nums:arrays){
			System.out.print(nums);
		}
	}
}
