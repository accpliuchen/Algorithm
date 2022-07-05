package edu.laicode.exercise281;

public class Test {

    public String removeSpaces(String input) {
        // Write your solution here
        if(input.isEmpty()){
            return input;
        }

        char[] array=input.toCharArray();
        int slow=0;

        for(int fast=0;fast<array.length;fast++){
            if(array[fast]==' ' &&(fast==0 || array[fast-1]==' ')){
                continue;
            }
            array[slow++]=array[fast];
        }

        if(slow>0 && array[slow-1]==' '){
            slow--;
        }

        return new String(array,0,slow);
    }
    public static void main(String args[]){
        String str="I  love it";
        Test test=new Test();
        String result=test.removeSpaces(str);

        System.out.println(result);
    }
}