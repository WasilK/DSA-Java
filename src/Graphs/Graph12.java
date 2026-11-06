package Graphs;

import java.util.*;

import static Graphs.Edge.cGprims;

public class Graph12 {
    private static class Pair{
        int v;
        int cost;
        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
    }
    static void primsAlgo(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        int minCost = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                minCost += curr.cost;
                for(int i = 0; i < graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.offer(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("Minimum cost: " + minCost);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        cGprims(graph);
        primsAlgo(graph);
    }
}
