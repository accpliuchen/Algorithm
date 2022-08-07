package com.interview.exercise.exercise1143;

public class Test {

    public int longest(String source,String target){
       if(source==null || target==null){
       	 return 0;
       }

       int sLen=source.length();
       int tLen=target.length();

       int[][] same=new int[sLen+1][tLen+1];

       
       for(int i=1;i<=sLen;i++){
       	for(int j=1;j<=tLen;j++){
       		if(source.charAt(i-1) == target.charAt(j-1)){
       			same[i][j]=same[i-1][j-1]+1;
       		}else{
                same[i][j]=Math.max(same[i-1][j],same[i][j-1]);
       		}
       	 }
       }
       return same[sLen][tLen];

    }

	public static void main(String args[]){
		String source="abcde";
		String target="cbabdfe";
	}
}
