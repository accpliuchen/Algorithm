package com.interview.exercise.exercise125.exercise1;

public class Test {

	public boolean isPalindrome(String s){
		if(s==null || s.trim().length()==0){
			return false;
		}

		s=s.toLowerCase();

		int left=0;
		int right=s.length()-1;

		while(left<=right){
			Character c1=s.charAt(left);
			Character c2=s.charAt(right);

			if(!Character.isLetterOrDigit(c1)){
				left++;
			}else if(!Character.isLetterOrDigit(c2)){
				right--;
			}else{
				if(c1!=c2) return false;

				left++;
				right--;
			}
		}

		return true;
	}

	public static void main(String args[]){
        // String str="A man, a plan, a canal: Panama";
        String str="race a car";

        Test test=new Test();
        boolean result=test.isPalindrome(str);

        System.out.println("result value is "+ result);
    }
}
