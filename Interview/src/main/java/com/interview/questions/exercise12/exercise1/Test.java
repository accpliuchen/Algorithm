package com.interview.questions.exercise12.exercise1;

//https://www.geeksforgeeks.org/reduce-the-string-by-removing-k-consecutive-identical-characters/
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
import java.util.Stack;

class Pair{
    char c;
    int ctr;

    Pair(char c,int ctr){
        this.c=c;
        this.ctr=ctr;
    }
}



public class Test {

    public static String reduced_String(int k, String s){
       if(k==1){
           String ans="";
           return ans;
       }

       Stack<Pair> st=new Stack<Pair>();

       int l=s.length();
       int ctr=0;

        for (int i = 0; i < l; i++) {
            if(st.size()==0){
                st.push(new Pair(s.charAt(i),i));
                continue;
            }

            if(st.peek().c==s.charAt(i)){
                Pair p=st.peek();
                st.pop();
                p.ctr+=1;

                if (p.ctr == k) {
                    continue;
                }
                else {
                    st.push(p);
                }
            }else{
                st.push(new Pair(s.charAt(i), 1));
            }

        }

        String ans = "";
        while (st.size() > 0) {
            char c = st.peek().c;
            int cnt = st.peek().ctr;
            while (cnt-- > 0)
                ans = c + ans;
            st.pop();
        }
       return ans;
    }

    public static void main(String[] args) {
        //int k = 2;
        //String st = "geeksforgeeks";

        int k = 2;
        String st = "aba";

        String ans = reduced_String(k, st);
        System.out.println(ans);
    }
}
