package edu.laicode.exercise202.Test1;

public class Test {

	public int kth(int[] a,int[] b,int k){
		if(a==null || b==null){
			return -1;
		}

		int aLeft=0;
		int bLeft=0;

		int aVal=0;
		int bVal=0;

		while(k>1){

		    if(aLeft+k/2-1>=a.length){
		    	aVal=Integer.MAX_VALUE;
		    }else{
				aVal=a[aLeft + k/2 - 1];
		    }


			if(bLeft+k/2-1>=b.length){
		    	bVal=Integer.MAX_VALUE;
		    }else{
				bVal=b[bLeft+k/2-1];
		    }

		    if(aVal<=bVal){
		    	aLeft=aLeft=k/2;
		    }else{
		    	bLeft=bLeft=k/2;
		    }

			k=k-k/2;
		}

		if(aLeft>=a.length){
			aVal=Integer.MAX_VALUE;
		}else{
			aVal=a[aLeft+k-1];
		}

		if(bLeft>=b.length){
			bVal=Integer.MAX_VALUE;
		}else{
			bVal=b[bLeft+k-1];
		}

		return Math.min(aVal,bVal);

	}


	public static void main(String args[]){
		int[] A={1, 4, 6};
		int[] B={2,3};
		int k=2;

		Test test=new Test();
		int result=test.kth(A,B,k);

		System.out.println(result);
	}
}
