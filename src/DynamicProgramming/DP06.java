package DynamicProgramming;
// coin change - count total ways
public class DP06 {
    static int coinChange(int coins[], int amount){
        int dp[][] = new int[coins.length + 1][amount + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int v = coins[i - 1];
                if(v <= j){
                    dp[i][j] = dp[i][j - v] + dp[i - 1][j];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
    static int coinChangeOneD(int coins[], int amount){
        int dp[] = new int[amount + 1];
        dp[0] = 1;
        for(int coin : coins){
            for(int i = coin; i <= amount; i++){
                dp[i] += dp[i - coin];
            }
        }

        for(int i = 0; i < dp.length; i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println("Length " + dp.length);
        return dp[amount];
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        System.out.println(coinChange(coins, 4));
        System.out.println(coinChangeOneD(coins, 4));
    }
}
