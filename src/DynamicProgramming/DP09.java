package DynamicProgramming;

//longest common substring
public class DP09 {
    static int lcs(String str1, String str2, int n, int m){
        int ans = 0;
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(str1.charAt(i - 1) == str2.charAt(i - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABGCE";
        int n = s1.length();
        int m = s2.length();
        System.out.println(lcs(s1, s2, n, m));
    }
}
