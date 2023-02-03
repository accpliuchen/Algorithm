package edu.laicode.exercise67;

import java.util.*;

public class Test {

public List<String> topKFrequent(String[] combo, int k) {
    // Write your solution here
   Map<String, Integer> myMap = buildMap(combo);

    //build minHeap
	PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<Map.Entry<String,Integer>>(k,new Comparator<Map.Entry<String, Integer>>(){
	@Override
	public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
//	if(e1.getValue() == e2.getValue()){
//	return 0;
//}else if(e1.getValue() < e2.getValue()){
//	return -1;
//}else{
//	return 1;
//}

		return e1.getValue().compareTo(e2.getValue());
}
});

	//add k elements
	for(Map.Entry<String, Integer> entry : myMap.entrySet()){
minHeap.offer(entry);
if(minHeap.size() > k){
		minHeap.poll();
}
}
//minHeap to String[]
return toList(minHeap);
}


private Map<String, Integer> buildMap(String[] combo){
	Map<String, Integer> hashMap = new HashMap<>();
	for(String str : combo){
	if(hashMap.containsKey(str)){
		Integer value = hashMap.get(str);
	hashMap.put(str, value + 1);
}else{
	hashMap.put(str, 1);
}
}
return hashMap;
}

    // private List<String> toList(PriorityQueue<Map.Entry<String,Integer>> minHeap){
    //     List<String> result=new ArrayList<>();
    //     int size=minHeap.size()-1;
    //      for(int i=size;i>=0;i--){
    //     //for(int i=0;i>=size;i++){
    //         System.out.println("poll  " + minHeap.peek().getKey());
    //         result.add(minHeap.poll().getKey());
    //     }
    //     return result;
    // }


    private List<String> toList(PriorityQueue<Map.Entry<String,Integer>> minHeap){
        List<String> result=new ArrayList<>();
        int size=minHeap.size()-1;
        //for(int i=size;i>=0;i--){
        for(int i=0;i>=size;i++){
            //System.out.println("poll  " + minHeap.peek().getKey());
            result.add(minHeap.poll().getKey());
        }

        Collections.sort(result, Collections.reverseOrder());
        return result;
    }

private String[] toStringArray(PriorityQueue<Map.Entry<String, Integer>> minHeap){
	String[] res = new String[minHeap.size()];
	for(int i=minHeap.size()-1; i>=0; i--){
		res[i] = minHeap.poll().getKey();
}
return res;
}

	public static void main(String args[]){
//		String[] combo={"a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};
		String[] combo={"i","love","leetcode","i","love","coding"};
		int k=2;

		Test test=new Test();
		List<String> result=test.topKFrequent(combo,k);

		for(String str:result){
			System.out.println(str);
		}
	}
}
