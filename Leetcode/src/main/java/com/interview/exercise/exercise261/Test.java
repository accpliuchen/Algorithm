package com.interview.exercise.exercise261;


class UnionFind{
    private int[] parent;
    private int[] size;


    public UnionFind(int n){
        parent=new int[n];
        size=new int[n];

        for(int node=0;node<n;node++){
            parent[node]=node;
            size[node]=1;
        }
    }

    public int find(int A){
        int root=A;
        while(parent[root]!=root){
            root=parent[root];
        }

        while(A!=root){
            int oldRoot=parent[A];
            parent[A]=root;
            A=oldRoot;
        }
        return root;
    }

    public boolean union(int A,int B){
        int rootA=find(A);
        int rootB=find(B);

        if(rootA==rootB){
            return false;
        }

        if(size[rootA]<size[rootB]){
            parent[rootA]=rootB;
            size[rootB]+=size[rootA];
        }else{
            parent[rootB]=rootA;
            size[rootA]+=size[rootB];
        }

        return true;
    }

}
public class Test {

    public boolean validTree(int n,int[][] edges){

        if(edges.length!=n-1) return false;

        UnionFind unionFind=new UnionFind(n);

        for(int[] edge:edges){
            int A=edge[0];
            int B=edge[1];

            if(!unionFind.union(A,B)){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        int n=5;
        int[][] edges=new int[][]{{0,1},{0,2},{0,3},{1,4}};


        Test test=new Test();
        boolean result=test.validTree(n,edges);

        System.out.println(result);

    }
}
