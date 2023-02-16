package com.interview.exercise.exercise151.exercise1;

public class Test {

    public String reverseWords(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        String input = trimSpace(s);

        char[] array = input.toCharArray();
        reverse(array, 0, input.length() - 1);

        int start = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != ' ' && (i == 0 || array[i - 1] == ' ')) {
                start = i;

            }
            if (array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')) {
                reverse(array, start, i);
            }
        }

        return new String(array);
    }

    private void reverse(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public String trimSpace(String str) {
        String input = str.trim();

        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {

        String str = "the sky is blue";

        Test test=new Test();
        String result=test.reverseWords(str);

        System.out.println(result);

    }
}
