package Heaps;

import java.util.PriorityQueue;

public class Heaps5 {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;
        public Point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2){
           return this.distSq - p2.distSq;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        for(int i = 0; i < pts.length; i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], dist, i));
        }
        for(int i = 0; i < k; i++){
            System.out.print("C"+pq.remove().idx + " ");
        }
    }
}
