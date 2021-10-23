package com.interview.exercise.exercise1945;

public class Test {

    public int getLucky(String s,int k){
        StringBuilder b=new StringBuilder();
        int res=0;

        for(char c:s.toCharArray()){
            b.append(c-'a'+1);
        }

        for(int i=0;i<k;i++){
                for (char l: b.toString().toCharArray()) {
                    res += l - '0';
                }

                if (k > 1 && i != k - 1) {
                    b.setLength(0);
                    b.append(res);
                    res = 0;
                }
        }
        return res;

//        if(s.isEmpty()) // mandatory null check
//            return -1;
//
//        StringBuilder sb = new StringBuilder(); // to hold values.
//        for(char ch: s.toCharArray()) {
//            sb.append(ch - 'a' + 1);  // add all char's values in string builder 'a' -'a' = 0 so added one. sb will be 9999 for iiii;
//        }
//        String str = sb.toString();
//        while(k > 0 ) { // iterate for k>0
//            k--;
//            int val = 0;  // to hold summation values.
//            for(int i = 0; i < str.length(); i++) {
//                val += str.charAt(i) - '0';
//            }
//            str = String.valueOf(val); // update string value after one iteration. will be 36 for iiii;
//
//        }
//        return Integer.parseInt(str); // return integer value after operation
    }

    public static void main(String args[]){
        int k=2;
        String str="zbax";

        Test test=new Test();
        int result=test.getLucky(str,k);
        System.out.println("result value is "+ result);
    }
}
