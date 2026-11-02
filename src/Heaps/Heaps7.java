package Heaps;

import java.util.PriorityQueue;

public class Heaps7 {
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        public Row(int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public static void weakestSoldier(int arr[][], int k){
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr[0].length; j++){
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        for(int i = 0; i < k; i++){
            System.out.print("R" + pq.remove().idx + " ");
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
        weakestSoldier(arr, 2);
    }
}
