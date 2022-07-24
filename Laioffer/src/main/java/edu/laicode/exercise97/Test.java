package edu.laicode.exercise97;

public class Test {

    public int largestSum(int[] array){
      int result=array[0];
      int cur=array[0];

      for(int i=1;i<array.length;i++){
        cur=Math.max(cur+array[i],array[i]);
        result=Math.max(cur,result);
      }

      return result;
    }

	public static void main(String args[]){
		int[] array=new int[]{-2, -1, -3};

		Test test=new Test();

		int result =test.largestSum(array);

        System.out.println("result value is "+ result);
	}
}
