package DynamicProgramming;
import java.util.*;

// matrix chain multiplication
public class DP16 {
    static int mcmRec(int arr[], int i, int j){
        if(i == j){
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int cost1 = mcmRec(arr, i, k);
            int cost2 = mcmRec(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }
    static int mcmMem(int arr[], int i, int j, int dp[][]){
        if(i == j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int minCost = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            minCost = Math.min(minCost, cost1 + cost2 + cost3);
        }
        return minCost;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println(mcmRec(arr, 1, n- 1));
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], - 1);
        }
        System.out.println(mcmMem(arr, 1, n - 1, dp));
    }
}
