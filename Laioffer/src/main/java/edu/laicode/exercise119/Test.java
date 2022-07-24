package edu.laicode.exercise119;

public class Test {

	public int[] largestAndSmallest(int[] array){
		int n=array.length;

		for(int i=0;i<n/2;i++){
			if(array[i]<array[n-1-i]){
				swap(array,i,n-1-i);
			}
		}

		return new int[]{largest(array,0,(n-1)/2),smallest(array,n/2,n-1)};
	}

	private int largest(int[] array,int left,int right){
		int largest=array[left];
		for(int i=left+1;i<=right;i++){
			largest=Math.max(largest,array[i]);
		}
		return largest;
	}

	private int smallest(int[] array,int left,int right){
		int smallest=array[left];
		for(int i=left+1;i<=right;i++){
			smallest=Math.min(smallest,array[i]);
		}
		return smallest;
	}

	private void swap(int[] array,int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

	public static void main(String args[]){
		int[] arrays=new int[]{2,1,5,4,3};

		Test test=new Test();
		int[] array=test.largestAndSmallest(arrays);

		for(int arr:array){
			System.out.print(arr+" ");
		}
	}
}
