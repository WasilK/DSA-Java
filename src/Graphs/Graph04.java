package Graphs;
import java.util.*;

import static Graphs.Edge.createGraph;
import static Graphs.Edge.createGraphOne;

// Detect cycle

public class Graph04 {
    private static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            } else if(vis[e.dest] && e.dest != par){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        createGraph(graph);
        System.out.println(detectCycle(graph));

        ArrayList<Edge> g[] = new ArrayList[3];
        createGraphOne(g);
        System.out.println(detectCycle(g));
    }
}
