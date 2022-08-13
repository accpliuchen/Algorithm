package edu.laicode.exercise651;


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class Test {

    public List<Integer> common(int[] a,int[] b){
    	List<Integer> result=new ArrayList<>();

    	if(a.length==0 || b.length==0){
    		return result;
    	}

    	HashMap<Integer,Integer> map=new HashMap<>();
    	int count=0;

    	if(a.length<=b.length){
    		putInMap(a,map);
            findHelper(b,map,count,a.length,result);
    	}else{
			putInMap(b,map);
			findHelper(a,map,count,b.length,result);
    	}

    	result.sort(Comparator.naturalOrder());

    	return result;
    }


    private void findHelper(int[] array,HashMap<Integer,Integer> map,int count,int len,List<Integer> result){
    	for(int num:array){
    		if(count==len){
    			break;
    		}

    		if(map.containsKey(num)){
    			result.add(num);
    			++count;
    			map.put(num,map.get(num)-1);

    			if(map.get(num)==0){
    				map.remove(num);
    			}
    		}
    	}
    }
    

    private void putInMap(int[] array,HashMap<Integer,Integer> map){
    	for(int num:array){
    		map.put(num,map.getOrDefault(num,0)+1);
    	}
    }

	public static void main(String args[]){
		int[] a=new int[]{1,2,3,2};
		int[] b=new int[]{3,4,2,2,2};

		Test test=new Test();
		List<Integer> result=test.common(a,b);

        for(int nums:result){
        	System.out.println(nums);
        }
	}
}
