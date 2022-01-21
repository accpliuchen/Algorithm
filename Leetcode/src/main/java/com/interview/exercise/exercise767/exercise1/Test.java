package com.interview.exercise.exercise767.exercise1;


import java.util.PriorityQueue;

//https://blog.csdn.net/bohu83/article/details/98975545
class Item{
    int value;
    char pattern;

    public Item(int value, char pattern) {
        this.value = value;
        this.pattern = pattern;
    }
}

public class Test {

    public String reorganizeString(String s) {
       if(s.length()<=1){
           return s;
       }

       PriorityQueue<Item> pq=new PriorityQueue<>((x,y)->y.value-x.value);

       int[] record=new int[26];
       for(char ch:s.toCharArray()){
           record[ch-'a']++;
       }

       int limit=s.length()/2+s.length()%2;

       System.out.println("s.length() value is "+ s.length()/2);
       System.out.println("s.length()%2value is "+ s.length()%2);

       System.out.println("limit value is "+ limit);

       for(int i=0;i<26;i++){
           if(record[i]>limit){
               return "";
           }

           if(record[i]>0){
               pq.add(new Item(record[i],(char)(i+'a')));
           }
       }


        return greedyBuild(s.length(),pq);
    }

    private String greedyBuild(int len,PriorityQueue<Item> pq){
        char[] ans=new char[len];
        int t=0;
        while(pq.size()>0){
            Item cur=pq.poll();
            System.out.println("current value is "+ cur.value);
            for(int i=0;i<cur.value;i++){
                if(t>=len) t=1;
                ans[t]= cur.pattern;
                System.out.println("ans[t] value is "+ cur.pattern);
                t+=2;
            }
        }

        return new String(ans);
    }

    public static void main(String[] args) {
//        String str= "aab";
//        String str="aaaabbbc";
//        String str="aab";
        String str="eqmeyggvp";

        Test test=new Test();
        String result=test.reorganizeString(str);

        System.out.println("result value is "+result);
    }
}
