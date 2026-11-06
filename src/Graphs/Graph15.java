package Graphs;

import java.util.ArrayList;
import java.util.Collections;

import static Graphs.Edge.cGKruskals;

//Kruskal's algorithm
public class Graph15 {
    static int par[];
    static int rank[];
    static int find(int x){
        if(par[x] == x) return x;
        return par[x] = find(par[x]);
    }
    static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] > rank[parB]){
            par[parB] = parA;
        }else{
            par[parA] = parB;
        }
    }

    static void kruskalsAlgo(ArrayList<Edge> edges, int V){
        Collections.sort(edges, (a, b) -> a.wt - b.wt);
        par = new int[V];
        rank = new int[V];
        for(int i = 0; i < V; i++) par[i] = i;
        int count = 0;
        int mstCost = 0;
        for(int i = 0; i < V - 1; i++){
            Edge e = edges.get(i);
            if(par[e.src] != par[e.dest]){
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }
    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        cGKruskals(edges);
        kruskalsAlgo(edges, 4);
    }
}
