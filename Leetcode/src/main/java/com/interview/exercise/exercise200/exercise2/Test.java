package com.interview.exercise.exercise200.exercise2;


class UnionFind{
    private int[] parent;
    private int[] rank;

    public UnionFind(int n){
        parent=new int[n];
        rank=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }
    }

    public int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);

        if(rootX!=rootY){
            if(rank[rootX]>rank[0]){
                parent[rootY]=rootX;
            }else if(rank[rootX]<rank[rootY]){
                parent[rootX]=rootY;
            }else{
                parent[rootY]=rootX;
                rank[rootX]++;
            }
        }

    }

}
public class Test {

    public static void main(String args[]){
        int n=5;

        UnionFind uf=new UnionFind(n);

        uf.union(0,1);
        uf.union(1,2);
        uf.union(3,4);

        System.out.println("===");

        System.out.println(uf.find(1)==uf.find(2));
        System.out.println(uf.find(1)==uf.find(3));
    }
}
