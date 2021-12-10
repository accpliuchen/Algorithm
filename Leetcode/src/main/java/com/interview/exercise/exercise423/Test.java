package com.interview.exercise.exercise423;

public class Test {

    public String originalDigits(String s) {
        int[] wordCnt = new int[26];
        for (char c : s.toCharArray()) {
            wordCnt[c - 'a']++;
        }

        int[] numCnt = new int[10];
        numCnt[0] = wordCnt['z' - 'a'];
        numCnt[2] = wordCnt['w' - 'a'];
        numCnt[4] = wordCnt['u' - 'a'];
        numCnt[6] = wordCnt['x' - 'a'];
        numCnt[8] = wordCnt['g' - 'a'];

        numCnt[1] = wordCnt['o' - 'a'] - numCnt[0] - numCnt[2] - numCnt[4];
        numCnt[3] = wordCnt['h' - 'a'] - numCnt[8];
        numCnt[5] = wordCnt['f' - 'a'] - numCnt[4];
        numCnt[7] = wordCnt['s' - 'a'] - numCnt[6];

        numCnt[9] = wordCnt['i' - 'a'] - numCnt[5] - numCnt[6] - numCnt[8];

        int len = 0;
        for (int c : numCnt) {
            len += c;
        }


        for (int j = 0; j < numCnt.length; j++) {
            System.out.println("numCnt value "+(char)('0' + j));
        }


        System.out.println("len value is "+len);
        char[] res = new char[len];

        System.out.println("res value is "+res.length);

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < numCnt[i]; j++) {
                System.out.println("char value is "+(char)('0' + i));
                //res[len++] = (char)('0' + i);
            }
        }

        return new String(res);
    }

    public static void main(String args[]){
        String str = "owoztneoer";
//        String str = "nnei";

        Test test=new Test();
        String result=test.originalDigits(str);

        System.out.println(result);
//
//        System.out.println("=============");
//
//        System.out.println(('o'-'a'));
    }
}
