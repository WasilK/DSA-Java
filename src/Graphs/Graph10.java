package Graphs;

import java.util.*;

import static Graphs.Edge.cGDijkstra;

public class Graph10 { // Pair class to store node and path from source
    static class Pair{
        int n;
        int path;
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
    }
    static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i = 0; i < dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.path - b.path); // smaller path comes first
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(!vis[curr.n]){
                for(int i = 0; i < graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.offer(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i = 0; i < dist.length; i++){
            if(dist[i] == Integer.MAX_VALUE) dist[i] = -1; // if there is no path from src to this node
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        cGDijkstra(graph);
        dijkstra(graph, 0);
    }
}
