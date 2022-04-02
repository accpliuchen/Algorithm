package com.interview.exercise.exercise844;

public class Test {

    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;

        int skipS=0;
        int skipT=0;

        while(i>=0 || j>=0){


            while(i>=0){

                System.out.println(s.charAt(i));
                if(s.charAt(i)=='#'){
                    skipS++;
                    i--;
                }else if(skipS>0){
                    skipS--;
                    i--;
                }else{


                    System.out.println("==========");
                    break;
                }
            }


            System.out.println("&&&&&&");

            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipT++;
                    j--;
                }else if(skipT>0){
                    skipT--;
                    j--;
                }else{
                    break;
                }
            }

            if(i>=0 && j>=0){
                if(s.charAt(i)!=t.charAt(j))
                    return false;
            }else if(i>=0 || j>=0){
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s="ab#c";
        String t="ad#c";

        Test test=new Test();
        boolean result=test.backspaceCompare(s,t);

        System.out.println("result value is "+ result);
    }
}
