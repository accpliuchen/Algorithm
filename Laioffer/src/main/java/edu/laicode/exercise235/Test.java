package edu.laicode.exercise235;

public class Test {

	public String countAndSay(int n){
		String say="1";

		for(int i=1;i<n;i++){
			StringBuilder sb=new StringBuilder();
			char start=say.charAt(0);
			int count=0;

			for(int j=0;j<say.length();j++){
				char c=say.charAt(j);

				if(c==start){
					count++;
				}else {
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
    }
}
