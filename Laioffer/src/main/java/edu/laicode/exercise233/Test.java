package edu.laicode.exercise233;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<List<Integer>> nqueen(int n){
        List<List<Integer>> result=new ArrayList<List<Integer>>();

        //queen on row i positioned
        List<Integer> cur=new ArrayList<Integer>();
        helper(n,cur,result);

        return result;
    }

    private void helper(int n,List<Integer> cur,List<List<Integer>> result){
        if(cur.size()==n){
           result.add(new ArrayList<Integer>(cur));
           return;
        }

        //col
        for(int i=0;i<n;i++){
              if(valid(cur,i)){
                cur.add(i);
                helper(n,cur,result);
                cur.remove(cur.size()-1);
              }
        }
    }

    private boolean valid(List<Integer> cur,int column){
        int row=cur.size();
        
        for(int i=0;i<row;i++){
            // 行列坐标的差
            if(cur.get(i)==column || Math.abs(cur.get(i)-column)==row-i){
                return false;
            }    
        
        }

        return true;
    }

    public static void main(String args[]){
       int N=4;
       Test test=new Test();
       List<List<Integer>> result=test.nqueen(N);

       System.out.println(result.size());
    }
}
