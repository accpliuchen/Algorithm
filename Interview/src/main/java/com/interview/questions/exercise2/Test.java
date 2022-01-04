package com.interview.questions.exercise2;

//https://www.chegg.com/homework-help/questions-and-answers/codewriting-given-string-5-array-positive-integers-sizeswhere-sum-elements-sizes-equal-len-q83331883
public class Test {


    public String concatSwaps(String str,int[] sizes){

        String output=new String();

        String[] array=new String[sizes.length];

        array[0]=str.substring(0,sizes[0]);
        int value=sizes[0];

        for(int i=1;i<sizes.length;i++){
            value=value+sizes[i];
            array[i]=str.substring(value-sizes[i],value);
        }

        for(int j=0;j<array.length;j=j+2){
            if(j+1!=array.length)
                output=output.toString()+array[j+1]+array[j];
            else
                output=output.toString()+array[j];
        }

        return output;

    }


    public static void main(String args[]){
//        String str="descognail";
//        int[] sizes={3,2,3,1,1};

        String str="secondfirst";
        int[] sizes={6,5};


        Test test=new Test();

        String output=new String();

        String[] array=new String[sizes.length];

        //array.append(str.substring(0,sizes[0]));
        array[0]=str.substring(0,sizes[0]);

        int value=sizes[0];
        for(int i=1;i<sizes.length;i++){
            value=value+sizes[i];
//            System.out.println("value  is "+value);
//            System.out.println("sizes[i]  is "+sizes[i]);

            array[i]=str.substring(value-sizes[i],value);
        }

//        System.out.println(array.length);

        for(int j=0;j<array.length;j=j+2){
           if((j+1)!=array.length)
               output=output.toString()+array[j+1]+array[j];
           else
               output=output.toString()+array[j];
        }

        System.out.println(output.toString());



        System.out.println("=====================");

        System.out.println(test.concatSwaps(str,sizes));
    }
}
