package Graphs;
import java.util.*;

import static Graphs.Edge.cGTopSort;

//Topological Sorting using dfs
public class Graph07 {
    private static void topSort(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    private static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        cGTopSort(graph);
        topSort(graph);
    }
}
