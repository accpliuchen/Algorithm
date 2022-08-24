package edu.laicode.exercise549;

public class Test {

    private void partition(int[] array,int pviotIndex){
    	if(array==null || array.length<=1){
    		return;
    	}
        
        swap(array,pviotIndex,array.length-1);

        int left=0;
        int right=array.length-2;


        while(left<=right){
             if(array[left]>array[array.length-1]){
             	swap(array,left,right);
             	--right;
             }else{
             	++left;
             }
        }


		swap(array,left,array.length-1);
        System.out.println("===");
   

    }

    private void swap(int[] array,int i,int j){
    	int temp=array[i];
    	array[i]=array[j];
    	array[j]=temp;
    }

	public static void main(String args[]){
		int[] array=new int[]{9,4,6,2,0,1,7};
		int pviotIndex=2;

		Test test=new Test();

		test.partition(array,pviotIndex);

	}
}
