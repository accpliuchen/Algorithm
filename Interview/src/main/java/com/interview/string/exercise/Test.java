package com.interview.string.exercise;

import java.util.Arrays;

public class Test {
    public static void commonSubstring(String[] aa, String[] bb) {

        String[] output=new String[aa.length];

        for(int i=0;i<aa.length;i++){
            int number=aa[i].length();
            int checker=0;

            for(int j=0;j<number;j++){
                char value=aa[i].charAt(j);

                if(bb[i].indexOf(value)>=0){
                    checker++;
                }
            }

            if(checker>0){
                output[i]="Yes";
            }else{
                output[i]="No";
            }

        }

        System.out.println(Arrays.toString(output));

    }

    public static void main(String args[]) {
        String[] a = {"ab", "cde", "efkm", "gh"};

        String[] b = {"ac", "ok", "dc", "he"};

        Test test=new Test();
        test.commonSubstring(a,b);
    }
}
