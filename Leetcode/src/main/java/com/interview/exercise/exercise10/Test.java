package com.interview.exercise.exercise10;

public class Test {


    public boolean isMatch(String s,String p){
        if(p.isEmpty()){
            return s.isEmpty();
        } else if (p.length() == 1) {
            return s.length() == 1 && isEqual(s, p);
        } else if (p.charAt(1) != '*') {
            return s.length() > 0 && isEqual(s, p) && isMatch(s.substring(1), p.substring(1));
        } else {
            if (s.length() > 0 && isEqual(s, p)) {
                return isMatch(s, p.substring(2)) || isMatch(s.substring(1), p);
            } else {
                return isMatch(s, p.substring(2));
            }
        }
    }

    private boolean isEqual(String s,String p){
        return s.charAt(0)==p.charAt(0) || p.charAt(0)=='.';
    }

    public static void main(String args[]){
        String s="aa";
        String p="a";

        Test test=new Test();


        System.out.print(test.isMatch(s,p));
    }
}
