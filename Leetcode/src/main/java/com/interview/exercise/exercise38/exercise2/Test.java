package com.interview.exercise.exercise38.exercise2;

public class Test {

	public String countAndSay(int n){
// 		String say="1";

// 		for(int i=1;i<n;i++){
// //			if(i==3)
// //				System.out.println("===");
// 			StringBuilder sb=new StringBuilder();
// 			char start=say.charAt(0);
// 			int count=0;

// 		    for(int j=0;j<say.length();j++){
// 		    	char c=say.charAt(j);
// 		    	if(c==start){
// 		    		count++;
// 		    	}else{
// 		    		sb.append(count).append(start);
// 		    		count=1;
// 		    		start=say.charAt(j);
// 		    	}
// 		    } 

// 		    sb.append(count).append(start);
// 		    say=sb.toString();
// 		}


// 		return say;
		String say="1";
    

      for(int i=1;i<n;i++){
      	 if(i==3)
		 	System.out.println("===");

          StringBuilder sb=new StringBuilder();
          char start=say.charAt(0);
          int count=0;
          
          for(int j=0;j<say.length();j++){
              char c=say.charAt(j);
              if(c==start){
                  count++;
              }else{
                  sb.append(count).append(start);
                  count=1;
                  start=say.charAt(j);
              }
          }
          
          sb.append(count).append(start);
          say=sb.toString();
      }
      return say;

	}

	public static void main(String args[]){
		int n=3;

		Test test=new Test();
		String result=test.countAndSay(4);

		System.out.println("result value is "+ result);
	}
}
