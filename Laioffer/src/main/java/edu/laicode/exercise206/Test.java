package edu.laicode.exercise206;

public class Test {

    public int majority(int[] array){
    	int result=array[0];
    	int count=1;

    	for(int i=1;i<array.length;i++){
           if(count==0){
           	result=array[i];
           	count++;
           }else if(array[i]!=result){
           	count--;
           }else{
           	count++;
           }
    	}

    	return result;
    }

	public static void main(String args[]){
		int[] arrays=new int[]{1,2,1,2,1};
	   
	    Test test=new Test();
	    int result=test.majority(arrays);

	    System.out.println("result value is "+ result);
	}
}
