package edu.laicode.exercise84.exercise1;

public class Test {

    public String reverseWords(String input) {
        // Write your solution here
        char[] array=input.toCharArray();

        reverse(array,0,input.length()-1);

        int start=0;

        for(int i=0;i<array.length;i++){
            if(array[i]!=' ' && (i==0 || array[i-1]==' ')){
                start=i;
            }

            if(array[i]!=' ' && (i==array.length-1 || array[i+1]==' ')){
                reverse(array,start,i);
            }
        }

        return new String(array);
    }

    private void reverse(char[] array,int left,int right){
        while(left<right){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;

            left++;
            right--;
        }
    }


    public static void main(String args[]){
//		String str="I love Google";

        String str="  hello world  ";

        Test test=new Test();
        String result=test.reverseWords(str);

        System.out.println("result value is "+ result);
    }
}
