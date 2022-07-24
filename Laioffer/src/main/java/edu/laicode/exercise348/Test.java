package edu.laicode.exercise348;

public class Test {

	public String reverse(String input) {
	 // Write your solution here

	if(input==null || input.length()<2) {
		return input;
	}
	
	char[] chars = input.toCharArray();
	int slow = 0, fast = chars.length-1;
	
	while(slow < fast) {
		if(isVowels(chars[slow])==false) {
			  slow++;
		} else if(isVowels(chars[fast])==false) {
			  fast--;
		} else {
			swap(chars, slow++, fast--);
		}
	}
	return new String(chars);
	}

	private boolean isVowels(char c){
	   return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u' || c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U';
	 }

	private void swap(char[] array,int i,int j){
	    char temp=array[i];
	    array[i]=array[j];
	    array[j]=temp;
	}

	public static void main(String args[]){
		String str="aA";

		Test test=new Test();
		String result=test.reverse(str);

		System.out.println("result value is "+ result);
	}
}
