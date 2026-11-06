package Graphs;
import java.util.*;

import static Graphs.Edge.cGbellmanFord;
import static Graphs.Edge.cGbellmanFordTwo;

public class Graph11 {
    static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        dist[src] = 0;
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph.length; j++){
                for(int k = 0; k < graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(u != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for(int i = 0; i < graph.length; i++){
            if(dist[i] == Integer.MAX_VALUE) dist[i] = -1;
            System.out.print(dist[i] + " ");
        }
    }
    static void bellmanFordTwo(ArrayList<Edge> graph, int src, int V){
        int dist[] = new int[V];
        for(int i = 0; i < V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        dist[src] = 0;
        for(int i = 0; i < V; i++){
            for(int j = 0; j < graph.size(); j++){
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(u != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }
        for(int i = 0; i < V; i++){
            if(dist[i] == Integer.MAX_VALUE) dist[i] = -1;
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        cGbellmanFord(graph);
        bellmanFord(graph, 0);
        System.out.println();
        ArrayList<Edge> graphOne = new ArrayList<>();
        cGbellmanFordTwo(graphOne);
        bellmanFordTwo(graphOne, 0, 5);
    }
}
