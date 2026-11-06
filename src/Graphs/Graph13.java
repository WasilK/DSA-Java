package Graphs;

import java.util.PriorityQueue;

//connecting cities with minimum cost
public class Graph13 {

    private static class Pair{
        int dest;
        int cost;
        Pair(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }
    }

    static int citiesWithMinimumCost(int cities[][]){
        boolean vis[] = new boolean[cities.length];
        int minCost = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.offer(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(!vis[curr.dest]){
                vis[curr.dest] = true;
                minCost += curr.cost;
                for(int i = 0; i < cities[curr.dest].length; i++){
                    if(cities[curr.dest][i] != 0){
                        pq.offer(new Pair(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        int cities[][] = {
                {0, 1, 2, 3, 4},
                {1, 0, 5, 0, 7},
                {2, 5, 0, 6, 0},
                {3, 0, 6, 0, 0},
                {4, 7, 0, 0, 0}
        };
        System.out.println(citiesWithMinimumCost(cities));
    }
}
