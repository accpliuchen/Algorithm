package com.interview.exercise.exercise81;


class Student{
    public String name;
    public Student(String name){
        this.name=name;
    }
}

public class MyHelloWorld {

    public static  void main(String args[]){
//        Student s=new Student("tom");
//        changeStudent(s);
//        System.out.println(s.name);

         int[] arrays=new int[]{7,3,2};

         int min=arrays[0];

         for(int i=1;i<arrays.length;i++){
             if(min>arrays[i]){
                 min=arrays[i];
             }
         }

         System.out.println(min);
//        int[] arr=new int[]{1,2,3,4,5};
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(i);
//        }
    }


    public static void changeStudent(Student s){
        Student t=new Student("Jerry");
        s=t;
    }

//    public static  void main(String args[]){
//        String[] inputArray=new String[]{"www","Lai","Offer","com"};
//        foo(inputArray.length);
//    }


    public static void foo(int n){
        if(n==0){
            System.out.print(n);
            return ;
        }
        foo(n-1);
        System.out.print(n);
    }
}
