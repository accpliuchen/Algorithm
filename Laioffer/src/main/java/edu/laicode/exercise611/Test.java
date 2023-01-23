package edu.laicode.exercise611;

import java.util.PriorityQueue;
        
public class Test {

    public String compress(String input) {
        // Write your solution here
        // 同向双指针，用一个begin记录差值，大于10填充两次，小于10填充1次
        // inplace的做法无法保证abbbccc这种情况
        if (input == null || input.length() <= 0) {
            return input;
        }
        char[] array = input.toCharArray();
        // s左边不包括s是最后需要保留的
        int s = 0;
        int f = 0;
        StringBuilder sb = new StringBuilder();
        while (f < array.length) {
            int begin = f;
            while (f < array.length && array[f] == array[begin]) {
                f++;
            }
            int num = f - begin;
            if (num < 10) {
                sb.append(array[begin]);
                sb.append((char)(num + '0'));
            } else {
                int a = num / 10;
                int b = num % 10;
                sb.append(array[begin]);
                sb.append((char)(a + '0'));
                sb.append((char)(b + '0'));
            }
        }
        return sb.toString();
    }


    public static void main(String args[]){
        String str="oooooooooooogggggggttttttttttuuuuuuuuuuyyyyyyyhhhhhhh";

        Test test=new Test();
        String result=test.compress(str);
        System.out.println(result);
    }
}
