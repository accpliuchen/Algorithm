package com.interview.exercise.exercise17;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

//https://blog.csdn.net/u012848330/article/details/51534477
//https://www.cnblogs.com/zihaowang/p/4492032.html

//dfs & bfs
//https://zxi.mytechroad.com/blog/searching/leetcode-17-letter-combinations-of-a-phone-number/
public class Test {

//    public List<String> letterCombinations(String digits) {
//        List<String>  result=new ArrayList<>();
//
//        String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
//
//        char[] tmp=new char[digits.length()];
//
//        if(digits.length()==0)
//            return result;
//
//        rec(digits,0,tmp,map,result);
//
//        return  result;
//    }
//
//    public void rec(String digits,int index,char[] tmp,String[] map,List<String> result){
//        if(index==digits.length()){
//            result.add(new String(tmp));
//            return ;
//        }
//
//        char tmmpChar=digits.charAt(index);
//        for(int i=0;i<map[tmmpChar-'0'].length();i++){
//            tmp[index]=map[tmmpChar-'0'].charAt(i);
//            rec(digits,index+1,tmp,map,result);
//        }
//    }



    public String getKey(char n){
        if(n=='2'){
            return "abc";
        }else if(n=='3'){
            return "def";
        }else if(n=='4'){
            return "ghi";
        }else if(n=='5'){
            return "jkl";
        }else if(n=='6'){
            return "mno";
        }else if(n=='7'){
            return "pqrs";
        }else if(n=='8'){
            return "tuv";
        }else if(n=='9'){
            return "wxyz";
        }
        return "";
    }

    public List<String> getList(String digits){
        if(digits.equals("")){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        List<String> smallAns = getList(digits.substring(1));
        String keys = getKey(digits.charAt(0));
        List<String> ans = new ArrayList<>();
        int k=0;
        for(int i=0;i<smallAns.size();i++){
            for(int j=0;j<keys.length();j++){
                String s = keys.charAt(j)+smallAns.get(i);
                ans.add(s);
            }
        }
        return ans;
    }


    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return new ArrayList<>();
        return getList(digits);
    }

    public static void main(String args[]){
        String str="23";

        Test test=new Test();

        List<String> result=test.letterCombinations(str);

        System.out.println(result);
    }
}
