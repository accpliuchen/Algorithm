package edu.laicode.exercise148;

public class Test {

    public int numDecodeWay(String str){
    	if(str==null || str.length()==0 || str.charAt(0)=='0'){
    		return 0;
    	}

    	return numDecodeWay(str,0);
    }

    private int numDecodeWay(String str,int i){
    	if(i==str.length()){
    		return 1;
    	}


    	if(str.charAt(i)=='0'){
    		return 0;
    	}

    	int result=numDecodeWay(str,i+1);

    	if(i<str.length()-1 && (str.charAt(i)=='1' || (str.charAt(i)=='2' && str.charAt(i+1)<'7'))){
            result+=numDecodeWay(str,i+2);
        }

        return result;
    }

	public static void main(String args[]){
		String str="12";

		Test test=new Test();

		int result=test.numDecodeWay(str);

		System.out.println("result value is "+ result);
	}
}
