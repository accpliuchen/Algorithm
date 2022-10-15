package com.interview.exercise.exercise93;

import java.util.List;
import java.util.ArrayList;

public class Test {

    List<String> result=new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(s,new StringBuilder(),3,0);
        return result;
    }


    private void dfs(String s,StringBuilder cur,int dotLeft,int index){
        if(dotLeft==0){
            if(valid(s.substring(index))){
                cur.append("."+s.substring(index));
                result.add(cur.toString());
            }
            return;
        }

        for(int right=index;right<s.length();right++){
            if(valid(s.substring(index,right+1))){
                int length=cur.length();

                if(dotLeft==3){
                    cur.append(s.substring(index,right+1));
                    dfs(s,cur,dotLeft-1,right+1);
                    cur.setLength(length);
                }else{
                    cur.append("."+s.substring(index,right+1));
                    dfs(s,cur,dotLeft-1,right+1);
                    cur.setLength(length);
                }
            }
        }
    }

    private boolean valid(String s){
        if(s.length()>3) return false;
        if(s.length()<1) return false;

        if(s.charAt(0)=='0' && s.length()>1) return false;
        if(Integer.valueOf(s)>255) return false;
        return true;
    }
	public static void main(String args[]){
		String str = "25525511135";

		Test test=new Test();

		List<String> result=test.restoreIpAddresses(str);
		
		for(String res:result){
			System.out.println(res);
		}
	}
}
