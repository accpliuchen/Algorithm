package com.interview.exercise.exercise38;

public class Test {

    public String countAndSay(int n){
        int i=1;

        String res="1";

        while(i<n){
            int count=0;
            StringBuilder sb=new StringBuilder();
            char c=res.charAt(0);

            for(int j=0;j<=res.length();j++){
                if(j!=res.length() && res.charAt(j)==c){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(c);

                    System.out.println("sb value is "+sb);

                    if(j!=res.length()){
                        count=1;
                        c=res.charAt(j);
                    }
                }
            }

            res=sb.toString();
            i++;
        }

        return res;
    }


    public String countAndSays(int n) {
        //special case
        if (n <= 0) return "";
        if (n == 1) return "1";
        //base case
        StringBuilder s = new StringBuilder("1");
        //general case
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(s.charAt(j - 1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(s.charAt(s.length() - 1));
            s = sb;
        }
        return s.toString();
    }


    public String countAndSay_leetcode(int n){
        String first_say="1";
        StringBuilder sb=new StringBuilder();
        int current_count=1;

        if(n==1){
            return first_say;
        }

        for(int i=0;i<n-1;i++){
            char[] arr=first_say.toCharArray();
            for(int j=0;j<arr.length;j++){

                while(j != arr.length -1 && arr[j] == arr[j + 1]) {
                    current_count++;
                    j++;
                }

                sb.append(current_count).append(arr[j]);
                current_count=1;
            }

            first_say=sb.toString();
            sb=new StringBuilder();
        }
        return first_say;

    }

    public String countAndSay_youtubecode(int n){
        String say="1";

        for(int i=1;i<n;i++){
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
        Test test=new Test();
        int n=1;

       System.out.println("result value is "+test.countAndSay_youtubecode(n));
    }
}
