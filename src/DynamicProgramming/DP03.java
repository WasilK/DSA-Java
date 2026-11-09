package DynamicProgramming;

public class DP03 {
    static int knapsackRec(int wt[], int val[], int W, int n){
        if(n == 0 || W == 0){
            return 0;
        }
        if(wt[n - 1] <= W){
            //include
            int ans1 = val[n - 1] + knapsackRec(wt, val, W - wt[n - 1], n - 1);
            //exclude
            int ans2 = knapsackRec(wt, val, W, n - 1);
            return Math.max(ans1, ans2);
        }else{
            return knapsackRec(wt, val, W, n - 1);
        }
    }
    static int knapsackMem(int wt[], int val[], int W, int n, int dp[][]){
        if(n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n - 1] <= W){
            int ans1 = val[n - 1] + knapsackMem(wt, val, W - wt[n - 1], n - 1, dp);
            int ans2 = knapsackMem(wt, val, W, n - 1, dp);
            return dp[n][W] = Math.max(ans1, ans2);
        }else{
            return dp[n][W] = knapsackMem(wt, val, W, n - 1, dp);
        }
    }
    static int knapsackTab(int val[], int wt[], int W){
        int dp[][] = new int[val.length + 1][W + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int v = val[i - 1];
                int w = wt[i - 1];
                if(w <= j){
                    int incP = v + dp[i - 1][j - w];
                    int excP = dp[i - 1][j];
                    dp[i][j] = Math.max(incP, excP);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[val.length][W];
    }
    public static void main(String[] args) {
        int wt[] = {2, 5, 1, 3, 4};
        int val[] = {15, 14, 10, 45, 30};
        int W = 7;
        System.out.println(knapsackRec(wt, val, W, val.length));
//        int dp[][] = new int[val.length + 1][W + 1];
//        for(int i = 0; i < dp.length; i++){
//            for(int j = 0; j < dp[0].length; j++){
//                dp[i][j] = -1;
//            }
//        }
//        System.out.println(knapsackMem(wt, val, W, val.length, dp));
        System.out.println(knapsackTab(val, wt, W));
    }
}
