package DynamicProgramming;

public class DP01 {
    static int fibonacci(int n, int dp[]){ // memoization
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }
    static int fibonacciOne(int n){ // tabulation
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n, new int[n + 1]));
        System.out.println(fibonacciOne(6));
    }
}
