package com.interview.exercise.exercise990;

import java.util.Map;
import java.util.HashMap;

public class Test {

//    HashMap<Character,Character> parent;
//
//    public boolean equationsPossible(String[] equations) {
//        if(equations==null|| equations.length==0){
//            return true;
//        }
//
//        parent=new HashMap<>();
//        for(String str:equations){
//            if(str.substring(1,3).equals("==")){
//                union(str.charAt(0),str.charAt(3));
//            }
//        }
//
//        for(String s:equations){
//            if(s.substring(1,3).equals("!=") && find(s.charAt(0))==find(s.charAt(3))){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private void union(char i,char j){
//        char p=find(i);
//        char q=find(j);
//
//        if(p!=q){
//            parent.put(p,q);
//        }
//    }
//
//    private char find(char c){
//        parent.putIfAbsent(c,c);
//
//        if(parent.get(c)!=c){
//            char ancestor=find(parent.get(c));
//            parent.put(c,ancestor);
//        }
//        return parent.get(c);
//    }

    int[] uf = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; ++i) uf[i] = i;
        for (String e : equations) {
            //System.out.println("======" + String.valueOf(e.charAt(1)));
            //System.out.println(e);
            System.out.println("======" + String.valueOf(e.charAt(0)));
            if (e.charAt(1) == '=')
                uf[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
        }
        for (String e : equations)
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a'))
                return false;
        return true;
    }

    public int find(int x) {
        System.out.println("====find=========="+x);
        if (x != uf[x])
            uf[x] = find(uf[x]);
        return uf[x];
    }


    public static void main(String args[]){
        //String[] equations = new String[]{"a==b","b!=a"};
        String[] equations = new String[]{"b==a","a==b"};

        Test test=new Test();
        boolean result=test.equationsPossible(equations);

        System.out.println("result value is "+ result);
    }
}
