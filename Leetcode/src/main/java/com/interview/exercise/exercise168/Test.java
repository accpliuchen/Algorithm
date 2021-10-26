package com.interview.exercise.exercise168;

public class Test {

    public String convertToTtile(int columnNumber){
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            sb.insert(0, (char) (--columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.toString();
    }

    public static void main(String args[]){
        int columnNumber=1;

        Test test=new Test();
        String result=test.convertToTtile(1);
        System.out.print("result is "+ result);

        System.out.print("result is "+ 1%26);
    }
}
