package edu.laicode.exercise124;

public class Test {

    public int[][] spiralGenerate(int m,int n){
          if(m<=0 || n<=0){
          	return null;
          }else if(m==1){
             int[][] result=new int[1][n];

             for(int i=0;i<n;i++){
             	result[0][i]=i+1;
             }

             return result;
          }else if(n==1){
             int[][] result=new int[m][1];
             
             for(int i=0;i<m;i++){
                result[i][0]=i+1;
             }

             return result;	
          }

          int[][] result=new int[m][n];


          return result;
    }

    private void helper(int[][] result,int curr,int offset,int m,int n){
       if(m==0 || n==0){
        return ;
       }else if(m==1){
          for(int i=0;i<n;i++){
          	result[m-1+offset][i+offset]=curr++;
          }
          return;
       }else if(n==1){
       	  for(int i=0;i<m;i++){
       	  	result[i+offset][n-1+offset]=curr++;
       	  }
       	  return;
       }

       for(int i=0;i<n-1;i++){
       	result[0+offset][i+offset]=curr++;
       }

       for(int i=0;i<m-1;i++){
       	result[i+offset][n-1+offset]=curr++;
       }

       for(int j=n-1; j>0; j--) {
			result[m-1+offset][j+offset]=curr++;
	   }
	   
	   for(int j=m-1; j>0; j--) {
			result[j+offset][0+offset]=curr++;
		}
		helper(result, curr, offset+1, m-2, n-2);
    }


	public static void main(String args[]){
		int m=3,n=4;

		Test test=new Test();
        int[][] result=test.spiralGenerate(m,n);

        for(int i=0;i<result.length;i++){

         	for(int j=0;j<result[0].length;j++){
         		System.out.print(result[i][j]);
         	}

             System.out.println();
        }
	}
}
