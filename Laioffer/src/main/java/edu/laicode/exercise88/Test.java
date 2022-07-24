package edu.laicode.exercise88;

public class Test {

    public boolean canJump(int[] array){
      boolean[] canJump=new boolean[array.length];

      canJump[0]=true;

      for(int i=1;i<array.length;i++){
         for(int j=0;j<i;j++){
            if(canJump[j] && array[j]+j>=i){
            	canJump[i]=true;
            	break;
            }
         }
      }

      return canJump[array.length-1];
    }

	public static void main(String args[]){
		int[] array=new int[]{1,3,2,0,3};

		Test test=new Test();
		boolean result=test.canJump(array);

		System.out.println("result value is "+ result);
	}
}
