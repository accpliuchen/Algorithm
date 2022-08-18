package edu.laicode.exercise84;

public class Test {

    public String reverseWords(String str){
    	if(str==null || str.length()<1){
    		return str;
    	}

    	str=str.trim();

    	if(str.length()<1){
    		return str;
    	}

    	char[] array=str.toCharArray();
		reverse(array,0,array.length-1);

		int end=0;

		for(int start=0;start<array.length;){
			int fast=start;

			while(fast<array.length && array[fast]!=' '){
				fast++;
			}

			reverse(array,start,fast-1); //Google

			while(start!=fast){
				//array[end++]=array[start++];
				start++;
				end++;
			}

			while(fast<array.length && array[fast]==' '){
				fast++;
			}

			if(fast<array.length){
				array[end++]=' ';
			}

			start=fast;

		}

    	return new String(array,0,end);
    }

    private void reverse(char[] array,int left,int right){
    	while(left<right){
    		char temp=array[left];
    		array[left]=array[right];
    		array[right]=temp;

    		left++;
    		right--;
    	}
    }

	public static void main(String args[]){
		String str="I love Google";

		Test test=new Test();
		String result=test.reverseWords(str);

		System.out.println("result value is "+ result);
	}
}
