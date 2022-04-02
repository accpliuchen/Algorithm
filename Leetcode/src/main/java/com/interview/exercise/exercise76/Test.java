package com.interview.exercise.exercise76;

//https://leetcode.com/problems/minimum-window-substring/
public class Test {

    public String minWindows(String s,String t){
        int[] count = new int[128];

        for(char c:t.toCharArray()){
            count[c]++;
        }

        int from=0;
        int total=t.length();
        int min=Integer.MAX_VALUE;

        for(int i=0,j=0;i<s.length();i++){
//            System.out.print(s.charAt(i));

            if(count[s.charAt(i)]-->0) total--;
            while(total==0){
                System.out.print("i value is "+ i);
                System.out.print("  j value is "+ j);

                if(i-j+1<min){
                    min=i-j+1;
                    from =j;

                    System.out.println("");
                    System.out.print("  min value "+ min);
                    System.out.print(" from value "+ from);
                }

                System.out.println("");

              if(++count[s.charAt(j++)]>0) {
                  total++;
                  System.out.print("final loop ");
                  System.out.print("  j value "+ min);
                  System.out.println("  total value "+ total);

              }
            }
        }

        System.out.println("from value is "+ from +" from + min value is "+(from+min));

        return (min==Integer.MAX_VALUE)?"":s.substring(from,from+min);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
//        String s = "ADOBECODEBANC", t = "Q";

        Test test=new Test();
        String result=test.minWindows(s,t);

        System.out.println(" result value is "+ result);
    }
}
