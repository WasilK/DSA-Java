package Graphs;
import java.util.*;

import static Graphs.Edge.cGTopSort;

//Topological sort using BFS
public class Graph08 {
    private static void calcIndeg(ArrayList<Edge> graph[], int indeg[]){
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    private static void topSortBfs(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < graph.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        cGTopSort(graph);
        topSortBfs(graph);
    }
}
