package edu.laicode.exercise188;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.*;

class Test {

    public boolean exist(int[] array,int target){
       if(array==null || array.length<4){
       	return false;
       }

       Arrays.sort(array);

       Map<Integer,List<Integer>> dict=new HashMap<Integer,List<Integer>>();

       for(int j=1;j<array.length;j++){
       	 for(int i=0;i<j;i++){
       	 	int other=target-array[i]-array[j];

       	 	if(dict.containsKey(other) && dict.get(other).get(1)>0 && dict.get(other).get(1)<i){
       	 		return true;
       	 	}else if(!dict.containsKey(array[i]+array[j])){
       	 		dict.put(array[i]+array[j],Arrays.asList(i,j));
       	 	}
       	 }
       }

    	return false;
    }

//	int inf=(int)(1e8);
//	class Edge
//	{
//		int dest,weight;
//		Edge(int dest,int weight)
//		{
//			this.dest=dest;
//			this.weight=weight;
//		}
//	}
//	int GetShortestRoute(int road_nodes,int m,int a,int b,int c,int roades_from[],int roades_to[],int roads_weight[])
//	{
//		//a to c to c ->b
//		List<Edge>graph[]=new List[road_nodes+1];
//
//		for (int i=0;i<=road_nodes;i++)
//		{
//			graph[i]=new ArrayList<>();
//		}
//		HashMap<List<Integer>,Integer>hashMap=new HashMap<>();
//		for (int i=0;i<m;i++)
//		{
//			graph[roades_from[i]].add(new Edge(roades_to[i],roads_weight[i]));
//			hashMap.put(Arrays.asList(roades_from[i],roades_to[i]),roads_weight[i]);
//
//			graph[roades_to[i]].add(new Edge(roades_from[i],roads_weight[i]));
//			hashMap.put(Arrays.asList(roades_to[i],roades_from[i]),roads_weight[i]);
//		}
//		List<Integer>parentfirst=getParents(a,graph,c);
//		List<Integer>parentsecond=getParents(c,graph,b);
//		HashSet<List<Integer>>hashSet=new HashSet<>();
//		for(int i=0;i<parentfirst.size()-1;i++)
//		{
//			List<Integer>list=Arrays.asList(parentfirst.get(i),parentfirst.get(i+1));
//			Collections.sort(list);
//			hashSet.add(list);
//		}
//		for (int i=0;i<parentsecond.size()-1;i++)
//		{
//			List<Integer>list=(Arrays.asList(parentsecond.get(i),parentsecond.get(i+1)));
//			Collections.sort(list);
//			hashSet.add(list);
//		}
//		int ans=0;
//
//		for (List<Integer>list:hashSet)
//		{
//			ans+=hashMap.get(list);
//		}
//		return ans;
//	}
//	List<Integer>getParents(int source,List<Edge>graph[],int dest)
//	{
//		int n=graph.length;
//		int parent[]=new int[n];
//		Arrays.fill(parent,-1);
//		int distances[]=new int[n];
//
//		for (int i=0;i<n;i++)
//		{
//			distances[i]=inf;
//		}
//
//		distances[source]=0;
//		PriorityQueue<int[]>priorityQueue=new PriorityQueue<>((a,b)->(a[1]-b[1]));
//		priorityQueue.add(new int[]{source,0});
//		while (!priorityQueue.isEmpty())
//		{
//			int poll[]=priorityQueue.poll();
//			for (Edge next:graph[poll[0]])
//			{
//				int dists=poll[1]+next.weight;
//				if (distances[next.dest]>dists)
//				{
//					distances[next.dest]=dists;
//					parent[next.dest]=poll[0];
//					priorityQueue.add(new int[]{next.dest,distances[next.dest]});
//				}
//			}
//		}
//		List<Integer>list=new ArrayList<>();
//		while (dest!=-1)
//		{
//			list.add(0,dest);
//			dest=parent[dest];
//		}
//		return list;
//	}

	public static void main(String args[]){
		int[] array=new int[]{1,2,2,3,4};
		int target=9;

		Test test=new Test();
		boolean result=test.exist(array,target);

		//int road_nodes,int m,int a,int b,int c,int roades_from[],int roades_to[],int roads_weight[]
//		int[] roades_from=new int[]{0,0,1};
//		int[] roades_to=new int[]{2,1,2};
//		int[] roads_weight=new int[]{4,10,5};
//
//		int result =test.GetShortestRoute(3,3,0,2,1,roades_from,roades_to,roads_weight);
//
		System.out.println("result value is "+ result);
	}
}
