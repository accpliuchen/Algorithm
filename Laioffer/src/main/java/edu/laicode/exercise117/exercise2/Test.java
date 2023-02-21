package edu.laicode.exercise117.exercise2;

public class Test {

    static{
        System.out.println("static");
    }

    public Test(){
        System.out.println("Construct Test");
    }

    static void add(){
        System.out.println("static add");
    }

    public static void main(String args[]){
        Test test=new Test();
    }
}
