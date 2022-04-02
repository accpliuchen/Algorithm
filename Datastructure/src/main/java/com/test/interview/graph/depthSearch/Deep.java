package com.test.interview.graph.depthSearch;

//https://blog.csdn.net/Kangyucheng/article/details/76012920?utm_source=blogxgwz6
class Node{
    char ch;
    boolean visited;

    public Node(char ch,boolean visited){
        this.ch=ch;
        this.visited=visited;
    }

    public char getCh(){
        return ch;
    }

    public void setCh(char ch){
        this.ch=ch;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited=visited;
    }
}

class Graph{
    public int[][] graph;
    public int vexnum;
    public Node[] nodelist;


    public Graph(int vexnum) {
        this.vexnum = vexnum;

        graph = new int[vexnum][vexnum];

        addGraph(0, 1);
        addGraph(4, 1);
        addGraph(3, 1);
        addGraph(4, 5);
        addGraph(5, 6);
        addGraph(4, 0);
        addGraph(7, 2);
        addGraph(8, 1);

        nodelist = new Node[vexnum];
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int size = 0; size < vexnum; size++) {
            nodelist[size] = new Node(str.charAt(size), false);
        }
    }

    public void addGraph(int x,int y){
        if(x==y || x>vexnum || y>vexnum){
            return ;
        }else{
            graph[x][y]=1;
            graph[y][x]=1;
        }
    }

    public void PrintGraph(){
        String c="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print(" ");

        for(int j=0;j<vexnum;j++){
            System.out.print("   "+c.charAt(j));
        }
        System.out.println();

        for(int i=0;i<vexnum;i++){
            System.out.print(c.charAt(i)+" ");
            for(int j=0;j<vexnum;j++){
                System.out.printf("%3d ",graph[i][j]);
            }
            System.out.println();
        }
    }

    public void PrintNode(){
        for(int i=0;i<vexnum;i++){
            System.out.println(nodelist[i].ch);
        }
    }
}

public class Deep {
    int count=0;

    public static void main(String[] args) {
        Graph g=new Graph(9);
        g.PrintGraph();

        Deep deep=new Deep();
        deep.DFS_each(g,9);
        System.out.println();

        System.out.println("brench number is "+ deep.count);
    }



    public void DFS_each(Graph g,int i){
        System.out.println("Deep Iterator Order");

        for(int c=0;c<i;c++){
            if(g.nodelist[c].visited==false){
                DFS(g,c);
                count++;
            }
        }
    }

    public void DFS(Graph g,int i){
        System.out.print(g.nodelist[i].ch+" ");
        g.nodelist[i].setVisited(true);

        for(int j=0;j<g.vexnum;j++){
            if((g.graph[i][j]==1) && (g.nodelist[j].isVisited()==false)){
                DFS(g,j);
            }
        }
    }
}
