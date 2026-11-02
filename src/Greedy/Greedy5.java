package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Greedy5 {
    public static void indianCoins(int coins[], int amount){
        Arrays.sort(coins);
        int countOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = coins.length - 1; i >= 0; i--){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("max count = " + countOfCoins);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        indianCoins(coins, 590);
    }
}
