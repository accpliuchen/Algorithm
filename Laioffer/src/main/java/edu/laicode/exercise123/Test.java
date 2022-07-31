package edu.laicode.exercise123;

public class Test {

    public int[][] spiralGenerate(int n){
       int[][] result=null;

       if(n==1){
       	 result=new int[1][1];
       	 result[0][0]=1;
       	 return result;
       }

       result=new int[n][n];
       helper(0,n,1,result);
       return result;
    }

    private void helper(int offset,int size,int curr,int[][] result){
    	if(size==0){
    		return;
    	}else if(size==1){

            result[offset][offset]=curr++;
    		return;
    	}

    	//00 01
    	for(int i=0;i<size-1;i++){
    		result[0+offset][i+offset]=curr++;
    	}
        
        //02 12
    	for(int i=0;i<size-1;i++){
            result[i+offset][size-1+offset]=curr++;
    	}

    	//22 21
    	for(int i=size-1;i>0;i--){
    		result[size-1+offset][i+offset]=curr++;
    	}

        //20 10
    	for(int i=size-1;i>0;i--){
    		result[i+offset][0+offset]=curr++;
    	}

    	helper(offset+1,size-2,curr,result);	
    }

	public static void main(String args[]){
         int n=3;

         Test test=new Test();
         int[][] result=test.spiralGenerate(n);

         for(int i=0;i<result.length;i++){

         	for(int j=0;j<result[0].length;j++){
         		System.out.print(result[i][j]);
         	}

             System.out.println();
         }
	}
}
