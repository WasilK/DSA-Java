package DynamicProgramming;

//rod cutting
public class DP07 {
    static int rodCutting(int length[], int prices[], int rodLength){
        int dp[][] = new int[prices.length + 1][rodLength + 1];

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int p = prices[i - 1];
                int w = length[i - 1];
                if(w <= j){
                    dp[i][j] = Math.max(p + dp[i][j - w], dp[i - 1][j]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[prices.length][rodLength];
    }
    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;
        System.out.println(rodCutting(length, prices, rodLength));
    }
}
