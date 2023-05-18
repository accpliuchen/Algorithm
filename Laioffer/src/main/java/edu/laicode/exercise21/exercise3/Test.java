package edu.laicode.exercise21.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test {

    public List<List<Integer>> minminumAbsDifferent(int[] array){
        Arrays.sort(array);

        int diff=Integer.MAX_VALUE;


        for(int i=1;i<array.length-1;i++){
            if(array[i]-array[i-1]<diff){
                diff=array[i]-array[i-1];
            }
        }

        List<List<Integer>> list=new ArrayList<>();

        for(int j=1;j<array.length;j++){
            List<Integer> ls=new ArrayList<>();
            if(array[j]-array[j-1]==diff) {
                ls.add(array[j - 1]);
                ls.add(array[j]);
                list.add(ls);
            }
        }

        return list;
    }

    public static void main(String args[]){

        int[] array=new int[]{3,8,-10,23,19,-4,-14,27};

        Test test=new Test();

        List<List<Integer>> result=test.minminumAbsDifferent(array);


        System.out.println(result);

    }
}
