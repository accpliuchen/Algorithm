package com.test.interview.lengthOfLongestSubstring;

public class Test {

//    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        boolean[] chars = new boolean[256]; // 256 ASCII code
//        int rst = 0;
//        int start = 0;
//        int end = 0;
//        while (start < s.length()) {
//            while (end < s.length() && !chars[s.charAt(end)]) {
//                chars[s.charAt(end)] = true;
//                rst = Math.max(rst, end - start + 1);
//                end++;
//            }
//            chars[s.charAt(start)] = false;
//            start++;
//        }
//        return rst;
//    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        Test test=new Test();
        String str="abcabcbb";
        int length=test.lengthOfLongestSubstring(str);

        System.out.println(length);
    }
}
