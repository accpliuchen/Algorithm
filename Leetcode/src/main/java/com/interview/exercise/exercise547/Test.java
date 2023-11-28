package com.interview.exercise.exercise547;

class UnionFind{
    int[] parent;
    int[] rank;

    public UnionFind(int size){
        parent=new int[size];

        for(int i=0;i<size;i++){
            parent[i]=i;
        }
        rank=new int[size];
    }

    public int find(int x){
        if(parent[x]!=x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union_set(int x,int y){
        int xset=find(x);
        int yset=find(y);

        if(xset==yset){
            return;
        }else if(rank[xset]<rank[yset]){
            parent[xset]=yset;
        }else if(rank[xset]>rank[yset]){
            parent[yset]=xset;
        }else{
            parent[yset]=xset;
            rank[xset]++;
        }

    }

}


public class Test {

    public int findCircleNum(int[][] isConnected){
        int n=isConnected.length;
        UnionFind dsu=new UnionFind(n);
        int numberOfComponents=n;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1 && dsu.find(i)!=dsu.find(j)){
                    numberOfComponents--;
                    dsu.union_set(i,j);
                }
            }
        }

        return numberOfComponents;
    }

    public static void main(String args[]){
        int[][] isConnected=new int[][]{{1,1,0},{1,1,0},{0,0,1}};

        Test test=new Test();
        int result=test.findCircleNum(isConnected);

        System.out.println(result);
    }
}



