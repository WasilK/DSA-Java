package DynamicProgramming;

import java.util.*;

//longest increasing subsequence
public class DP10 {
    static int lcs(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(arr1[i - 1] == arr2[j - 1]){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
    static int lis(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int nums[] = new int[set.size()];
        int i = 0;
        for(int n : set){
            nums[i] = n;
            i++;
        }
        Arrays.sort(nums);
        return lcs(arr, nums);
    }
    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println(lis(arr));
    }
}
