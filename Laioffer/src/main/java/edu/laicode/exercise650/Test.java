package edu.laicode.exercise650;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Comparator;

public class Test {

    public List<Integer> common(int[] a,int[] b){
    	List<Integer> ans=new ArrayList<>();

    	if(a.length==0 || b.length==0){
    		return ans;
    	}

    	Set<Integer> set=new HashSet<>();
    	int cnt=0;

    	if(a.length<=b.length){
          	putInSet(set,a);
          	findHelper(b,set,ans,cnt);
    	}else{
    		putInSet(set,b);
    		findHelper(a,set,ans,cnt);
    	}


    	ans.sort(Comparator.naturalOrder());

    	return ans;
    }

    private void findHelper(int[] array,Set<Integer> set,List<Integer> ans,int cnt){
    	for(int num:array){
    		if(cnt==set.size()){
    			break;
    		}

    		if(set.contains(num)){
    			ans.add(num);
    			++cnt;
    		}
    	}
    }

    private void putInSet(Set<Integer> set,int[] a){
    	for(int num:a){
    		set.add(num);
    	}
    }

	public static void main(String args[]){
		int[] a=new int[]{1,2,3};
		int[] b=new int[]{3,1,4};

        Test test=new Test();

        List<Integer> result=test.common(a,b);

        for(int nums:result){
        	System.out.println(nums);
        }
	}
}
