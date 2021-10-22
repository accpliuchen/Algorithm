package com.interview.exercise.exercise1946;

//https://leetcode.com/problems/largest-number-after-mutating-substring/
//https://livenewsexpress.com/largest-number-after-mutating-substring-leetcode-solution/
public class Test {

    public String maximumNumber(String num,int[] change){
        char[] chars=num.toCharArray();

        for(int i=0;i<chars.length;i++){
            int index=chars[i]-'0';
            System.out.println("index is "+ index);
            if(change[index]>index){
                while(i<chars.length && change[chars[i]-'0']>=chars[i]-'0'){
                    chars[i]=(char)('0'+change[chars[i]-'0']);
                    i++;
                }
                break;
            }
        }

        return new String(chars);
    }

    public static  void main(String args[]){
//        String num="132";
//        int[] change= {9,8,5,0,3,6,4,2,6,8};

        String num="1";
        int[] change= {1,4,7,5,3,2,5,6,9,4};

        Test test=new Test();
        System.out.print(test.maximumNumber(num,change));
    }
}
