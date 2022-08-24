package com.interview.exercise.exercise8.exercise1;

public class Test {

    public int myAtoi(String str){
    	str=str.trim();

    	if(str==null || str.length()==0) return 0;

    	char firstChar=str.charAt(0);

    	int sign=1;
    	int start=0;
    	int res=0;

    	if(firstChar=='+'){
    		sign=1;
    		start++;
    	}else if(firstChar=='-'){
    		sign=-1;
    		start++;
    	}

    	for(int i=start;i<str.length();i++){

    		if(!Character.isDigit(str.charAt(i))){
                return (int) res*sign;
            }
            
            res=res*10+str.charAt(i)-'0';
            if(sign==1 && res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1 && res>Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }
        
        return (int) res*sign;
    }

	public static void main(String args[]){
		// String str="42";

		String str="   -42";

        Test test=new Test();
		int result=test.myAtoi(str);

		System.out.println("result value is "+ result);
	}
}
