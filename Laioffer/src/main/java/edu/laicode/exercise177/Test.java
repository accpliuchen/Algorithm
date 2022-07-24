package edu.laicode.exercise177;

public class Test {


    public int longest(String source,String target){
        if(source==null || target==null){
        	return 0;
        }

        int sLen=source.length();
        int tLen=target.length();

        if(sLen==0 || tLen==0){
        	return 0;
        }

        int[][] same=new int[sLen+1][tLen+1];

        for(int i=1;i<=sLen;i++){
        	for(int j=1;j<=tLen;j++){
        		if(source.charAt(i-1)==target.charAt(j-1)){
        			same[i][j]=same[i-1][j-1]+1;
        		}else{
        			same[i][j]=Math.max(same[i][j],same[i][j-1]);
        		}
        	}
        }
        return same[sLen][tLen];
    }

	public static void main(String args[]){
		String source="abcde";
		String target="cbabdfe";
 
        Test test=new Test();

		int result=test.longest(source,target);

		System.out.println("result value is "+ result);
	}
}
