package com.interview.exercise.exercise609;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public List<List<String>> findDuplicate(String[] paths){
    	HashMap<String,List<String>> map=new HashMap<>();

        for(String path:paths){
        	String[] values=path.split(" ");

        	for (int i = 1; i < values.length; i++) {
                String[] name_cont = values[i].split("\\(");
                name_cont[1] = name_cont[1].replace(")", "");
                List < String > list = map.getOrDefault(name_cont[1], new ArrayList < String > ());
                list.add(values[0] + "/" + name_cont[0]);
                map.put(name_cont[1], list);
            }
        }

        List < List < String >> res = new ArrayList < > ();
        for (String key: map.keySet()) {
            if (map.get(key).size() > 1)
                res.add(map.get(key));
        }

    	return res;
    }

   
	public static void main(String args[]){
		String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

		Test test=new Test();

        List<List<String>> result=test.findDuplicate(paths);

        for(List<String> results: result){
        	for(String str:results){
        		System.out.println(str);
        	}
        }
	}
}
