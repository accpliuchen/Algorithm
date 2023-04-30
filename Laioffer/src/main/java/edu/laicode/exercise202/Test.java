package edu.laicode.exercise202;

public class Test{

	public int kth(int[] a, int[] b, int k) {
	// Write your solution here
		if(a == null || b == null){
		return -1;
		}
		int aLeft = 0;
		int bLeft = 0;
		int aVal = 0;
		int bVal = 0;
		while(k > 1){
		aVal = aLeft + k / 2 - 1 >= a.length? Integer.MAX_VALUE: a[aLeft + k/2 - 1];
		bVal = bLeft + k / 2 - 1 >= b.length? Integer.MAX_VALUE: b[bLeft + k/2 - 1];
		if(aVal <= bVal){
		aLeft = aLeft + k / 2;
		}else{
		bLeft = bLeft + k / 2;
		}
		k = k - k / 2; // k = 1
		}
		aVal = aLeft >= a.length ? Integer.MAX_VALUE: a[aLeft + k - 1];
		bVal = bLeft >= b.length ? Integer.MAX_VALUE: b[bLeft + k - 1];
		return Math.min(aVal, bVal);
	}	

	public static void main(String args[]){
		int[] A={1, 4, 6};
		int[] B={2,3};
		int k=4;

		Test test=new Test();
		int result=test.kth(A,B,k);

		System.out.println(result);
	}
}
