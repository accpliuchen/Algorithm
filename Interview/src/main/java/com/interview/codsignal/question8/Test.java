package com.interview.codsignal.question8;

public class Test {

	public String removingPairsGame(int[] numbers){
		int p=-1;
		int sum=0;
		int[] arr=new int[100000];

		for(int i=0;i<numbers.length;i++){
			if(p>=0 && arr[p]==numbers[i]){
				p--;
				sum++;
			}else{
				p++;
				arr[p]=numbers[i];
			}
		}

		if(sum%2==0){
			return "Bob";
		}else{
			return "Alice";
		}
	}

	public static void main(String args[]){
		int[] numbers=new int[]{1,4,5,5,6};

		Test test=new Test();
		String result=test.removingPairsGame(numbers);

		System.out.println("result value is "+ result);
	}
}
