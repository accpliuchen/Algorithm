package edu.laicode.exercise104;

public class Test {

   public int largest(int[][] matrix) {
       int N=matrix.length;
       int M=matrix[0].length;

       if(N==0 && M==0){
           return 0;
       }

       if(N==0){
           return 0;
       }

       if(M==0){
           return 0;
       }

        int[][] leftUp=leftUp(matrix,N,M);
        int[][] rightDown=rightDown(matrix,N,M);

        return merge(leftUp,rightDown,N,M);
   }
   

   private int merge(int[][] leftUp,int[][] rightDown,int N,int M){
      int result=0;

      for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
          leftUp[i][j]=Math.min(leftUp[i][j],rightDown[i][j]);
          result=Math.max(result,leftUp[i][j]);
        }
      }
      return result;
   }

 private int[][] leftUp(int[][] matrix,int N,int M){
    int[][] left=new int[N][M];
    int[][] up=new int[N][M];

    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        if(matrix[i][j]==1){
           if(i==0 && j==0){
             up[i][j]=1;
             left[i][j]=1;
           }else if(i==0){
             up[i][j]=1;
             left[i][j]=left[i][j-1]+1;
           }else if(j==0){
             up[i][j]=up[i-1][j]+1;
             left[i][j]=1;
           }else{
             up[i][j]=up[i-1][j]+1;
             left[i][j]=left[i][j-1]+1;
           }
        }
      }
    }
    merge(left,up,N,M);
    return left;
  }

  private int[][] rightDown(int[][] matrix,int N,int M){
    int[][] right=new int[N][M];
    int[][] down=new int[N][M];

    for(int i=N-1;i>=0;i--){
      for(int j=M-1;j>=0;j--){
        if(matrix[i][j]==1){
        if(i==N-1 && j==M-1){  
          down[i][j]=1;
          right[i][j]=1;
        }else if(i==N-1){
          down[i][j]=1;
          right[i][j]=right[i][j+1]+1;
        }else if(j==M-1){
          down[i][j]=down[i+1][j]+1;
          right[i][j]=1;
        }else{
          down[i][j]=down[i+1][j]+1;
          right[i][j]=right[i][j+1]+1;
        }
      }
     }
    }
    merge(right,down,N,M);
    return right;
  }

   public static void main(String args[]){
		int[][] array=new int[][]{{0,0,0,0},{1,1,1,1},{0,1,1,1},{1,0,1,1}};

		Test test=new Test();

		int result =test.largest(array);

        System.out.println("result value is "+ result);
	}
}
