package edu.laicode.exercise87;

public class Test {

	public int maxProduct(int length){
		int[] array=new int[length+1];

		array[1]=0;

		for(int i=2;i<=length;i++){
			for(int j=1;j<i;j++){
				int temp=Math.max(j,array[j])*(i-j);
				array[i]=Math.max(array[i],temp);
			}
		}

	    return array[length];
	}

	public static void main(String args[]){
		Test test=new Test();
		int result=test.maxProduct(4);

		System.out.println("result is "+ result);
	}
}
