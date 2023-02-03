package edu.laicode.exercise398;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Test {

	public List<Integer> allAnagrams(String sh, String lo) {
		// Write your solution here
		List<Integer> result=new ArrayList<>();

		if(lo.length()==0){
			return result;
		}

		if(sh.length()>lo.length()){
			return result;
		}

		Map<Character,Integer> map=countMap(sh);

		int match=0;

		for(int i=0;i<lo.length();i++){
			char temp=lo.charAt(i);
			Integer count=map.get(temp);
			if(count!=null){
				map.put(temp,count-1);

				if(count==1){
					match++;
				}
			}

			if(i>=sh.length()){
				temp=lo.charAt(i-sh.length());
				count=map.get(temp);

				if(count!=null){
					map.put(temp,count+1);
					if(count==0){
						match--;
					}
				}
			}

			if(match==map.size()){
				result.add(i-sh.length()+1);
			}


		}
		return result;
	}


	private Map<Character,Integer> countMap(String s){
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		for(char ch:s.toCharArray()){
			Integer count=map.get(ch);
			if(count==null){
				map.put(ch,1);
			}else{
				map.put(ch,count+1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
        String lo = "abcbac";
        String sh = "ab";

        Test test = new Test();

        List<Integer> result = test.allAnagrams(sh, lo);

        for (Integer items : result) {
            System.out.println(items);
        }

    }
}
