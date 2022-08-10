package edu.laicode.exercise85;

public class Test {

	public int strstr(String large,String small){
        if(small.length()==0){
        	return 0;
        }

        if(large.length()<small.length()){
        	return -1;
        }

        for(int i=0;i<=large.length()-small.length();i++){
        	if(equals(large,small,i)){
        		return i;
        	}
        }
        return -1;
	}

	private boolean equals(String large,String small,int index){
		for(int i=0;i<small.length();i++){
			if(small.charAt(i)!=large.charAt(index+i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		// String large="issippi";
		// String small="issip";

		String large="bcabc";
		String small="ab";

        Test test=new Test();
        int result=test.strstr(large,small);

        System.out.println("result value is "+ result);
	}
}
