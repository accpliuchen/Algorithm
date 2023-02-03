package edu.laicode.exercise397;

public class Test {

    public String rightShift(String input, int n) {
        // Write your solution here

        if (input == null || input.length() < 2 || n == 0) {
            return input;
        }

        char[] str = input.toCharArray();
        int len = str.length - 1;
        int m = n % (len + 1);

        reverse(str, 0, len);
        reverse(str, 0, m - 1);
        reverse(str, m, len);

        return new String(str);
    }

    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            swap(str, start, end);
            ++start;
            --end;
        }
    }

    private void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String args[]){
        String input="abc";
        int n=4;

        Test test=new Test();

        String result=test.rightShift(input,n);
        System.out.println(result);
    }
}
