package com.test.interview.graph.depthSearch;

import java.util.ArrayList;
import java.util.LinkedList;

//https://zhuanlan.zhihu.com/p/130808366
public class DepthSearch {
    private ArrayList vertexList;//存储点的链表
    private int[][] edges;//邻接矩阵，用来存储边
    private int numOfEdges;//边的数目

    public DepthSearch(int n){
        edges=new int[n][n];
        vertexList=new ArrayList(n);
        numOfEdges=0;
    }

    //得到结点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //得到边的数目
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //返回结点i的数据
    public Object getValueByIndex(int i) {
        return vertexList.get(i);
    }

    //返回v1,v2的权值
    public int getWeight(int v1,int v2) {
        return edges[v1][v2];
    }

    //插入结点
    public void insertVertex(Object vertex) {
        vertexList.add(vertexList.size(),vertex);
    }

    //插入结点
    public void insertEdge(int v1,int v2,int weight) {
        edges[v1][v2]=weight;
        numOfEdges++;
    }

    //删除结点
    public void deleteEdge(int v1,int v2) {
        edges[v1][v2]=0;
        numOfEdges--;
    }

    //得到第一个邻接结点的下标
    public int getFirstNeighbor(int index) {
        for(int j=0;j<vertexList.size();j++) {
            if (edges[index][j]>0) {
                return j;
            }
        }
        return -1;
    }

    //根据前一个邻接结点的下标来取得下一个邻接结点
    public int getNextNeighbor(int v1,int v2) {
        for (int j=v2+1;j<vertexList.size();j++) {
            if (edges[v1][j]>0) {
                return j;
            }
        }
        return -1;
    }

    private void depthFirstSearch(boolean[] isVisited,int  i) {
        System.out.print(getValueByIndex(i)+"  ");
        isVisited[i]=true;

        int w=getFirstNeighbor(i);

        while (w!=-1) {
            if (!isVisited[w]) {
                depthFirstSearch(isVisited,w);//深搜
            }
            w=getNextNeighbor(i, w);
        }
    }

    //对外公开函数，深度优先遍历，与其同名私有函数属于方法重载
    public void depthFirstSearch() {
        boolean[] isVisited=new boolean[getNumOfVertex()];

        for (int i=0;i<getNumOfVertex();i++) {
            isVisited[i]=false;//把所有节点设置为未访问
        }

        for(int i=0;i<getNumOfVertex();i++) {
            //因为对于非连通图来说，并不是通过一个结点就一定可以遍历所有结点的。
            if (!isVisited[i]) {
                depthFirstSearch(isVisited,i);
            }
        }
    }

    public static void main(String[] args) {

        int n=8,e=9;//分别代表结点个数和边的数目
        String labels[]={"1","2","3","4","5","6","7","8"};//结点的标识
        DepthSearch graph=new DepthSearch(n);
        for(String label:labels) {
            graph.insertVertex(label);//插入结点
        }
        //插入九条边
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);
        graph.insertEdge(3, 7, 1);
        graph.insertEdge(4, 7, 1);
        graph.insertEdge(2, 5, 1);
        graph.insertEdge(2, 6, 1);
        graph.insertEdge(5, 6, 1);
        graph.insertEdge(1, 0, 1);
        graph.insertEdge(2, 0, 1);
        graph.insertEdge(3, 1, 1);
        graph.insertEdge(4, 1, 1);
        graph.insertEdge(7, 3, 1);
        graph.insertEdge(7, 4, 1);
        graph.insertEdge(6, 2, 1);
        graph.insertEdge(5, 2, 1);
        graph.insertEdge(6, 5, 1);

        System.out.println("深度优先搜索序列为：");
        graph.depthFirstSearch();
        System.out.println();
        System.out.println("广度优先搜索序列为：");
       // graph.broadFirstSearch();
    }
}
