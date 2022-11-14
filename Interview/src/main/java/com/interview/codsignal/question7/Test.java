package com.interview.codsignal.question7;

//Worst Time n^2
public class Test {

	public String reduceTheNumber(String number,int k){
		while(true){
			if(number.length()<=k){
				return number;
			}else{
				String tmpNumber="";
				int p=0;

                while(true){
                	int sum=0;

                	for(int i=0;i<k;i++){
                		char c=number.charAt(p);
                		sum+=c-48;
                		p++;

                		if(p>=number.length()){
                			break;
                		}
                	}

                	tmpNumber=tmpNumber+String.valueOf(sum);

                	if(p>=number.length()){
                		break;
                	}
                }

                number=tmpNumber;
			}
		}
	}

	public static void main(String args[]){
		String number="1111122222";
		int k=3;

		Test test=new Test();
		String result=test.reduceTheNumber(number,k);

		System.out.println("result value is "+ result);
	}
}
