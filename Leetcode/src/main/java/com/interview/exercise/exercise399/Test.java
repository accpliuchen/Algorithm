package com.interview.exercise.exercise399;

import java.util.*;
import java.util.Map.Entry;


//https://www.youtube.com/watch?v=u9LE_7apB38
public class Test {

    private Map<String,Node> graph=new HashMap<>();

    class Node{
        String var;
        double path=1d;
        Map<Node,Double> neighbors=new HashMap<>();

        public Node(String var){
            this.var=var;
        }

        @Override
        public boolean equals(Object o){
            return var.equals(((Node)o).var);
        }

        @Override
        public int hashCode() {
            return var.hashCode();
        }

        @Override
        public String toString() {
            return "Node:"+var;
        }

    }

    public double[] calcEquation(List<List<String>> equations,double[] values, List<List<String>> queries) {

        Map<String,Map<String,Double>> map=new HashMap<>();

        buildGraph(map,equations,values);

//        for (int i = 0; i < equations.size(); ++i) {
//            String x = equations.get(i).get(0);
//            String y = equations.get(i).get(1);
//
//            System.out.println(x);
//            System.out.println(y);
//        }
//
//        for (int i = 0; i < queries.size(); ++i) {
//            String x = queries.get(i).get(0);
//            String y = queries.get(i).get(1);
//
//            System.out.println(x);
//            System.out.println(y);
//        }

        double[] result=new double[queries.size()];
        Arrays.fill(result,-1.0);

        int index=0;
        for(List<String> q:queries){
            String a=q.get(0);
            String b=q.get(1);



            if(!map.containsKey(a) || !map.containsKey(b)){
                index++;
                continue;
            }else{
//                System.out.println("==========="+ a);
//                System.out.println("==========="+ b);

                dfs(map,a,b,result,index,new HashSet<>(),1.0);
                index++;
            }

            System.out.println("");
        }

        return result;
    }

    private void dfs(Map<String,Map<String,Double>> map,String a, String b, double[] result,int index,Set<String> visited,double temp){
          visited.add(a);

          if(map.get(a)==null || map.get(a).size()==0) return ;

        if(map.get(a).containsKey(b)){
            result[index]=map.get(a).get(b) * temp;
            return;
        }

        for(String next: map.get(a).keySet()){
            if(visited.contains(next)) continue;
            dfs(map,next,b,result,index,visited,map.get(a).get(next)* temp);
        }
    }

    private void buildGraph(Map<String,Map<String,Double>> graph,List<List<String>> equations,double[] values){
        int index=0;

        for(List<String> list:equations){
            String a=list.get(0);
            String b=list.get(1);


//            System.out.println("==========="+ a);
//            System.out.println("==========="+ b);

            graph.putIfAbsent(a,new HashMap<>());
            graph.putIfAbsent(b,new HashMap<>());

            graph.get(a).put(b,values[index]);
            graph.get(b).put(a,1.0/values[index]);

            graph.get(a).put(a,1.0);
            graph.get(a).put(b,1.0);


            index++;
        }


        System.out.println("");
    }

    public static void main(String[] args) {
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

        //equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]

        Test test=new Test();
        double[] array=test.calcEquation(list,values,queries);

        System.out.println("array size is "+array.length);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
