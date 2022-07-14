package edu.laioffer.class9.exercise3;

public class Test {

    public int strstr(String s1,String s2){
        if(s1==null || s2==null || s1.length()<s2.length()){
            return -1;
        }

        if(s2.length()==0){
            return 0;
        }
        
        for(int i=0;i<=s1.length()-s2.length();i++){
            int j=0;
            while(j<s2.length() &&  s1.charAt(i+j)==s2.charAt(j)){
                j++;
            }
            
            if(j==s2.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String str1="abcde";
        String str2="cde";

        Test test=new Test();
        int result=test.strstr(str1,str2);

        System.out.println(result);
    }
}
