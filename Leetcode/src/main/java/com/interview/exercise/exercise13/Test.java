package com.interview.exercise.exercise13;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static int romanToInt(String s){
        Map<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result=0;

        //思路就是遍历罗马字母，如果当前的罗马字母表示的数字比右边的大，则直接累加即可，如果比右边的小，则需要减去当前罗马字母表示的数字
        for(int i=0;i<s.length();i++){
            if(i== s.length()-1 || romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))){
                result+=romanMap.get(s.charAt(i));
            }else{
                result -= romanMap.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String args[]){
        String str="MCMXCIV";

        int result=romanToInt(str);

        System.out.println(result);
    }
}
