package Graphs;
import java.util.*;

// Connected Components
// when there is a graph but disjoint.

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph03 {
    static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i< graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }
    static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(graph[0].get(0).src);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                vis[curr] = true;
                System.out.print(curr + " ");
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                dfsUtil(graph, i, vis);
            }
        }
    }
    static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {

    }
}
