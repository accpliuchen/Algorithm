package edu.laicode.exercise120;

public class Test {

	public int[] largestAndSecond(int[] array){
		if(array.length==2){
			return new int[]{Math.max(array[0],array[1]),Math.min(array[0],array[1])};
		}

		int l1=Integer.MIN_VALUE;
		int l2=Integer.MAX_VALUE;

		for(int i:array){
			if(i>l1){
				l2=l1;
				l1=i;
			}else if(i>l2){
				l2=i;
			}
		}

		return new int[]{l1,l2};
	}

	public static void main(String args[]){
		int[] arrays=new int[]{2,1,5,4,3};

        Test test=new Test();
        int[] result=test.largestAndSecond(arrays);

        for(int res:result){
        	System.out.println(res);
        }
	}
}
