package Graphs;

public class Graph14 {
    static int par[];
    static int rank[];
    static int find(int x){
        if(par[x] == x) return x;
        return par[x] = find(par[x]);
    }
    static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] > rank[parB]){
            par[parB] = parA;
        }else{
            par[parA] = parB;
        }
    }
    public static void main(String[] args) {
        int n = 7;
        par = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++){
            par[i] = i;
        }
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        union(4, 5);
        System.out.println(find(4));
    }
}
