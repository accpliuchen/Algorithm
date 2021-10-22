package com.interview.exercise.exercise14;

public class Test {


    public String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty())
                    return "";
            }
        }

        return prefix;

    }


    public static void  main(String args[]){
//        String[] str={"flower","flow","flight"};

        String[] str={"dog","racecar","car"};

        Test test=new Test();

        System.out.println(test.longestCommonPrefix(str));

    }
}
