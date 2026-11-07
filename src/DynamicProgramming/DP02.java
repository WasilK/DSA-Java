package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

// climbing stairs
public class DP02 {
    static int climbingStairsRecursion(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return climbingStairsRecursion(n - 1) + climbingStairsRecursion(n - 2);
    }
    static int climbingStairsMemoisation(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = climbingStairsRecursion(n - 1) + climbingStairsRecursion(n - 2);
    }
    static int climbingStairs(int n, int dp[]){ // variation with 3 steps
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = climbingStairs(n - 1, dp) + climbingStairs(n - 2, dp) + climbingStairs(n - 3, dp);
    }
    static int climbingStairsTabulation(int n){
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingStairsRecursion(n));
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbingStairsMemoisation(n, dp));
//        System.out.println(climbingStairs(n, dp));
        System.out.println(climbingStairsTabulation(n));
    }
}
