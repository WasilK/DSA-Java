package Graphs;
import java.util.*;
import static Graphs.Edge.cGIsCycleDirectedOne;
import static Graphs.Edge.cGIsCycleDirectedTwo;

//Detect cycle for directed graph using DFS
public class Graph06 { // O(V + E) TC
    static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(isCycleUtil(graph, vis, stack, i)){
                return true;
            }
        }
        return false;
    }
    static boolean isCycleUtil(ArrayList<Edge> graph[], boolean vis[], boolean stack[], int curr){
        vis[curr] = true;
        stack[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            else if(!vis[e.dest] && isCycleUtil(graph, vis, stack, e.dest)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> g1[] = new ArrayList[4];
        cGIsCycleDirectedOne(g1);
        System.out.println(isCycle(g1));
        ArrayList<Edge> g2[] = new ArrayList[4];
        cGIsCycleDirectedTwo(g2);
        System.out.println(isCycle(g2));
    }
}
