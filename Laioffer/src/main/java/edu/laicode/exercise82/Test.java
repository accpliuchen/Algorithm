package edu.laicode.exercise82;

public class Test {

	public String deDup(String input) {
    // Write your solution here
    if(input==null || input.length()==0){
      return input;
    }

    char[] array=input.toCharArray();
    int slow=0;
    int fast=0;

    while(fast<array.length){
      if(slow==0 || array[slow-1]!=array[fast]){
        array[slow]=array[fast];
        slow++;
        fast++;
      }else{
        while(fast<array.length && array[slow-1]==array[fast]){
          fast++;
        }
        slow--;
      }
    }


    	return new String(array,0,slow);
  	}



	public static void main(String args[]){
		 String str="aabccdc";
         //String str="aabccdc";

		Test test=new Test();
		String result=test.deDup(str);

		System.out.println(result);
	}
}
