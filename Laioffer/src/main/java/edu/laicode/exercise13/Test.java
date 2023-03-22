package edu.laicode.exercise13;

public class Test {

    public long power(int a, int b) {

        //base case
        if(b==0){
            return 1;
        }else if(a==1){
            return a;
        }

        //recursive rule
        long halfResult=power(a,b/2);

        if(b%2==0){
            return halfResult*halfResult;
        }else{
            return halfResult*halfResult*a;
        }

    }
    public static void main(String args[]){

        Test test=new Test();
        long result=test.power(2,4);


        System.out.println(result);
    }
}
