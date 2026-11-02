package Greedy;
import java.util.*;

public class Greedy2 {
    public static int fractionalKnapsack(int weight[], int value[], int W){
        double ratio[][] = new double[value.length][2];
        for(int i = 0; i < ratio.length; i++){
            ratio[i][0] = i;
            ratio[i][1] =  (double)value[i] / weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int finalVal = 0;

        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){
                finalVal += value[idx];
                capacity -= weight[idx];
            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int W = 50;
        System.out.println(fractionalKnapsack(weight, value, W));
    }
}
