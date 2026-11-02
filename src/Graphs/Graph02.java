package Graphs;

import java.util.*;

import static Graphs.Edge.createGraph;

public class Graph02 {
    static void bfs(ArrayList<Edge> graph[]){ //O(V + E) T.C.
        boolean visited[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // we take source = 0 we can take any source

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(Edge e: graph[curr]){
                    q.add(e.dest);
                }
            }
        }
    }
    static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){ // O(V + E)
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){ // O(V + E)
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        createGraph(graph);
        bfs(graph);
        System.out.println();
        dfs(graph, 0, new boolean[7]);
        System.out.println();
        System.out.println(hasPath(graph, 1, 2, new boolean[7]));
    }
}
