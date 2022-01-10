package com.interview.exercise.exercise443;

public class Test {

    public int comparess(char[] chars){
        int indexAns=0,index=0;

        while(index<chars.length){
            char currentChar=chars[index];
            int count=0;

            while(index<chars.length && chars[index]==currentChar){
                index++;
                count++;
            }


//            System.out.println("currentChar value is "+currentChar);
//            System.out.println("indexAns value is "+indexAns);

            chars[indexAns++]=currentChar;
            if(count!=1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[indexAns++]=c;
                }
            }
        }

        return  indexAns;
    }


//    public static String compress(String target) {
//        StringBuilder rst = new StringBuilder();
//        char c = target.charAt(0);
//        int num = 1;
//        for(int i=1; i<target.length(); i++) {
//            char cur = target.charAt(i);
//            if(cur==c) {
//                num++;
//            } else {
//                rst.append(c);
//                rst.append(num);
//                c = cur;
//                num = 1;
//            }
//            if(i==target.length()-1) {
//                rst.append(c);
//                rst.append(num);
//            }
//        }
//        return rst.toString();
//
//    }

    public static void main(String args[]){
        char[] chars={'a','a','b','b','c','c','c'};

        Test test=new Test();

        System.out.println(test.comparess(chars));
    }
}
