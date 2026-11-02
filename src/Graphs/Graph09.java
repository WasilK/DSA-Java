package Graphs;
import java.util.*;

import static Graphs.Edge.cGprintPaths;

//Print all paths
public class Graph09 {
    static void printPaths(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src == dest){
            System.out.println(path + dest);
            return;
        }
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printPaths(graph, e.dest, dest, path + src);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        cGprintPaths(graph);
        printPaths(graph, 4, 1, "");
    }
}
