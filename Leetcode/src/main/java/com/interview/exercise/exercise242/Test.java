package com.interview.exercise.exercise242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.gushiciku.cn/pl/g2rO
public class Test {

    public boolean isAnagram(String s,String t){

        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }


    public boolean isAnagrams(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else
                return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != 0)
                return false;

        }
        return true;
    }

    public  boolean isAnagramst(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }

        int[] arraych=new int[26];

        for (int i = 0; i < s.length(); i++) {
            arraych[s.charAt(i) - 'a']++;
            arraych[t.charAt(i) - 'a']--;
        }


        for (int cnt : arraych) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }


    public boolean isAnagram_p(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        //长度都不一样直接走开
        if (ss.length != tt.length) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < ss.length; i++) {
            int c1 = ss[i] - 'a';
            int c2 = tt[i] - 'a';

            System.out.print("c1 value is "+ c1);
            System.out.print(" c2 value is "+ c2);
            System.out.println();

            //统计如果是真的是异位词最后key值为0
            table[c1]++;
            table[c2]--;
        }
        //遍历表,不是异位词就有多也有少
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str1="book"; //anagram
        String str2="koob"; //nagaram


        int[] arraych=new int[26];

        Test test=new Test();
        System.out.println(arraych['a' - 'a']);

        System.out.println(test.isAnagram_p(str1,str2));
    }
}
