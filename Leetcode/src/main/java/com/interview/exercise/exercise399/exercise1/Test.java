package com.interview.exercise.exercise399.exercise1;

import java.util.*;

public class Test {

    public double[] calcEquation(List<List<String>> equation,double[] values,List<List<String>> queries){
        Map<String,Map<String,Double>> graph=new HashMap<>();
        buildGraph(graph,equation,values);

        double[] res=new double[queries.size()];
        Arrays.fill(res,-1.0);

        int index=0;

        for(List<String> q:queries){
            String a=q.get(0);
            String b=q.get(1);

            if(!graph.containsKey(a) || !graph.containsKey(b)){
                index++;
                continue;
            }else{
                dfs(graph,a,b,res,index,new HashSet<>(),1.0);
                index++;
            }
        }

        return res;
    }

    private void dfs(Map<String,Map<String,Double>> graph,String a,String b,double[] res,int index,Set<String> visited,double tmp){
        visited.add(a);

        if(graph.get(a)==null || graph.get(a).size()==0){
            return ;
        }

        if(graph.get(a).containsKey(b)){
            res[index]=graph.get(a).get(b)*tmp;
            return;
        }

        for(String next:graph.get(a).keySet()){
            if(visited.contains(next)) continue;;
            dfs(graph,next,b,res,index,visited,graph.get(a).get(next)*tmp);
        }



    }

    private void buildGraph(Map<String,Map<String,Double>> graph,List<List<String>> equations,double[] values){
        int index=0;

        for(List<String> e:equations){
            String a=e.get(0);
            String b=e.get(1);

            graph.putIfAbsent(a,new HashMap<>());
            graph.putIfAbsent(b,new HashMap<>());


            graph.get(a).put(b,values[index]);
            graph.get(b).put(a,1.0/values[index]);
            index++;

            graph.get(a).put(a,1.0);
            graph.get(b).put(b,1.0);
        }

    }

    public static void main(String args[]){
        List<List<String>> list=new ArrayList();
        List<String> listequations=new ArrayList();
        listequations.add("a");
        listequations.add("b");
        list.add(listequations);

        List<String> listequations2=new ArrayList();
        listequations2.add("b");
        listequations2.add("c");

        list.add(listequations2);


        double[] values = {2.0,3.0};

        List<List<String>> queries=new ArrayList<>();

        List<String> listqueries1=new ArrayList();
        listqueries1.add("a");
        listqueries1.add("c");
        queries.add(listqueries1);

        List<String> listqueries2=new ArrayList();
        listqueries2.add("b");
        listqueries2.add("a");
        queries.add(listqueries2);


        List<String> listqueries3=new ArrayList();
        listqueries3.add("a");
        listqueries3.add("e");
        queries.add(listqueries3);

        List<String> listqueries4=new ArrayList();
        listqueries4.add("a");
        listqueries4.add("a");
        queries.add(listqueries4);

        List<String> listqueries5=new ArrayList();
        listqueries5.add("x");
        listqueries5.add("x");
        queries.add(listqueries5);

        Test test=new Test();
        Arrays.stream(test.calcEquation(list,values,queries)).forEach(System.out::println);

    }
}
