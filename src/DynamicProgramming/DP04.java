package DynamicProgramming;

public class DP04 {
    static boolean targetSum(int nums[], int sum){
        boolean dp[][] = new boolean[nums.length + 1][sum + 1];
        for(int i = 0; i <= nums.length; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int v = nums[i - 1];
                if(v <= j){
                    dp[i][j] = dp[i - 1][j - v];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[nums.length][sum];
    }
    public static void main(String[] args) {
        int nums[] = {4, 2, 7, 1, 3};
        System.out.println(targetSum(nums, 10));
    }
}
