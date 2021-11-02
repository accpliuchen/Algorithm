package com.interview.exercise.exercise1736;

public class Test {

    public String maximumTime(String time) {
        StringBuffer sb = new StringBuffer(time);
        if (sb.charAt(0) == '?' && sb.charAt(1) == '?') {
            sb.setCharAt(0, '2');
            sb.setCharAt(1, '3');
        }
        if (sb.charAt(0) == '?') {
            sb.setCharAt(0, (sb.charAt(1) > '3' ? '1' : '2'));
        }
        if (sb.charAt(1) == '?') {
            sb.setCharAt(1, (sb.charAt(0) == '2' ? '3' : '9'));
        }
        if (sb.charAt(3) == '?') {
            sb.setCharAt(3, '5');
        }
        if (sb.charAt(4) == '?') {
            sb.setCharAt(4,'9');
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String time="2?:?0";

        Test test=new Test();

        String result=test.maximumTime(time);

        System.out.println("result value is "+ result);
    }
}
